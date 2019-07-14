package com.palatin.viewpager2bug

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class VPAdapter : RecyclerView.Adapter<VPAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val color = with(Random()) {
            Color.argb(255, nextInt(256), nextInt(256), nextInt(256))
        }
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.layout_vp_item, parent, false).apply {
            setBackgroundColor(color)
        })
    }

    override fun getItemCount(): Int = 8

    override fun onBindViewHolder(holder: Holder, position: Int) {
    }

    class Holder(view: View) : RecyclerView.ViewHolder(view) {

    }
}