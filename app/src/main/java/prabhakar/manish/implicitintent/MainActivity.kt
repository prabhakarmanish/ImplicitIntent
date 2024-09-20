package prabhakar.manish.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.button1)
        btn.setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW)
            webIntent.data = Uri.parse("https://chatgpt.com/c/66ebd330-7670-8001-8f6b-1d66c2e09e31")
            startActivity(webIntent)
        }

    }
}