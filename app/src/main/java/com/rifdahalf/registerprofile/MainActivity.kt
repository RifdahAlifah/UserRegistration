package com.rifdahalf.registerprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_signup.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        if (p0.id == R.id.btn_signup) {
            val inputUsername = et_username.text.toString().trim()
            val inputEmail = et_email.text.toString().trim()
            val inputPhone = et_no_telepon.text.toString().trim()
            val inputPassword = et_password.text.toString().trim()

            when {
                inputUsername.isEmpty() -> {
                    et_username.error = "Must be filled"
                }
                inputEmail.isEmpty() -> {
                    et_email.error = "Must be filled"
                }
                inputPhone.isEmpty() -> {
                    et_no_telepon.error = "Must be filled"
                }
                inputPassword.isEmpty() -> {
                    et_password.error = "Must be filled"
                }

                else -> {
                    val intentData = Intent (this, IsiRegisterActivity::class.java)
                    intentData.putExtra("Username", inputUsername)
                    intentData.putExtra("Email", inputEmail)
                    intentData.putExtra("Phone", inputPhone)
                    intentData.putExtra("Password", inputPassword)
                    startActivity(intentData)
                }
            }
        }


    }
}