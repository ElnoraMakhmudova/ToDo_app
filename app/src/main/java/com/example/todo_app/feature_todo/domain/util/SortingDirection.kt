package com.example.todo_app.feature_todo.domain.util

sealed class SortingDirection{
    object Up: SortingDirection()
    object Down: SortingDirection()
}
