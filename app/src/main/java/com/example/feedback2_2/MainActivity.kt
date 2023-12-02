package com.example.feedback2_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.feedback2_2.databinding.ActivityMainBinding
import com.example.feedback2_2.model.Paises
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var adaptadorLista : ArrayAdapter<Paises>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaPaises : ArrayList <Paises> = ArrayList();

        listaPaises.add(Paises("Italia", 300000))
        listaPaises.add(Paises("Spain", 200000))
        listaPaises.add(Paises("Alemania", 900000))
        listaPaises.add(Paises("Francia", 400000))
        listaPaises.add(Paises("Portugal", 300000))
        listaPaises.add(Paises("Usa", 30000000))
        listaPaises.add(Paises("Suecia", 100000))
        listaPaises.add(Paises("Holanda", 600000))
        listaPaises.add(Paises("Reino Unido", 500000))
        listaPaises.add(Paises("Belgica", 700000))

        adaptadorLista =ArrayAdapter(applicationContext,android.R.layout.simple_list_item_1,listaPaises)

        binding.listViewPaises.adapter = adaptadorLista


        binding.listViewPaises.setOnItemLongClickListener { parent, view, position, id ->
            val paisSeleccionado = listaPaises[position]
            binding.textoPais.text = "País seleccionado: ${paisSeleccionado.nombre.toString()}"

            return@setOnItemLongClickListener true
        }


        binding.listViewPaises.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent (this,SecondActivity2 :: class.java)
            intent.putExtra("pais",listaPaises[position])
            startActivity(intent)
        }





    }




}

