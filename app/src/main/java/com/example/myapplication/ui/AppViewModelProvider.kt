package com.example.myapplication.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.InventoryApplication
import com.example.myapplication.ui.home.HomeViewModel
import com.example.myapplication.ui.item.ItemDetailsViewModel
import com.example.myapplication.ui.item.ItemEditViewModel
import com.example.myapplication.ui.item.ItemEntryViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            ItemEditViewModel(
                this.createSavedStateHandle()
            )
        }
        initializer {
            ItemEntryViewModel(inventoryApplication().container.itemsRepository)
        }

        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle()
            )
        }

        initializer {
            HomeViewModel()
        }
    }
}

fun CreationExtras.inventoryApplication(): InventoryApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)