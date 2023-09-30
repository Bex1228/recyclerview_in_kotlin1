package com.example.hw_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_6.databinding.ItemPersonageBinding




class PersonageAdapter(private val personagesList: List<Personage>) :
    RecyclerView.Adapter<PersonageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPersonageBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(personagesList[position])
    }

    override fun getItemCount(): Int {
        return personagesList.size
    }

    inner class ViewHolder(private val binding: ItemPersonageBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item : Personage) {
            binding.run {
                item.run {
                   tvName.text = name
                    imgPhoto.loadImage(img)
                }
            }




        }
    }
}
