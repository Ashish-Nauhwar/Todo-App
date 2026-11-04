/**
 * Data Access Object (DAO) for the Todo entity.
 * This interface provides the methods and SQL queries needed to interact with the "todos" table,
 * such as inserting, deleting, and fetching todo items.
 * pehle Todo naam ki Entity banayi thi, jo database ki table define karti hai.
 * Ab TodoDao batayega ki us table ke saath kaun-kaun se operations perform kar sakte hain.
 */
package com.example.todoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow



//@Dao ->Ye Room ko batata hai ki is interface mein database operations define kiye gaye hain
@Dao
//    Interface mein hum methods declare karte hain
interface TodoDao {

    //  database ki todos table se saara data fetch karo.
    @Query("SELECT * FROM todos")
    fun getAllTodos(): Flow<List<Todo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo): Long

    @Delete
    suspend fun deleteTodo(todo: Todo): Int
}