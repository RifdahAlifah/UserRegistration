package com.rifdahalf.registerprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_isi_register.*

class IsiRegisterActivity : AppCompatActivity() {
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_register)

        val terimaUsername = intent.getStringExtra("Username")
        val terimaEmail = intent.getStringExtra("Email")
        val terimaPhone = intent.getStringExtra("Phone")
        val terimaPassword = intent.getStringExtra("Password")

        tv_isi_username.text = terimaUsername
        tv_isi_email.text = terimaEmail
        tv_isi_no_telp.text = terimaPhone
        tv_isi_password.text = terimaPassword
    }
}