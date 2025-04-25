package com.example.myunittest2

import javax.inject.Inject

class MessageRepository @Inject constructor() {
    fun getMessage(): String = "Hello Hilt + Compose!"
}
