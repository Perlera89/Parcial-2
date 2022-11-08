package com.example.parcial_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LeonFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_leon, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARG_ANIMAL) }?.apply {
//            image = view.findViewById(R.id.iv_animal)
//            especie = view.findViewById(R.id.tv_especie)
//            sexo = view.findViewById(R.id.tv_sexo)
//            habitad = view.findViewById(R.id.tv_habitad)
//
//            for(animal in animales){
//                listAnimal.add(animal)
//            }
//
//            image.drawable = images.get(0)
        }
    }

    companion object {
        private const val ARG_ANIMAL = "animal"

    }
}