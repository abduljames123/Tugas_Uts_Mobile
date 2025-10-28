package lat.pam.mesenmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AlamatPengirimanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat_pengiriman)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val etPatokan = findViewById<EditText>(R.id.etPatokan)
        val btnOrderKirim = findViewById<Button>(R.id.btnOrderKirim)

        btnOrderKirim.setOnClickListener {
            if (etNama.text.isNotEmpty() && etAlamat.text.isNotEmpty()) {
                startActivity(Intent(this, KonfirmasiActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Isi semua data terlebih dahulu", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
