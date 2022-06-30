package com.example.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ContactFragment : Fragment() {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter
    val datalist = mutableListOf<phoneData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun initRecycler() {
        recyclerViewAdapter = RecyclerViewAdapter()
        val recview = getView()?.findViewById<RecyclerView>(R.id.recyclerlist)
        recview?.adapter = recyclerViewAdapter

        datalist.apply {
            add(phoneData(name="mary", phone="010-0000-0000"))
            add(phoneData(name="john", phone="010-1223-0000"))
            add(phoneData(name="jenny", phone="010-0000-4342"))
            add(phoneData(name="mary", phone="010-0000-0000"))
            add(phoneData(name="john", phone="010-1223-0000"))
            add(phoneData(name="jenny", phone="010-0000-4342"))
            add(phoneData(name="mary", phone="010-0000-0000"))
            add(phoneData(name="john", phone="010-1223-0000"))
            add(phoneData(name="jenny", phone="010-0000-4342"))
            add(phoneData(name="mary", phone="010-0000-0000"))
            add(phoneData(name="john", phone="010-1223-0000"))
            add(phoneData(name="jenny", phone="010-0000-4342"))
            add(phoneData(name="mary", phone="010-0000-0000"))
            add(phoneData(name="john", phone="010-1223-0000"))
            add(phoneData(name="jenny", phone="010-0000-4342"))

            recyclerViewAdapter.datalist = datalist
            recyclerViewAdapter.notifyDataSetChanged()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }


}