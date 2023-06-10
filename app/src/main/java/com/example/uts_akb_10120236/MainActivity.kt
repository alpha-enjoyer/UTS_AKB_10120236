package com.example.uts_akb_10120236

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import android.view.View

//tgl pengerjaan    : 11 Juni 2023
//nim               : 10120236
//nama              : Zulfikar Azizan
//kelas             : IF-6


class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {

    private lateinit var viewPager: ViewPager

    private lateinit var adapter: ViewPagerAdapter

    private lateinit var buttonMulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPagerWalkthrough)
        buttonMulai = findViewById(R.id.btnMulai)
        buttonMulai.setOnClickListener {
            val intent = Intent(this, MainContentView::class.java)
            startActivity(intent)
        }
        buttonMulai.visibility = View.GONE

        adapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(this)


    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }


    override fun onPageSelected(position: Int) {
        if (position == adapter.count - 1) {
            buttonMulai.visibility = View.VISIBLE
        } else {
            buttonMulai.visibility = View.GONE
        }
    }

    override fun onPageScrollStateChanged(state: Int) {

    }
}
