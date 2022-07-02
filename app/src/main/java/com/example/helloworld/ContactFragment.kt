package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.google.gson.Gson
import java.io.IOException
import java.time.temporal.TemporalAdjusters.next


class ContactFragment : Fragment(), View.OnClickListener {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    lateinit var testdata : TelData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun initRecycler() {


    }


    private fun getJsonData(filename: String): TelData? {
        val assetManager = resources.assets
        var result: TelData? = null
        try {
            val inputStream = assetManager.open(filename)
            val reader = inputStream.bufferedReader()
            val gson = Gson()
            result = gson.fromJson(reader, TelData::class.java)
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return result
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        testdata = getJsonData("jsons/data.json")!!
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initRecycler()
        recyclerViewAdapter = RecyclerViewAdapter(testdata!!)
        val recview = getView()?.findViewById<RecyclerView>(R.id.recyclerlist)
        val addbutton = getView()?.findViewById<Button>(R.id.addContact)
        val delbutton = getView()?.findViewById<Button>(R.id.delContact)
        recview?.adapter = recyclerViewAdapter

        recyclerViewAdapter.setOnItemClickListener(object : RecyclerViewAdapter.OnItemClickListener{
            override fun onItemClick(v: View, data: phoneData, pos : Int) {
                Log.i(data.name,"온클릭")
            }
        })
        addbutton!!.setOnClickListener(this)
        delbutton!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.addContact -> {
                Log.i("addContact","온클릭")
                val addFragment = ContactAddFragment()
                val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
                transaction.replace(R.id.fl_con, addFragment)
                transaction.commit()
            }
            R.id.delContact -> {
                Log.i("delContact","온클릭")
            }
        }
    }

}




