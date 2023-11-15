package com.example.numbers.domain.useCases

import com.example.numbers.domain.entity.GameSettings
import com.example.numbers.domain.entity.Level
import com.example.numbers.domain.repository.GameRepository

class GenerateQuestionUseCase (
    private val repository: GameRepository
        ){

    operator fun invoke(level: Level):GameSettings{
        return repository.getGameSettings(level)

    }

}