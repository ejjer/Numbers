package com.example.numbers.domain.entity

data class GameResult (
    val winner:Boolean,
    val countOfRightAnswers:Int,
    val contOfQuestions:Int,
    val gameSettings: GameSettings
        )