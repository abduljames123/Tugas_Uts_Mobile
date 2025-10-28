package lat.pam.mesenmakanan

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvPesan = findViewById<TextView>(R.id.tvPesan)
        val btnSelesai = findViewById<Button>(R.id.btnSelesai)

        val nama = intent.getStringExtra("nama")
        val alamat = intent.getStringExtra("alamat")
        val makanan = intent.getStringExtra("makanan")

        tvNama.text = "Halo $nama,"
        tvPesan.text = "Terima kasih sudah memesan $makanan.\n" +
                "Mohon tunggu, kurir akan mengirim ke alamat:\n$alamat"

        btnSelesai.setOnClickListener {
            finish() // kembali ke halaman sebelumnya
        }
    }
}
