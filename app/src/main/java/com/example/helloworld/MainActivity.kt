package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    lateinit var recyclerViewAdapter: RecyclerViewAdapter
//    val datalist = mutableListOf<phoneData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initRecycler()

    }
//    private fun initRecycler() {
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
}