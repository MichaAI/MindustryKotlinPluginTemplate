package replace.me

import arc.util.CommandHandler
import mindustry.mod.Plugin
import replace.me.commands.client.RegisterClientCommands
import replace.me.commands.server.RegisterServerCommands

@Suppress("unused")
class Main : Plugin() {

    override fun init() {
        // Plugin init
    }

    override fun registerServerCommands(handler: CommandHandler) {
        RegisterServerCommands.loadAll(handler)
    }

    override fun registerClientCommands(handler: CommandHandler) {
        RegisterClientCommands.loadAll(handler)
    }
}