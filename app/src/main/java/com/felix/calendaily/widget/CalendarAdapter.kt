package com.felix.calendaily.widget

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.felix.calendaily.R
import com.felix.calendaily.data.models.Item


/**
 * Created by Felix on 10/04/2018.
 */

class CalendarAdapter(private val context: Context, private val list: List<Item>) : RecyclerView.Adapter<CalendarAdapter.ItemViewHolder>() {

    override fun getItemCount(): Int = list.size

    private fun getItem(position: Int): Item = list[position]

    override fun onBindViewHolder(holder: ItemViewHolder?, position: Int) {
        holder?.configure(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycle_view, parent, false)
        return ItemViewHolder(view)
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val txtDescription = view.findViewById<TextView>(R.id.txtDescription)!!
        private val txtClock = view.findViewById<TextView>(R.id.txtClock)!!

        fun configure(item: Item) {
            txtDescription.text = item.description
            txtClock.text = item.date
        }
    }

}
