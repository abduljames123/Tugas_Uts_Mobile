package lat.pam.mesenmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Ambil referensi dari layout
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupMakanan)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

        // Kalau kamu mau nanti ambil nama user dari LoginActivity (dummy)
        val username = intent.getStringExtra("username") ?: "James"
        tvWelcome.text = "Halo $username, Pilih Makanan:"

        // Saat tombol diklik
        btnOrder.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId != -1) {
                val makanan = findViewById<RadioButton>(selectedId).text.toString()
                val intent = Intent(this, OrderActivity::class.java)
                intent.putExtra("makanan", makanan)
                intent.putExtra("username", username)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Pilih makanan dulu!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
