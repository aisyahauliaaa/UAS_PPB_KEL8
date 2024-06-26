package com.example.kokus

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Fungsi dari benda pada gambar dibawah ini adalah...",
            R.drawable.harddisk,
            "Penyimpanan data jangka panjang pada komputer ", "Melindungi komputer dari virus dan malware",
            "Penyimpanan data sementara yang digunakan komputer untuk menyimpan data yang sedang digunakan ","Untuk mengeluarkan hasil cetak dari komputer",
            1
        )

        val que2 = Question(
            2, "Komponen komputer apakah ini?",
            R.drawable.ram,
            "RAM", "Motherboard",
            "CPU","Baterai CMOS",
            1
        )

        val que3 = Question(
            3, "Fungsi dari perangkat keras dibawah ini adalah...",
            R.drawable.keyboard,
            " Untuk mengeluarkan hasil cetak dari komputer", "Penyimpanan data sementara yang digunakan komputer untuk menyimpan data yang sedang digunakan",
            " Untuk memasukkan data berupa teks ke dalam komputer","Penyimpanan data jangka panjang pada komputer",
            3
        )

        val que4 = Question(
            4, "Komponen dari komputer apakah ini?",
            R.drawable.motherboard,
            "RAM", "CPU",
            "Motherboard","Baterai CMOS",
            3
        )

        val que5 = Question(
            5, "Komponen dari komputer apakah ini?",
            R.drawable.bateraicmos,
            "Baterai Alkali", "Baterai CMOS",
            "Baterai DMOS","Baterai AA",
            2
        )

        val que6 = Question(
            6, "Fungsi dari benda pada gambar dibawah adalah...",
            R.drawable.ram,
            "Penyimpanan data jangka panjang pada komputer ", "Melindungi komputer dari virus dan malware",
            "Penyimpanan data sementara yang digunakan komputer untuk menyimpan data yang sedang digunakan ","Untuk mengeluarkan hasil cetak dari komputer",
            3
        )

        val que7 = Question(
            7, "Fungsi dari perangkat keras dibawah ini adalah...",
            R.drawable.mouse,
            " Untuk mengeluarkan hasil cetak dari komputer", "Penyimpanan data sementara yang digunakan komputer untuk menyimpan data yang sedang digunakan",
            "Untuk memasukkan data berupa teks ke dalam komputer","Untuk mengontrol dan berinteraksi dengan komputer",
            4
        )

        val que8 = Question(
            8, "Fungsi dari benda pada gambar dibawah adalah...",
            R.drawable.bateraicmos,
            " Untuk mengeluarkan hasil cetak dari komputer", "Menyimpan data waktu",
            "Untuk memasukkan data berupa teks ke dalam komputer","Untuk mengontrol dan berinteraksi dengan komputer",
            2
        )

        val que9 = Question(
            9, "Fungsi dari benda pada gambar dibawah ini adalah...",
            R.drawable.motherboard,
            "Sebaga penghubung segala jenis komponen komputer ", "Penyimpanan data sementara yang digunakan komputer untuk menyimpan data yang sedang digunakan",
            "Untuk memasukkan data berupa teks ke dalam komputer","Untuk mengontrol dan berinteraksi dengan komputer",
            1
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        return questionsList
    }

}