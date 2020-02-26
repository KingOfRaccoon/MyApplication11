package com.arbonik.myapplication

import Kvant

object Kvantorium {
    var nameofkvantorium: String = ""
    var adress: String = ""
    var kvantnames: Array<String> = arrayOf("ИТ", "БИО", "РОБО")
    var spaces: Array<Int> = arrayOf(16, 12, 14)
    var desc: Array<String> = arrayOf("Ит Квантум", "Био Квантум", "Робо Квантум")
    var kvants: MutableList<Kvant> = mutableListOf()
    fun makekvant(type: String): Kvant {
        var k: Kvant = Kvant()
        when (type) {
            "it" -> {
                k.nameofkvant = kvantnames[0]
                k.space = spaces[0]
                k.description = desc[0]
            }
            "bio" -> {
                k.nameofkvant = kvantnames[1]
                k.space = spaces[1]
                k.description = desc[1]

            }
            "robo" -> {
                k.nameofkvant = kvantnames[2]
                k.space = spaces[2]
                k.description = desc[2]

            }
        }
        return k
    }

    fun addkvants() {
        for (i in 0..6)
            kvants.add(Kvant())

        kvants[0].nameofkvant = "IT-Квантум"
        kvants[1].nameofkvant = "VR/AR"
        kvants[2].nameofkvant = "Робоквантум"
        kvants[3].nameofkvant = "Биоквантум"
        kvants[4].nameofkvant = "Геоквантум"
        kvants[5].nameofkvant = "Аэроквантум"
        kvants[6].nameofkvant = "Хай-Тек"


    }
}