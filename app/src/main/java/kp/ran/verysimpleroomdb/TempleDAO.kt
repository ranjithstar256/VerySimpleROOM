package kp.ran.verysimpleroomdb

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TempleDAO {

    @Insert
    suspend fun insertNewTemple(temple: Temple) // paused and resume

}