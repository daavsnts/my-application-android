package com.daavsnts.application

import android.app.Application
import org.kodein.di.DI
import org.kodein.di.DIAware
import com.daavsnts.features.pokedex.di.pokedexModule

class App : Application(), DIAware {
    override val di = DI {
        import(pokedexModule)
    }
}