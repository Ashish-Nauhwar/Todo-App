/**
 * Repository class that abstracts access to the data sources (in this case, the TodoDao).
 * It provides a clean API for the ViewModel to interact with the database and acts as a single source of truth for the data.
 */
package com.example.todoapp.data
import kotlinx.coroutines.flow.Flow

class TodoRepository(private val dao: TodoDao) {
    
    // A public property that exposes a reactive stream of the list of all todos from the DAO
    val allTodos: Flow<List<Todo>> = dao.getAllTodos()

    // A suspend function that calls the DAO to insert a new todo into the database
    suspend fun addTodo(todo: Todo) = dao.insertTodo(todo)
    suspend fun deleteTodo(todo: Todo) = dao.deleteTodo(todo)
    suspend fun updateTodo(todo: Todo) = dao.insertTodo(todo)
}