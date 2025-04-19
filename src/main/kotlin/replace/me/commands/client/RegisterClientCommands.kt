package replace.me.commands.client

import arc.util.CommandHandler

val commands: Array<(CommandHandler) -> Unit> = arrayOf(RegisterClientCommands::loadAll)

object RegisterClientCommands {
    fun loadAll(handler: CommandHandler) {
        commands.forEach { it(handler) }
    }
}