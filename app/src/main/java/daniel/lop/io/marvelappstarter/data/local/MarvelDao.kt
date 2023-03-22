package daniel.lop.io.marvelappstarter.data.local

import android.util.Log
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import daniel.lop.io.marvelappstarter.data.model.character.CharacterModel
import kotlinx.coroutines.flow.Flow

@Dao
interface MarvelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterModel: CharacterModel): Long

    @Query("SELECT * FROM characterModel ORDER BY id" )
    fun getAll(): Flow<List<CharacterModel>>

    @Delete
    suspend fun delete(characterModel: CharacterModel)


}