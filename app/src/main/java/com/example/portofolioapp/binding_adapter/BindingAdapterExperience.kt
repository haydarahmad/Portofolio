package com.example.portofolioapp.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.example.portofolioapp.data.Portofolio

class BindingAdapterExperience {
    @BindingAdapter("experienceTitle")
    fun TextView.setExperienceTitle(data:Portofolio){
        data?.let {
            text = data.title
        }
    }

    @BindingAdapter("experienceDetail")
    fun TextView.setExperienceDetail(data:Portofolio){
        data?.let {
            text = data.detail
        }
    }

    @BindingAdapter("experienceImage")
    fun ImageView.setExperienceImage(data:Portofolio){
            load(data.img){
                crossfade(1000)
            }
    }
}