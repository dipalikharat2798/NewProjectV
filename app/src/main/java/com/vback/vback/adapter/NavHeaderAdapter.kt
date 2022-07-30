package com.vback.vback.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vback.vback.R
import com.vback.vback.model.NavHeaderModel

class NavHeaderAdapter : RecyclerView.Adapter<NavHeaderAdapter.ViewHolder> {
    var mList: MutableList<NavHeaderModel> = mutableListOf<NavHeaderModel>()
    lateinit var context: Context

    constructor()
    constructor(context: Context, mList: MutableList<NavHeaderModel>) : super() {
        this.mList = mList
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.navheader_itemlist, parent, false)
        return NavHeaderAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val navHeaderModel = mList[position]
        holder.imageView.setImageResource(navHeaderModel.image)
        holder.textView.setText(navHeaderModel.text)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.navHeader_imgv)
        val textView: TextView = itemView.findViewById(R.id.navHeader_tv)
    }
}