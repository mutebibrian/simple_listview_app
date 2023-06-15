package com.kotlinseries.simple_listviewapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(private var activity:Activity,private var items:ArrayList<Countrymodel>):BaseAdapter() {
    //start implementing the methods
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Countrymodel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
      return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //this for generating items
        val view:View?
        val viewHolder:ViewHolder
        if (convertView== null){
            val inflater= activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            //layout inflater is used to get the view object which you define layout xml
            //Layout inflator will be used when you donot have a layoput
            view=inflater.inflate(R.layout.list_item_layout,null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder


        }else{
            view = convertView
            viewHolder= view.tag as    ViewHolder
        }
        var countries =items[position]
        viewHolder.txtname?.text=countries.name
        viewHolder.txtdes?.text=countries.Description
        //viewHolder.flagimg?.setImageResource(R.drawable.ic_launcher_foreground)
viewHolder.flagimg?.setImageResource(countries.flag)
        return view as View
    }
    private class ViewHolder(row: View?){
        var txtname:TextView?=null
        var txtdes:TextView?=null
        var flagimg:ImageView?=null

        init {
            this.txtname=row?.findViewById(R.id.listv)
            this.txtdes=row?.findViewById(R.id.textcountry)
            this.flagimg=row?.findViewById(R.id.imageView)
        }


    }
}