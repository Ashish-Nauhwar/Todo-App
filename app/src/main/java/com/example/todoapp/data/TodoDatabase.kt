package com.example.todoapp.data

import androidx.room.Database


@Database (entities = [Todo::class] , version = 1)
abstract class TodoDatabase{

}