package com.kotlinseries.simple_listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Step1-Adapterview:ListView
        var listview:ListView = findViewById(R.id.listv)
        //step2 -define     Adapter
       var adapter =MyAdapter(this,generateData())
        listview?.adapter=adapter
        adapter?.notifyDataSetChanged()
    }

    //Step3-Data source
    fun generateData():ArrayList<Countrymodel>{
        val result = ArrayList<Countrymodel>()
        var country1:Countrymodel= Countrymodel("Uganda","Pearl of africa",R.drawable.ic_launcher_foreground)
        var country2:Countrymodel=Countrymodel("Kenya","Horn of Africa",R.drawable.ic_launcher_foreground)
        var country3:Countrymodel=Countrymodel("Kenya","Horn of Africa",R.drawable.ic_launcher_foreground)

result.add(country1)
        result.add(country2)
        result.add(country3)

return result
    }

}
