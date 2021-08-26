package com.kuria.mycustomlistapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var items:ArrayList<Item>? = null
    var my_list_items:ListView? = null
    var adapter:CustomAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_list_items = findViewById(R.id.mListItems)
        items = ArrayList()
        adapter = CustomAdapter(this, items!!)

        //Create items to be displayed
        var item1 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
        var item2 = Item(R.drawable.flowers_seven,"Timberland", "Noma Shoe", "Ksh 7000")
        var item3 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
        var item4 = Item(R.drawable.flowers_seven,"Timberland", "Noma Shoe", "Ksh 7000")
        var item5 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
        var item6 = Item(R.drawable.flowers_seven,"Timberland", "Noma Shoe", "Ksh 7000")
        var item7 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
        var item8 = Item(R.drawable.flowers_seven,"Timberland", "Noma Shoe", "Ksh 7000")
        var item9 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
        var item10 = Item(R.drawable.flowers_seven,"Timberland", "Noma Shoe", "Ksh 7000")
        var item11 = Item(R.drawable.flower_three,"Timberland", "Noma Shoe", "Ksh 7000")
//Add items to your arraylist
        items!!.add(item1)
        items!!.add(item2)
        items!!.add(item3)
        items!!.add(item4)
        items!!.add(item5)
        items!!.add(item6)
        items!!.add(item7)
        items!!.add(item8)
        items!!.add(item9)
        items!!.add(item10)
        items!!.add(item11)
        //Set our adapter to the listview
        my_list_items!!.adapter = adapter


    }
}