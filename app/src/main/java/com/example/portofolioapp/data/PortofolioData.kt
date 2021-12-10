package com.example.portofolioapp.data

import com.example.portofolioapp.R

object PortofolioData {
    private val title: Array<String> = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food app",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task manager App",
        "Office Automation App"
    )

    private val poster: IntArray = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office
    )

    private val link: Array<String> = arrayOf(
        "https://search.muz.li/NmU5MmY5YTM4",
        "https://pin.it/3ttUNfs",
        "https://pin.it/77qUdZ7",
        "https://pin.it/2RdMJ7Y",
        "https://pin.it/2LhIJHX",
        "https://pin.it/B8Zq5fV",
        "https://pin.it/6JUvToT",
        "https://pin.it/3tWyoXW",
        "https://pin.it/6xnCZEw",
        "https://pin.it/7pnOqvu",
    )


    val listAppAndroid: ArrayList<Portofolio>
        get() {
            val list: ArrayList<Portofolio> = arrayListOf()
            for (position in title.indices) {
                val android = Portofolio()
                android.title = title[position]
                android.img = poster[position]
                android.link = link[position]
                list.add(android)

            }
            return list
        }


    private val titleExperience: Array<String> = arrayOf(
        "Android Associated Developer",
        "Android pemula",
        "memulai program bahasa kotlin",
        "mamulai bahasa Program Phyton",
        "Solid Principle"
    )

    private val detailExperience: Array<String> = arrayOf(
        "Sertifikat ini merupakan sertifikat yang diterbitkan langsung oleh Google untuk developer Android",
        "Android pemula merupakan course yang diadakan oleh dicoding untuk memulai belajar program android",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas kotlin",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas python",
        "solid principle mempeljari tentang oop, clean code, dll"
    )

    private val imageExperience: IntArray = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )

    val listDataExperience: ArrayList<Portofolio>
        get() {
            val list: ArrayList<Portofolio> = arrayListOf()
            for (position: Int in titleExperience.indices) {
                val experience = Portofolio()
                experience.title = titleExperience[position]
                experience.detail = detailExperience[position]
                experience.img = imageExperience[position]
                list.add(experience)
            }
            return list
        }
}


