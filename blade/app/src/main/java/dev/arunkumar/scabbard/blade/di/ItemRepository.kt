package dev.arunkumar.scabbard.blade.di

import javax.inject.Inject

class Item

class ItemRepository @Inject constructor() {
    fun getItem(): Item = Item()
}


