package com.example.uts_akb_10120236

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//tgl pengerjaan    : 11 Juni 2023
//nim               : 10120236
//nama              : Zulfikar Azizan
//kelas             : IF-6

class MainContentView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_content_view)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        val menu: Menu = bottomNavigationView.menu

        val fragment = HomeFragment()
        loadFragment(fragment)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Tindakan saat item Home dipilih (aktif)
                    // Contoh: Ganti fragment atau tampilkan konten terkait
                    val fragment = HomeFragment()


                    loadFragment(fragment)
                    true
                }
                R.id.nav_galeri -> {
                    // Tindakan saat item Dashboard dipilih (aktif)
                    // Contoh: Ganti fragment atau tampilkan konten terkait
                    val fragment = GaleriFragment()


                    loadFragment(fragment)
                    true
                }
                R.id.nav_dailyActivity -> {
                    // Tindakan saat item Notifications dipilih (aktif)
                    // Contoh: Ganti fragment atau tampilkan konten terkait
                    val fragment = DailyFragment()


                    loadFragment(fragment)
                    true
                }
                R.id.nav_favMusic -> {
                    // Tindakan saat item Notifications dipilih (aktif)
                    // Contoh: Ganti fragment atau tampilkan konten terkait
                    val fragment = MusikFragment()


                    loadFragment(fragment)
                    true
                }
                R.id.nav_profil -> {
                    // Tindakan saat item Notifications dipilih (aktif)
                    // Contoh: Ganti fragment atau tampilkan konten terkait
                    val fragment = ProfilFragment()


                    loadFragment(fragment)
                    true
                }
                else -> false
            }
        }



    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }
}