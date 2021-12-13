package com.kanini.bookfiltertask2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "authordetails")
data class Authors(@PrimaryKey(autoGenerate = true) val Aid:Int=0,
                   var author:String,
                   var country:String,)
