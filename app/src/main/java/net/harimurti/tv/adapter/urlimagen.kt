package net.harimurti.tv.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import net.harimurti.tv.R

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String?) {
    if (!url.isNullOrEmpty()) {
        Glide.with(view.context)
            .load(url)
            .placeholder(R.drawable.bannerr)
            .into(view)
    }else{
        view.setImageResource(R.drawable.bannerr)
    }
    }