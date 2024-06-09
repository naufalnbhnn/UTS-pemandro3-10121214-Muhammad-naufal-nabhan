//27-05-2024/10121078/AdrianMaulanaRizqy/PemAndro3
package com.example.myselfapps_10121078

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Cek apakah walkthrough sudah pernah ditampilkan
            val sharedPreferences = getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
            val isFirstRun = sharedPreferences.getBoolean("isFirstRun", true)

            if (isFirstRun) {
                // Tampilkan WalkthroughActivity jika ini adalah pertama kali menjalankan aplikasi
                startActivity(Intent(this, WalkthroughActivity::class.java))
            } else {
                // Tampilkan MainActivity jika walkthrough sudah pernah ditampilkan
                startActivity(Intent(this, MainActivity::class.java))
            }

            finish()
        }, 2500) // Lama waktu splash screen ditampilkan (2 detik)
    }
}
