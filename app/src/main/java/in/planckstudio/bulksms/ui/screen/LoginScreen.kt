package `in`.planckstudio.bulksms.ui.screen

import `in`.planckstudio.bulksms.MainActivity
import `in`.planckstudio.bulksms.R
import `in`.planckstudio.bulksms.util.LocalStorage
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginScreen : AppCompatActivity() {

    private lateinit var localStorage: LocalStorage
    private lateinit var mLoginBtn: MaterialButton
    private lateinit var mRegisterBtn: MaterialButton
    private lateinit var mEmailInput: TextInputEditText
    private lateinit var mPasswordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        localStorage = LocalStorage(this)
        mLoginBtn = findViewById(R.id.login_btn)
        mRegisterBtn = findViewById(R.id.register_btn)
        mEmailInput = findViewById(R.id.login_email)
        mPasswordInput = findViewById(R.id.login_password)

        mLoginBtn.setOnClickListener {
            processLogin()
        }

        mRegisterBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@LoginScreen,
                    RegisterScreen::class.java
                )
            )
        }
    }

    private fun processLogin() {
        if (mEmailInput.text.isNullOrEmpty()) {
            mEmailInput.error = "Enter email"
        }

        if (mPasswordInput.text.isNullOrEmpty()) {
            mPasswordInput.error = "Enter password"
        }

        if (mEmailInput.text != null && mPasswordInput.text != null) {
            doLogin(mEmailInput.text.toString(), mPasswordInput.text.toString())
        }
    }

    private fun doLogin(email: String, password: String) {
        startActivity(
            Intent(
                this@LoginScreen,
                MainActivity::class.java
            )
        )
    }
}