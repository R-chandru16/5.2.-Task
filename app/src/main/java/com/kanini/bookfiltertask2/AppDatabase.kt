package com.kanini.bookfiltertask2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Authors::class,Book::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun authorDao(): AuthorDao
    abstract fun BookDao():BookDao
    companion object{
        @Volatile
        private var INSTANCE:AppDatabase?=null
        fun getDatabase(context: Context):AppDatabase {
            val tempinstance= INSTANCE
            if(tempinstance!=null){
                return tempinstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "Myy_database"
                ).allowMainThreadQueries().build()
                INSTANCE=instance
                return instance
            }
        }
    }
}