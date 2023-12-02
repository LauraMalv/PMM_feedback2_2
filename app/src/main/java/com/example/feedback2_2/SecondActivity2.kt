package com.example.feedback2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback2_2.databinding.ActivitySecond2Binding
import com.example.feedback2_2.model.Paises

class SecondActivity2 : AppCompatActivity() {

    private  lateinit var binding :ActivitySecond2Binding

    private lateinit var pais : Paises

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        pais = intent.extras!!.getSerializable("pais") as Paises
        binding.textViewNombre.text = "El pais" + " " + pais.nombre.toString()
        binding.textViewHabitantes.text = "tiene"+ " " + pais.numeroHabitantes.toString() +" " + "habitantes"






// binding.textoPais.text = "País seleccionado: ${paisSeleccionado.nombre.toString()}"
    }
}