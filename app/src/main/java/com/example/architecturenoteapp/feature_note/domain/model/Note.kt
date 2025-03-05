package com.example.architecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.architecturenoteapp.ui.theme.*

@Entity
data class Note(
    val title :String,
    val content : String,
    val timestamp : Long,
    val color: Int,
    @PrimaryKey val id : Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

//Title Blank isEmpty 예외 처리
class InvalidNoteException(message : String) : Exception(message)
