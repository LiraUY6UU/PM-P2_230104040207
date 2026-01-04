package id.antasari.helloworldapp_230104040207

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnToggle = findViewById<Button>(R.id.btnToggle)

        // Status awal
        var isHalo = true

        // Event klik tombol
        btnToggle.setOnClickListener {
            if (isHalo) {
                tvMessage.text = "Selamat Datang di Perkuliahan Mobile Programming"
                isHalo = false
            } else {
                tvMessage.text = "Halo Lira Anggraini"
                isHalo = true
            }
        }
    }
}