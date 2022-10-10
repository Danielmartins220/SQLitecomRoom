package com.example.sqlitecomroom.data

class UserRepository(private val userDao: UserDao) {
    val selecUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}