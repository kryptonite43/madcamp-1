package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ContactFragment : Fragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    val datalist = mutableListOf<phoneData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initRecycler()
    }
//        private fun initRecycler() {
//        recyclerViewAdapter = RecyclerViewAdapter(this)
//        val recview = findViewById<RecyclerView>(R.id.recyclerlist)
//        recview.adapter = recyclerViewAdapter
//        datalist.apply {
//            add(phoneData(name="mary", phone="010-0000-0000"))
//            add(phoneData(name="john", phone="010-1223-0000"))
//            add(phoneData(name="jenny", phone="010-0000-4342"))
//            add(phoneData(name="mary", phone="010-0000-0000"))
//            add(phoneData(name="john", phone="010-1223-0000"))
//            add(phoneData(name="jenny", phone="010-0000-4342"))
//            add(phoneData(name="mary", phone="010-0000-0000"))
//            add(phoneData(name="john", phone="010-1223-0000"))
//            add(phoneData(name="jenny", phone="010-0000-4342"))
//            add(phoneData(name="mary", phone="010-0000-0000"))
//            add(phoneData(name="john", phone="010-1223-0000"))
//            add(phoneData(name="jenny", phone="010-0000-4342"))
//            add(phoneData(name="mary", phone="010-0000-0000"))
//            add(phoneData(name="john", phone="010-1223-0000"))
//            add(phoneData(name="jenny", phone="010-0000-4342"))
//
//            recyclerViewAdapter.datalist = datalist
//            recyclerViewAdapter.notifyDataSetChanged()
//        }
//    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }


}