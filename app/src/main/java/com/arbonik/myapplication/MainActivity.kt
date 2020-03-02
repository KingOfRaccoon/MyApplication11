package com.arbonik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import Kvant
import Group
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import Pupil
import Teacher
import android.content.Intent

import android.view.View
import android.widget.AdapterView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Kvantorium
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Kvantorium.addkvants()
        listView.adapter = ArrayAdapter<Kvant>(this, android.R.layout.simple_list_item_1, Kvantorium.kvants)

           listView.onItemClickListener = object : AdapterView.OnItemClickListener {
               override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                   var next: Intent = Intent(this@MainActivity, Main2Activity::class.java)
                   next.putExtra("itgroup" ,p2)
                   startActivity(next)
               }
           }

    }
}
