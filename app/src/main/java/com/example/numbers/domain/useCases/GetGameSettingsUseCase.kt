package com.example.numbers.domain.useCases

import com.example.numbers.domain.entity.Question
import com.example.numbers.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

operator fun invoke(maxSumValue:Int):Question{
    return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)

}

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}

