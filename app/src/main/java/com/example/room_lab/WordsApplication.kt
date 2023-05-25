package com.example.room_lab

import android.app.Application

class WordsApplication : Application() {
    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    public val repository by lazy { WordRepository(database.wordDao()) }
}