package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation

import com.example.helloworld.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    var option = "cat"
//    var displayMessage: String? = ""

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        option = arguments?.getString("Data")?:"cat"
//        displayMessage = arguments?.getString("message")

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)
//        user_name.text=displayMessage

        btn_ot.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_lastFragment)
        }
    }

    private fun setResult(type_c : String){

        when(type_c){
            "ISTJ" -> {
                tv_main.text = "진돗개"
                tv_sub.text = "현실적이고 책임감 넘치는 당신.\n남들이 잊어버리는 사소한 것도 잘 기억하는 타입입니다.\n\n내성적이고 지적이며 충실한 브리티쉬 숏헤어와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.britishshorthair)
            }
            "ESTP" -> {
                tv_main.text = "스라소니"
                tv_sub.text = "과묵하고 분석적인 당신.\n적응력이 강하고 효율적으로 행동하며 독립적인 타입입니다.\n\n개인적이고 지능적이며 신중한 스라소니와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.srasony)
            }
            "ISTP" -> {
                tv_main.text = "뱅갈"
                tv_sub.text = "자신감 넘치고 엄청난 활동성을 자랑하는 당신.\n남들에 비해 다양한 것들을 쉽게 배우는 타입입니다.\n\n똑똑하고 호기심이 많아 새로운 것에 대한 관심이 많은 뱅갈 고양이와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.bangal)
            }
            "ESTJ" -> {
                tv_main.text = "드래곤 리"
                tv_sub.text = "체계적으로 일하고 규칙을 준수하는 당신.\n기억력도 좋고 활동성이 있어 사업가의 자질이 다분합니다.\n\n똑똑하고 친근하며 책임감 넘치는 드래곤 리와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.dragonlee)
            }
            "INTJ" -> {
                tv_main.text = "러시안 블루"
                tv_sub.text = "인내심이 많고 통찰력이 뛰어나며 화합을 추구하는 당신.\n남들보다 풍부한 내적생활을 소유하고 있는 타입입니다.\n\n눈치가 빨라 상대방을 위로할 줄 아는 다정한 러시안 블루와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.rusianblue)
            }
            "INTP" -> {
                tv_main.text = "버만"
                tv_sub.text = "자신이 관계하는 일이나 사람에 대하여 책임감이 강하고 성실한 당신.\n마음이 따뜻하고 조용한 타입입니다.\n\n자기 혼자만의 시간을 좋아하고 조용한 버만과 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.buman)
            }
            "ENTP" -> {
                tv_main.text = "싱가푸라"
                tv_sub.text = "따뜻하고 활기가 넘치며 상상력이 풍부한 당신.\n\n창의적이며 항상 새로운 가능성을 찾고 시도하는 타입입니다.\n호기심 많고 장난을 좋아하는 싱가푸라와 잘 어울리네요!"
                //iv_main.setImageResource(R.drawable.singapula)
            }
            "ENTJ" -> {
                tv_main.text = "통키니즈"
                tv_sub.text = "따뜻하고 적극적이며 책임감이 강한 당신.\n상당히 이타적이고 사교성이 풍부한 타입입니다.\n\n활기차고 사교적이며 매우 충성스러운 통키니즈와 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.tongkiniz)
            }
            "INFJ" -> {
                tv_main.text = "페르시안"
                tv_sub.text = "차분하고 헌신적이며 혼자 있는 것을 좋아하는 당신.\n규칙적이고 일상적인 환경을 선호하는 타입입니다.\n\n집사에게 충실하며 느긋하면서도 성실한 성격인 페르시안과 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.persian)
            }
            "ENFP" -> {
                tv_main.text = "아나톨리안"
                tv_sub.text = "온화하고 우아하며 타인을 존중하는데 능숙한 당신.\n조용하고 부드러운 이미지를 갖고 있군요.\n\n다른 동물을 배려하는 훌륭한 감성과 온순한 성격을 겸비한 아나톨리안과 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.anatolian)
            }
            "INFP" -> {
                tv_main.text = "스핑크스"
                tv_sub.text = "적극적이고 활발하여 주위에 사람이 많은 당신.\n탐험을 좋아하고 매우 사교적이며 장난기 넘치는 타입입니다.\n\n고양이 종 중 가장 애교 넘치며 사랑스러운 성격인 스핑크스와 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.spingks)
            }
            "ENFJ" -> {
                tv_main.text = "저먼 렉스"
                tv_sub.text = "사람들과 함께 하는 것을 좋아하며 애정이 넘치고 친절한 당신.\n\n혼자 있는 것보다 다른 사람들과 관계에서 행복을 찾는 타입입니다.\n사람에게 관심이 많고 사랑스럽고 충성심이 강한 저먼 렉스와 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.jamunlex)
            }
            "ISFJ" -> {
                tv_main.text = "노르웨이 숲"
                tv_sub.text = "전략적 사고에 뛰어나며 풍부한 지식을 소유하고 있는 당신.\n호기심이 많고 이상적이며 야망이 가득한 사람이군요.\n\n독립적이며 똑똑하고, 새로운 것을 배우기 좋아하는 노르웨이 숲과 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.norwayshop)
            }
            "ISFP" -> {
                tv_main.text = "터키쉬 반"
                tv_sub.text = "창의적이고 독창적이며 지적 호기심이 가득한 당신.\n논리적이며 자신의 관심사에 몰두하는, 전형적인 연구가 타입입니다.\n\n지능적이며 지적 호기심이 높고, 실험정신이 강한 터키쉬 반과 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.turkishban)
            }
            "ESFP" -> {
                tv_main.text = "발리니즈"
                tv_sub.text = "박학다식하고 통찰력이 뛰어나며, 다방면에 관심이 많은 당신.\n\n모험심이 강하며 자신의 가치관이 매우 뚜렷한 타입입니다.\n지루한 것을 싫어하며 장난스럽고, 주변을 탐험하는 데 관심이 많은 발리니즈와 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.baliniz)
            }
            "ESFJ" -> {
                tv_main.text = "샴"
                tv_sub.text = "성취 가능한 도전에 매력을 느끼며 감정 표현에 있어 솔직한 당신.\n통솔력과 전략적 사고, 장기적인 안목을 모두 갖춘 지도자 타입입니다.\n\n영리하며 외향적이어서 집사에게 자신의 의견을 알리는 것을 좋아하는 샴고양이와 잘 어울리네요."
                //iv_main.setImageResource(R.drawable.shiap)
            }
        }
    }

}
