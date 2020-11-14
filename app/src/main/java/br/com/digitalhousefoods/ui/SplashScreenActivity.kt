package br.com.digitalhousefoods.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.com.digitalhousefoods.R

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 1500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        splashScreen()
    }

    private fun splashScreen() {
        val runnable = Runnable {
            callLogin()
            finish()
        }

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(runnable, SPLASH_TIME_OUT)
    }

    private fun callLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}