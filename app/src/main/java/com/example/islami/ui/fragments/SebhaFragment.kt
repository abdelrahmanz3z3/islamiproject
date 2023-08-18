package com.example.islami.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.databinding.FragmentSebhaBinding


class SebhaFragment : Fragment() {


    lateinit var viewBinding:FragmentSebhaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding=FragmentSebhaBinding.inflate(layoutInflater,container,false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var i =0
        var c=3
        val lis = listOf( "لا اله الا الله","الله اكبر","الحمد لله","سبحان الله")
        viewBinding.materialButton.text=lis[c]
        viewBinding.count.text=i.toString()


        viewBinding.materialButton.setOnClickListener {

            viewBinding.imageView6.rotation+=30
            viewBinding.count.text=i.toString()
            viewBinding.materialButton.text=lis[c]
            viewBinding.textView5.text=lis[c]
            i++
//            viewBinding.textView5.text=lis[c]
//            viewBinding.count.text=i.toString()
            if (i==34)
            {
                i=0
                c--;
                viewBinding.imageView6.rotation=0F
            }
            if (c<0)
            {
                c=3
            }
        }
    }

}