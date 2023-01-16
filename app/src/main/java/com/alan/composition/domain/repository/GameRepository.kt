package com.alan.composition.domain.repository

import com.alan.composition.domain.entity.GameSettings
import com.alan.composition.domain.entity.Level
import com.alan.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}