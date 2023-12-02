package com.example.kotlin4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity1 : AppCompatActivity() {
    private lateinit var whatsapp: MaterialButton
    private lateinit var copput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        whatsapp = this.findViewById(R.id.whatsap)
        copput = this.findViewById(R.id.edtext)

        goToWhatsApp()
    }

    private fun goToWhatsApp() {
        whatsapp.setOnLongClickListener {
            val WhatsappSearchUrl = "https://web.whatsapp.com/"
            val query = copput.text.trim()
            val whatsappIntent = Intent(Intent.ACTION_VIEW, Uri.parse("$WhatsappSearchUrl$query"))
            startActivity(whatsappIntent)
        }
    }
}