# Todo App

A modern, clean, and simple Todo list application for Android, built entirely with Kotlin and Jetpack Compose. This project demonstrates the usage of the MVVM architecture pattern alongside modern Android development practices.

## Features

*   **Add Tasks:** Easily add new tasks to your to-do list.
*   **Mark as Done:** Toggle the completion status of a task with a checkbox (completed tasks are visually struck through).
*   **Delete Tasks:** Remove tasks you no longer need.
*   **Persistent Storage:** Tasks are saved locally on the device, meaning they persist even if the app is closed or the device is restarted.

## Tech Stack & Architecture

This project is built using the recommended modern Android tech stack:

*   **UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose) - Android's modern toolkit for building native UI declaratively.
*   **Architecture:** MVVM (Model-View-ViewModel) - Separates the UI layer from the underlying data and business logic.
*   **Database:** [Room](https://developer.android.com/training/data-storage/room) - An abstraction layer over SQLite for robust local data persistence.
*   **Asynchrony:** [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html) - For handling asynchronous database operations and providing reactive data streams to the UI.

## Project Structure

If you'd like to explore the code, here is a quick guide to the project structure:

*   `data/`
    *   `Todo.kt`: The Room Entity representing a single database row.
    *   `TodoDao.kt`: Data Access Object containing SQL queries.
    *   `TodoDatabase.kt`: The Room Database configuration.
    *   `TodoRepository.kt`: The single source of truth that abstracts database access.
*   `viewmodel/`
    *   `TodoViewModel.kt`: Manages UI state and communicates with the Repository.
    *   `TodoViewModelFactory.kt`: Factory to construct the ViewModel with dependencies.
*   `ui.theme/`
    *   `TodoScreen.kt`: The main screen composable containing the list and input field.
    *   `TodoItem.kt`: The composable representing a single row in the Todo list.
*   `MainActivity.kt`: The entry point that sets up the database, repository, viewmodel, and launches the Compose UI.

## Getting Started

1.  Clone this repository.
2.  Open the project in **Android Studio**.
3.  Allow Gradle to sync and build the project.
4.  Run the application on an emulator or physical device.
