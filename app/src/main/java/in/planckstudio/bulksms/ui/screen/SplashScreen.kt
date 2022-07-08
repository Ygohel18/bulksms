package `in`.planckstudio.bulksms.ui.screen

import `in`.planckstudio.bulksms.MainActivity
import `in`.planckstudio.bulksms.R
import `in`.planckstudio.bulksms.util.LocalStorage
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    private lateinit var localStorage: LocalStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        localStorage = LocalStorage(this)

        Handler().postDelayed({
            if (!localStorage.getValueBoolean("isLogin")) {
                startActivity(
                    Intent(
                        this@SplashScreen,
                        LoginScreen::class.java
                    )
                )
            } else {
                startActivity(
                    Intent(
                        this@SplashScreen,
                        MainActivity::class.java
                    )
                )
            }
        }, 2000)

    }
}