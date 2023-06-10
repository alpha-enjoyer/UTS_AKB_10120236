package com.example.uts_akb_10120236

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.uts_akb_10120236.Walkthrough1

//tgl pengerjaan    : 11 Juni 2023
//nim               : 10120236
//nama              : Zulfikar Azizan
//kelas             : IF-6

class ViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm)   {
    override fun getItem(position: Int): Fragment {
        // Mengembalikan Fragment yang sesuai dengan posisi
        return when (position) {
            0 -> Walkthrough1()
            1 -> Walkthrough2()
            2 -> Walkthrough3()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        // Mengembalikan jumlah total Fragment
        return 3
    }
}