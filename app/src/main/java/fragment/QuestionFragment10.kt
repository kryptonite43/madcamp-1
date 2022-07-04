package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.example.helloworld.R
import com.junga.helloworld.fragment.algorithm
import kotlinx.android.synthetic.main.fragment_question10.*

class QuestionFragment10 : Fragment(), View.OnClickListener {
    var tmp = algorithm(0,0,0,0)

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tmp.ei = arguments?.getInt("Data1")?:-1
        tmp.sn = arguments?.getInt("Data2")?:-1
        tmp.tf = arguments?.getInt("Data3")?:-1
        tmp.jp = arguments?.getInt("Data4")?:-1
        return inflater.inflate(R.layout.fragment_question10, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        btn_next.setOnClickListener(this)
        option10_1.setOnClickListener(this)
        option10_2.setOnClickListener(this)
        btn_back.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_next -> {
                navController.navigate(R.id.action_questionFragment10_to_questionFragment11)
            }
            R.id.option10_1 -> {
                tmp.incrementSn()
                navigationWithData(tmp.getEi(), tmp.getSn(), tmp.getTf(), tmp.getJp())
            }
            R.id.option10_2 -> {
                navigationWithData(tmp.getEi(), tmp.getSn(), tmp.getTf(), tmp.getJp())
            }
            R.id.btn_back -> {
                navController.popBackStack()
            }
        }
    }

    fun navigationWithData(data1: Int, data2: Int, data3: Int, data4: Int){
        val bundle: Bundle = bundleOf("Data1" to data1,"Data2" to data2,"Data3" to data3,"Data4" to data4)
        navController.navigate(R.id.action_questionFragment10_to_questionFragment11, bundle)
    }

}
