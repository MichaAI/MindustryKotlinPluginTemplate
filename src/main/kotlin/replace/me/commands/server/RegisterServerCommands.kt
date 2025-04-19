package replace.me.commands.server

import arc.util.CommandHandler

val commands: Array<(CommandHandler) -> Unit> = arrayOf()

object RegisterServerCommands {
    fun loadAll(handler: CommandHandler) {
        commands.forEach { it(handler) }
    }
}