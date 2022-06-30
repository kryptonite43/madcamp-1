package com.example.helloworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>): BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var converView = p1
        if (converView == null) {
            converView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val title = converView!!.findViewById<TextView>(R.id.name)
        val content = converView!!.findViewById<TextView>(R.id.phone)
        title.text = List[p0].title
        content.text = List[p0].content

        // List[0] -> ListViewModel("a","b")
        return converView!!
    }

}