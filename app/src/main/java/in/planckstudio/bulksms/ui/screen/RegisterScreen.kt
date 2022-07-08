package `in`.planckstudio.bulksms.ui.screen

import `in`.planckstudio.bulksms.MainActivity
import `in`.planckstudio.bulksms.R
import `in`.planckstudio.bulksms.util.LocalStorage
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class RegisterScreen : AppCompatActivity() {

    private lateinit var localStorage: LocalStorage
    private lateinit var mLoginBtn: MaterialButton
    private lateinit var mRegisterBtn: MaterialButton
    private lateinit var mEmailInput: TextInputEditText
    private lateinit var mPasswordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        localStorage = LocalStorage(this)
        mLoginBtn = findViewById(R.id.login_btn)
        mRegisterBtn = findViewById(R.id.register_btn)
        mEmailInput = findViewById(R.id.register_email)
        mPasswordInput = findViewById(R.id.register_password)

        mLoginBtn.setOnClickListener {
            startActivity(
                Intent(
                    this@RegisterScreen,
                    LoginScreen::class.java
                )
            )
        }

        mRegisterBtn.setOnClickListener {
            processRegister()
        }
    }

    private fun processRegister() {
        if (mEmailInput.text.isNullOrEmpty()) {
            mEmailInput.error = "Enter email"
        }

        if (mPasswordInput.text.isNullOrEmpty()) {
            mPasswordInput.error = "Enter password"
        }

        if (mEmailInput.text != null && mPasswordInput.text != null) {
            doRegister(mEmailInput.text.toString(), mPasswordInput.text.toString())
        }
    }

    private fun doRegister(email: String, password: String) {
        startActivity(
            Intent(
                this@RegisterScreen,
                MainActivity::class.java
            )
        )
    }
}