package com.example.potatopaloozac.mvvmkotlinproj.model

import java.util.Observable

class User(): Observable() {

    var fname: String = ""
    set(value) {
        field = value
        setChangeAndNotify("fname")
    }

    var lname: String = ""
    set(value) {
        field = value
        setChangeAndNotify("lname")
    }

    var age: String = ""
    set(value) {
        field = value
        setChangeAndNotify("age")
    }

    fun setChangeAndNotify(field: Any) {
        setChanged()
        notifyObservers(field)
    }

}