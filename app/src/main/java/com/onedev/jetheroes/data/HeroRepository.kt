package com.onedev.jetheroes.data

import com.onedev.jetheroes.model.Hero
import com.onedev.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}