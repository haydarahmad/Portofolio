package com.example.portofolioapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.portofolioapp.data.Portofolio
import com.example.portofolioapp.databinding.ItemAndroidBinding

class RVAndroidAdapter: RecyclerView.Adapter<RVAndroidAdapter.AndroidViewHolder>() {

    private val listData = ArrayList<Portofolio>()
    var onItemCliked:((Portofolio) -> Unit)? = null

    fun setData(newsList: List<Portofolio>?) {
        if (newsList == null) return
        listData.clear()
        listData.addAll(newsList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder =
    AndroidViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_android,parent,false)
    )


    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        val listData : Portofolio = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
    inner class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding :ItemAndroidBinding = ItemAndroidBinding.bind(itemView)

        fun bind(data: Portofolio){
            binding.android = data
            binding.executePendingBindings()
        }
        init {
            binding.root.setOnClickListener{
                onItemCliked?.invoke(listData[adapterPosition])
            }
        }
    }
}

