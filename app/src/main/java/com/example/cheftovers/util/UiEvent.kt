package com.example.cheftovers.util

import android.content.Context

/**
 * Describes various possible one-shot UI events throughout the app
 */
sealed class UiEvent {
    object PopBackStack: UiEvent()
    data class Navigate(val route : String): UiEvent()
    data class ShowToast(val message: String): UiEvent()
}
