package com.app.job19aml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val list = ArrayList<Makanan>()
    val listMkn = arrayOf(
        "fiki zulkarnain",
        "heydaristo zhahir"
        "ikha nur",
        "ima aska rosadah",
        "khamila nur lutfi",
        "laikatul risa istifadhoh",
        "luk luul latifah",
        "Maulana Zahrony",
        "Maya Indah Lestari",
        "Muhammad Khusnu Marom",
        "Muhammad Huda Gunawan",
        "Mutmainah Septiarini",
        "Nasywa Sukria Hanifa",
        "Nor Hidayah Fitriyani",
        "Novita Sari",
        "Nur Izza",
        "Riska Anggun Anggriani",
        "Sahrul Lukman Hakim",
        "Setya Ning Rahayu",
        "Siti Agnia Amalia",
        "Tiara Bintang Liswanda",
        "Wahyu Eka Prasetya",
        "Zahrotun Niswah",
        "Zuliana"
    )
    lateinit var makananView: RecyclerView
    lateinit var makananAdapter: MakananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.makananView)
        makananView.layoutManager = LinearLayoutManager(this)

        for (i in listMkn.indices){
            list.add(Makanan(listMkn[i]))
        }

        makananAdapter = MakananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}