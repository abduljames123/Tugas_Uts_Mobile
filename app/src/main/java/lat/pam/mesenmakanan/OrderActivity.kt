package lat.pam.mesenmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvNamaPesanan = findViewById<TextView>(R.id.tvNamaPesanan)
        val etNamaLengkap = findViewById<EditText>(R.id.etNamaLengkap)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val etPatokan = findViewById<EditText>(R.id.etPatokan)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val makanan = intent.getStringExtra("makanan")
        tvNamaPesanan.text = "Halo James, pesanan kamu: $makanan"

        btnKirim.setOnClickListener {
            val nama = etNamaLengkap.text.toString()
            val alamat = etAlamat.text.toString()
            val patokan = etPatokan.text.toString()

            if (nama.isNotEmpty() && alamat.isNotEmpty() && patokan.isNotEmpty()) {
                // kirim data ke halaman konfirmasi
                val intent = Intent(this, ConfirmationActivity::class.java)
                intent.putExtra("nama", nama)
                intent.putExtra("alamat", alamat)
                intent.putExtra("makanan", makanan)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Lengkapi semua data pengiriman!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
