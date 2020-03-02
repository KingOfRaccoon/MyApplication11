package com.arbonik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import Group
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        list_group_view.adapter =
            ArrayAdapter<Group>(
                this@Main2Activity,
                android.R.layout.simple_list_item_1,
                Kvantorium.kvants[intent.getIntExtra("itgroup",0)].groups)

       // listView.onItemClickListener = object : AdapterView.OnItemClickListener {
//        }
    }
}
