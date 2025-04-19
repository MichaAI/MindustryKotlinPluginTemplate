package replace.me.commands.client.admin

import arc.util.CommandHandler
import mindustry.gen.Player

@Suppress("unused")
fun CommandHandler.registerAdmin(text: String, args_desc: String, description: String, handler: (Array<String>, Player) -> Unit) {
    this.register(text, args_desc, description) {args, player: Player ->
        if (player.admin) {
            handler(args, player)
        } else {
            player.sendMessage("You are not an admin!")
        }
    }
}