package xyz.xszq.bot.dao

import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.id.EntityID

class TouhouMusic(id: EntityID<String>): Entity<String>(id) {
    companion object : EntityClass<String, TouhouMusic>(TouhouMusics)
    var name        by TouhouMusics.name
    var version     by TouhouMusics.version
    var filename    by TouhouMusics.filename
}