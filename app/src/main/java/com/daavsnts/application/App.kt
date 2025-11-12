package com.daavsnts.application

import android.app.Application
import org.kodein.di.DI
import org.kodein.di.DIAware
import com.daavsnts.network.di.networkModule
import com.daavsnts.data.di.dataModule
import com.daavsnts.domain.di.domainModule
import com.daavsnts.features.pokedex.di.pokedexModule

class App : Application(), DIAware {
    override val di = DI {
        import(networkModule)
        import(dataModule)
        import(domainModule)
        import(pokedexModule)
    }
}