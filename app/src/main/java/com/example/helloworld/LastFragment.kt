package com.example.helloworld

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation


class LastFragment : Fragment() {
    var option = "dog"
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getString("Data")?:"dog"
        return inflater.inflate(R.layout.fragment_last, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        val passbutton = getView()?.findViewById<Button>(R.id.passbutton)
        passbutton?.setOnClickListener{
            navigationWithData(option)
        }

    }

    fun navigationWithData(data: String){
        val bundle: Bundle = bundleOf("Data" to data)
        navController.navigate(R.id.action_lastFragment_to_questionFragment1, bundle)
    }

}