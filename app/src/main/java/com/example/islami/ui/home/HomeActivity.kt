package com.example.islami.ui.home

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.databinding.ActivityHomeBinding
import com.example.islami.ui.data.SuraName
import com.example.islami.ui.fragments.HadeathFragment
import com.example.islami.ui.fragments.QuraunFragment
import com.example.islami.ui.fragments.RadioFragment
import com.example.islami.ui.fragments.SebhaFragment

class HomeActivity : AppCompatActivity() {
    lateinit var viewBindig:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBindig = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewBindig.root)
        viewBindig.content.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.q -> {SelectesFragment(QuraunFragment())}
                R.id.s -> {SelectesFragment(SebhaFragment())}
                R.id.r -> {SelectesFragment(RadioFragment())
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
                }
                R.id.h -> {SelectesFragment(HadeathFragment())}
            }
            true
        }
        viewBindig.content.bottomNavigationView.selectedItemId=R.id.q
    }

    private fun SelectesFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out).replace(R.id.con,fragment).commit()
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
    }


}