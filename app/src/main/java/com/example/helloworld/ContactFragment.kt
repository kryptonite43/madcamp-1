package com.example.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.databinding.ActivityMainBinding
import com.google.gson.Gson
import java.io.IOException


class ContactFragment : Fragment() {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    lateinit var testdata : TelData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun initRecycler() {
        recyclerViewAdapter = RecyclerViewAdapter(testdata!!)
        val recview = getView()?.findViewById<RecyclerView>(R.id.recyclerlist)
        recview?.adapter = recyclerViewAdapter
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
        initRecycler()
    }


}