package com.kanini.bookfiltertask2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun InsertBooks(bookdetails: Book)
}