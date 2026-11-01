/**
 * The main Room Database class for the app.
 * It serves as the primary access point for the underlying connection to the app's persisted, local SQLite data.
 */
package com.example.todoapp.data

import androidx.room.Database


@Database (entities = [Todo::class] , version = 1)
abstract class TodoDatabase{

}