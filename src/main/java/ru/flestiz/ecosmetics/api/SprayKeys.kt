package ru.flestiz.ecosmetics.api

import ru.flestiz.ecosmetics.utils.MCNotInstalledException

enum class SprayKeys {
    SHIFT_F, SHIFT_E, SHIFT_Q, SHIFT_LC, SHIFT_RC, SHIFT_JUMP, API;

    fun isKey(key: SprayKeys): Boolean {
        throw MCNotInstalledException()
    }
}