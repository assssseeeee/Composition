package com.alan.composition.domain.usecases

import com.alan.composition.domain.entity.GameSettings
import com.alan.composition.domain.entity.Level
import com.alan.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level):GameSettings{
        return repository.getGameSettings(level)
    }
}