package com.example.clase20_09_2022

class Estudiantes(val nombre:String,var edad:Int, val lenguajes:Array<progra>,val amigo:Array<Estudiantes>?=null) {
    enum class progra{
        KOTLIN,
        PHP,
        JAVA,
        PYTHON,
        JAVASCRIPT

    }


    fun codigo(){
        for(lenguaje:progra in lenguajes){
            println("Se programar en $lenguaje")
        }
    }
}