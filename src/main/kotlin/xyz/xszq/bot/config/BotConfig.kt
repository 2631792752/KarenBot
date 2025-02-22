package xyz.xszq.bot.config

import korlibs.io.file.VfsFile
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import net.mamoe.yamlkt.Yaml

@Serializable
data class BotConfig(
    val appId: String,
    val clientSecret: String,
    val token: String,
    val databaseUrl: String,
    val databaseUser: String,
    val databasePassword: String,
    val mongoUrl: String,
    val domainWhitelist: List<String>,
    val gifMaxSize: Double,
    val gifMaxFrames: Int,
    val auditMode: Boolean,
    val sandbox: Boolean,
    val cosSecretId: String,
    val cosSecretKey: String,
    val cosRegion: String,
    val cosAppId: String,
    val shardId: Int,
    val shardTotal: Int,
    val maxConnections: Int
) {
    companion object {
        private val yaml = Yaml {  }
        suspend fun load(file: VfsFile): BotConfig {
            return yaml.decodeFromString(file.readString())
        }
    }
}
