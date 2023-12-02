package com.example.feedback2_2.model

import java.io.Serializable

class Paises(var nombre: String, var numeroHabitantes :Int) :Serializable  {
    override fun toString(): String {
        return nombre.toString()
    }
}