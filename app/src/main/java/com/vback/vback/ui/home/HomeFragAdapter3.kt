package com.vback.vback.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.vback.vback.R

class HomeFragAdapter3(
    val arrayList: ArrayList<RecyclerFirstModel>,
    val context: Context
) : RecyclerView.Adapter<HomeFragAdapter3.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dash_recy3_item_view, parent, false)
        return HomeFragAdapter3.HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val pojo = arrayList[position]
        holder.imageView.setImageResource(pojo.image)
    }

    override fun getItemCount(): Int {
        if (arrayList.size == 0) {
            Toast.makeText(context, "List is empty", Toast.LENGTH_LONG).show()
        } else {

        }
        return arrayList.size
    }

    class HomeViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding) {
        val imageView: ImageView = itemView.findViewById(R.id.homeFrag_recy1_image)
    }

}