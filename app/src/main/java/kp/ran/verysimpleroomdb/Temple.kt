package kp.ran.verysimpleroomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Temple")  // table name
data class Temple (

    @PrimaryKey(autoGenerate = true)
    var itemId: Int = 0,

    @ColumnInfo(name = "TempleName")  // column name 1
    var TempleName : String,


    @ColumnInfo(name = "Location")  // column name 2
    var Location : String,


    @ColumnInfo(name = "MainGod")  // column name 3
    var MainGod : String

)