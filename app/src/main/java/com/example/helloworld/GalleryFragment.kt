package com.example.helloworld

import android.content.Context
import android.content.Intent
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun initRecycler(){
        RVAdapter = RVAdapter(this.requireContext(),items)
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
                "https://ko.wikipedia.org/wiki/비숑_프리제",
                "data:image/jpeg;base64,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",
                "비숑 프리제"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/포메라니안",
                "https://t1.daumcdn.net/cfile/tistory/990F16335CD0597327",
                "포메라니안"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/치와와_(개)",
                "https://images.mypetlife.co.kr/content/uploads/2019/07/09153608/chihuahua-981188_1280-1024x681.jpg",
                "치와와"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/말티즈",
                "https://cdn.imweb.me/upload/S201907024711f2efb4922/48cf73641de67.jpg",
                "말티즈"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/시추",
                "https://w.namu.la/s/014f57cc6cf03c986fae7e2e1632385b8ed0d21826e5ff1363030ff22089149b34f1d26c950a8c23288db9f079c6c7220eb9d8cde3fd77fceb67cd96e557d63151ade2567041f3cb11a70af8a730fc22a0be938912c84e693ff9a19fa1a3fb1c3b915f19a4d3477eebaa77e1053ed4d5",
                "시추"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/요크셔_테리어",
                "data:image/jpeg;base64,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",
                "요크셔 테리어"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/퍼그",
                "https://imgnn.seoul.co.kr/img/upload/2017/05/30/SSI_20170530174756_V.jpg",
                "퍼그"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/닥스훈트",
                "https://t1.daumcdn.net/cfile/blog/233ED54D555DC4171B",
                "닥스훈트"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/리트리버",
                "https://d1bg8rd1h4dvdb.cloudfront.net/upload/imgServer/storypick/editor/2020062615503065168.jpg",
                "리트리버"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/보더_콜리",
                "https://d1bg8rd1h4dvdb.cloudfront.net/upload/imgServer/storypick/editor/2019052111361692611.jpg",
                "보더 콜리"
            )
        )
        items.add(
            GalleryContents(
                "https://ko.wikipedia.org/wiki/저먼_셰퍼드",
                "https://d1bg8rd1h4dvdb.cloudfront.net/upload/imgServer/storypick/editor/2020052209115281521.jpg",
                "저먼 셰퍼드"
            )
        )

        recyclerView?.adapter = RVAdapter
        RVAdapter.itemClick = object : RVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                val intent = Intent(activity, GalleryViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                startActivity(intent)
            }

        }
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