package com.example.islami.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.islami.R
import com.example.islami.databinding.FragmentQuraunBinding
import com.example.islami.ui.adapters.SuraAdapter
import com.example.islami.ui.data.SuraName
import com.example.islami.ui.qurancontent.Quraun_content


class QuraunFragment : Fragment() {


    lateinit var viewBinding: FragmentQuraunBinding
    lateinit var list: MutableList<SuraName>
    lateinit var lists: List<String>
    lateinit var lista: List<String>
    lateinit var adapter :SuraAdapter
    lateinit var layoutManager: LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding= FragmentQuraunBinding.inflate(inflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        InitAdapter()
        adapter.onSuraClickListener=
            SuraAdapter.OnSuraClickListener { position, sura ->
                val i =Intent(context,Quraun_content::class.java)
                i.putExtra("name",sura.suraName)
                i.putExtra("pos",position)
                startActivity(i)
            }

    }
    fun InitAdapter()
    {
        InitList()
        adapter= SuraAdapter(list)
        viewBinding.rc.adapter=adapter
        layoutManager= LinearLayoutManager(context)
        viewBinding.rc.layoutManager=layoutManager
    }

    fun InitList(){
        InitNames()
        InitAyat()
        list= mutableListOf<SuraName>()
        for (i in lists.indices)
        {
            list.add(SuraName(lists[i],lista[i]))
        }
    }
    fun InitNames()
    {
        lists = listOf<String>(
            "الفاتحه",
            "البقرة",
            "آل عمران",
            "النساء",
            "المائدة",
            "الأنعام",
            "الأعراف",
            "الأنفال",
            "التوبة",
            "يونس",
            "هود",
            "يوسف",
            "الرعد",
            "إبراهيم",
            "الحجر",
            "النحل",
            "الإسراء",
            "الكهف",
            "مريم",
            "طه",
            "الأنبياء",
            "الحج",
            "المؤمنون",
            "النّور",
            "الفرقان",
            "الشعراء",
            "النّمل",
            "القصص",
            "العنكبوت",
            "الرّوم",
            "لقمان",
            "السجدة",
            "الأحزاب",
            "سبأ",
            "فاطر",
            "يس",
            "الصافات",
            "ص",
            "الزمر",
            "غافر",
            "فصّلت",
            "الشورى",
            "الزخرف",
            "الدّخان",
            "الجاثية",
            "الأحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "ق",
            "الذاريات",
            "الطور",
            "النجم",
            "القمر",
            "الرحمن",
            "الواقعة",
            "الحديد",
            "المجادلة",
            "الحشر",
            "الممتحنة",
            "الصف",
            "الجمعة",
            "المنافقون",
            "التغابن",
            "الطلاق",
            "التحريم",
            "الملك",
            "القلم",
            "الحاقة",
            "المعارج",
            "نوح",
            "الجن",
            "المزّمّل",
            "المدّثر",
            "القيامة",
            "الإنسان",
            "المرسلات",
            "النبأ",
            "النازعات",
            "عبس",
            "التكوير",
            "الإنفطار",
            "المطفّفين",
            "الإنشقاق",
            "البروج",
            "الطارق",
            "الأعلى",
            "الغاشية",
            "الفجر",
            "البلد",
            "الشمس",
            "الليل",
            "الضحى",
            "الشرح",
            "التين",
            "العلق",
            "القدر",
            "البينة",
            "الزلزلة",
            "العاديات",
            "القارعة",
            "التكاثر",
            "العصر",
            "الهمزة",
            "الفيل",
            "قريش",
            "الماعون",
            "الكوثر",
            "الكافرون",
            "النصر",
            "المسد",
            "الإخلاص",
            "الفلق",
            "الناس"
        )
    }
    fun InitAyat()
    {
        lista = listOf(
            "7 آية",
            "286 آية",
            "200 آية",
            "176 آية",
            "120 آية",
            "165 آية",
            "206 آية",
            "75 آية",
            "129 آية",
            "109 آية",
            "123 آية",
            "111 آية",
            "43 آية",
            "52 آية",
            "99 آية",
            "128 آية",
            "111 آية",
            "110 آية",
            "98 آية",
            "135 آية",
            "112 آية",
            "78 آية",
            "118 آية",
            "64 آية",
            "77 آية",
            "227 آية",
            "93 آية",
            "88 آية",
            "69 آية",
            "60 آية",
            "34 آية",
            "30 آية",
            "73 آية",
            "54 آية",
            "45 آية",
            "83 آية",
            "182 آية",
            "88 آية",
            "75 آية",
            "85 آية",
            "54 آية",
            "53 آية",
            "89 آية",
            "59 آية",
            "37 آية",
            "35 آية",
            "38 آية",
            "29 آية",
            "18 آية",
            "45 آية",
            "60 آية",
            "49 آية",
            "62 آية",
            "55 آية",
            "78 آية",
            "96 آية",
            "29 آية",
            "22 آية",
            "24 آية",
            "13 آية",
            "14 آية",
            "11 آية",
            "11 آية",
            "18 آية",
            "12 آية",
            "12 آية",
            "30 آية",
            "52 آية",
            "52 آية",
            "44 آية",
            "28 آية",
            "28 آية",
            "20 آية",
            "56 آية",
            "40 آية",
            "31 آية",
            "50 آية",
            "40 آية",
            "46 آية",
            "42 آية",
            "29 آية",
            "19 آية",
            "36 آية",
            "25 آية",
            "22 آية",
            "17 آية",
            "19 آية",
            "26 آية",
            "30 آية",
            "20 آية",
            "15 آية",
            "21 آية",
            "11 آية",
            "8 آية",
            "8 آية",
            "19 آية",
            "5 آية",
            "8 آية",
            "8 آية",
            "11 آية",
            "11 آية",
            "8 آية",
            "3 آية",
            "9 آية",
            "5 آية",
            "4 آية",
            "7 آية",
            "3 آية",
            "6 آية",
            "3 آية",
            "5 آية",
            "4 آية",
            "5 آية",
            "6 آية",


            )
    }

}