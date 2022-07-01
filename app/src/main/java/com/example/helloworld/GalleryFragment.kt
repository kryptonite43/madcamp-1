package com.example.helloworld

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GalleryFragment : Fragment() {

    lateinit var mainActivity: MainActivity
    lateinit var RVAdapter: RVAdapter
    private val items = mutableListOf<GalleryContents>()
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity= context as MainActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun initRecycler(){
        RVAdapter = RVAdapter(items)
        val recyclerView = getView()?.findViewById<RecyclerView>(R.id.rv)
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/푸들",
                "https://upload.wikimedia.org/wikipedia/commons/8/8f/Poodel-Standard.jpg",
                "푸들"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/푸들",
                "https://upload.wikimedia.org/wikipedia/commons/8/8f/Poodel-Standard.jpg",
                "푸들"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/푸들",
                "https://upload.wikimedia.org/wikipedia/commons/8/8f/Poodel-Standard.jpg",
                "푸들"
            )
        )
        recyclerView?.adapter = RVAdapter
        recyclerView?.layoutManager = GridLayoutManager(activity, 2)
        RVAdapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }
}