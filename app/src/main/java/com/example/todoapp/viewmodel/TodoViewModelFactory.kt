/**
 * Factory class to instantiate the TodoViewModel.
 * This is required because the TodoViewModel has a parameterized constructor that takes a TodoRepository dependency,
 * which the default ViewModelProvider does not know how to inject.
 */
package com.example.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todoapp.data.TodoRepository

class TodoViewModelFactory(private val repository: TodoRepository) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TodoViewModel(repository) as T
    }

}