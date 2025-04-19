package replace.me.commands.client.admin

import arc.util.CommandHandler

val commands: Array<(CommandHandler) -> Unit> = arrayOf()

@Suppress("unused")
object RegisterAdminCommands {
    fun loadAll(handler: CommandHandler) {
        commands.forEach { it(handler) }
    }
}