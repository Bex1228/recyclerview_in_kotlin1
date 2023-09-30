package com.example.hw_3_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_3_6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
     private lateinit var binding: FragmentFirstBinding
     private  val list = arrayListOf(
         Personage("Donald Duck", "https://upload.wikimedia.org/wikipedia/ru/5/5d/%D0%94%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%B4_%D0%94%D0%B0%D0%BA.png"),
         Personage("Tarzan", "https://static.wikia.nocookie.net/disney/images/2/2e/Profile_-_Tarzan.png/revision/latest?cb=20190821020257"),
         Personage("Pumba", "https://upload.wikimedia.org/wikipedia/ru/thumb/9/91/Pumbaa.png/420px-Pumbaa.png"),
         Personage("Alladin", "https://static.wikia.nocookie.net/disney/images/e/e7/Aladdin_character_icon.jpg/revision/latest?cb=20160613115608&path-prefix=ru"),
         Personage("Aid", "https://amiel.club/uploads/posts/2022-03/1647658259_1-amiel-club-p-aid-iz-gerkulesa-kartinki-1.jpg")
     )


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = PersonageAdapter(list)
        binding.rvContainer.adapter = adapter


    }



}