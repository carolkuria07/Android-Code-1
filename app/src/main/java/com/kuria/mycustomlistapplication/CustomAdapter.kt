package com.kuria.mycustomlistapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var data:ArrayList<Item>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTvName:TextView
        var mTvDesc:TextView
        var mTvPrice:TextView
        var mimgphoto:ImageView
        init {
            this.mTvName = row?.findViewById(R.id.mTvName) as TextView
            this.mTvDesc = row?.findViewById(R.id.mTvDesc) as TextView
            this.mTvPrice = row?.findViewById(R.id.mTvPrice) as TextView
            this.mimgphoto = row?.findViewById(R.id.mimgphoto) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var Item:Item = getItem(position) as Item
        viewHolder.mTvName.text = Item.name
        viewHolder.mTvDesc.text = Item.desc
        viewHolder.mTvPrice.text = Item.price
        viewHolder.mimgphoto.setImageResource(Item.photo)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}