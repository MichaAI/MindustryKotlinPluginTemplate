package replace.me.commands.client

import arc.util.CommandHandler
import replace.me.commands.client.admin.RegisterAdminCommands

val commands: Array<(CommandHandler) -> Unit> = arrayOf(RegisterAdminCommands::loadAll)

object RegisterClientCommands {
    fun loadAll(handler: CommandHandler) {
        commands.forEach { it(handler) }
    }
}