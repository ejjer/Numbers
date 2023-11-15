package com.example.numbers.domain.repository

import com.example.numbers.domain.entity.GameSettings
import com.example.numbers.domain.entity.Level
import com.example.numbers.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue:Int,
        countOfOptions:Int,
    ): Question
    fun getGameSettings(level: Level): GameSettings
}