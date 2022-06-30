package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ListView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
//    lateinit var recyclerViewAdapter: RecyclerViewAdapter
//    val datalist = mutableListOf<phoneData>()
    private val fl: FrameLayout by lazy {
        findViewById(R.id.fl_con)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initRecycler()
        val bnv_main = findViewById<BottomNavigationView>(R.id.bnv_main)

        bnv_main.setOnItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.contact -> {
                        bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.color_1)
                        bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.color_1)
                        ContactFragment()

                    }
                    R.id.gallery -> {
                        bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.color_2)
                        bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.color_2)
                        GalleryFragment()

                    }
                    else -> {
                        //bnv_main.itemIconTintList = ContextCompat.getColorStateList(this, R.color.purple_700)
                        //bnv_main.itemTextColor = ContextCompat.getColorStateList(this, R.color.purple_700)
                        LastFragment()

                    }
                }
            )
            true
        }
        bnv_main.selectedItemId = R.id.contact

    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_con, fragment)
            .commit()
    }
//    private fun initRecycler() {
//        recyclerViewAdapter = RecyclerViewAdapter()
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