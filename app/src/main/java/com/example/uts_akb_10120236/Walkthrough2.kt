package com.example.uts_akb_10120236

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

//tgl pengerjaan    : 11 Juni 2023
//nim               : 10120236
//nama              : Zulfikar Azizan
//kelas             : IF-6


class Walkthrough2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()
        // Inflate layout untuk Fragment1
        return inflater.inflate(R.layout.activity_walkthrough_2, container, false)
    }
}