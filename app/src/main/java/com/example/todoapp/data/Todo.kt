/**
 * Represents the Data Model/Entity for a single Todo item.
 * This class defines the schema for the "todos" table in the local SQLite database.
 */
package com.example.todoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val done: Boolean = false
)