package com.example.pesantiket

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pesantiket.databinding.ActivitySuccessBinding

class SuccessActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuccessBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil data dari Intent
        val nama = intent.getStringExtra("NAMA")
        val jam = intent.getStringExtra("JAM")
        val tanggal = intent.getStringExtra("TANGGAL")
        val tujuan = intent.getStringExtra("TUJUAN")

        // Tampilkan data di TextView
        binding.tvNama.text = "Nama: $nama"
        binding.tvJam.text = "Jam: $jam"
        binding.tvTanggal.text = "Tanggal: $tanggal"
        binding.tvTujuan.text = "Tujuan: $tujuan"
    }
}
