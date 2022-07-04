package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_contact_add.*

class ContactAddFragment : Fragment(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val submitbutton = getView()?.findViewById<Button>(R.id.submitbutton)
        submitbutton!!.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.submitbutton) {
            Log.i("submitbutton", "온클릭")

            val newimage = editImageURL.text.toString()
            val newname = editTextTextPersonName.text.toString()
            val newphone = editTextPhone.text.toString()
            val fm = activity?.supportFragmentManager

            val argument = Bundle()
            argument.putString("image", newimage)
            argument.putString("name", newname)
            argument.putString("phone", newphone)
//            val bundle = Bundle()
//            bundle.putString("name", newname)
//            bundle.putString("name", newname)
//            bundle.putString("name", newname)


            val returnFragment = ContactFragment()
            returnFragment.arguments = argument
            fm?.beginTransaction()?.replace(R.id.fl_con, returnFragment)?.commit()


            //returnFragment.arguments = bundle fm.beginTransaction()
            //val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
//            transaction.replace(R.id.fl_con, returnFragment)
//            transaction.commit()
        }
    }

}