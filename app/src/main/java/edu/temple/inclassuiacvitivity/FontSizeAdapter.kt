package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FontSizeAdapter (private val context: Context, private val fontSizes: Array<Int>): BaseAdapter(){
    override fun getCount() = fontSizes.size

    override fun getItem(p0: Int) = fontSizes[p0]

    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return getDropDownView(p0,p1,p2).apply {
            (this as TextView).textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if(convertView != null){
            textView = convertView as TextView
        } else{
            textView = TextView(context)
            textView.setPadding(5,10,0,10)
        }

        textView.text = fontSizes[position].toString()
        textView.textSize = fontSizes[position].toFloat()

        return textView
    }
}