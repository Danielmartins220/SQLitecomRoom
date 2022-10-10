package com.example.sqlitecomroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class Usuario(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var nome: String,
    var sobrenome: String,
    var idade: Int
) {
}