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
import android.view.View
import android.widget.AdapterView

class MainActivity : AppCompatActivity() {
    var Akva : Kvantorium = Kvantorium
    var kvant : Kvant = Akva.makekvant("it")
    var group : Group = kvant.makeGroup(Teacher("1", "2", "3"), "FFFFFFFFFFFF")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Akva.addkvants()
        listView.adapter = ArrayAdapter<Kvant>(this, android.R.layout.simple_list_item_1, Akva.kvants)
           listView.onItemClickListener = object : AdapterView.OnItemClickListener {
               override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

               }
           }
    }
}
