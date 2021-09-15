@file:Suppress("MemberVisibilityCanBePrivate")
package net.tassia.diskord.webhook.dsl

import net.tassia.diskord.webhook.Embed
import net.tassia.diskord.webhook.Message
import kotlin.js.JsName

class MessageBuilder {

	var content: String? = null
	var embeds: List<Embed> = mutableListOf()
		set(value) { field = value.toMutableList() }
	var files: String = "" // TODO

	fun embed(embed: Embed) {
		(embeds as MutableList<Embed>).add(embed)
	}

	@EmbedBuilderDSL
	fun embed(block: EmbedBuilder.() -> Unit) {
		embed(EmbedBuilder().also(block).build())
	}





	var username: String? = null
	var avatar: String? = null
	var tts: Boolean? = null

	@JsName("withTTS")
	fun tts() {
		this.tts = true
	}



	fun build(): Message {
		return Message(
			content = content ?: "",
			embeds = embeds,
			files = files,
			username = username,
			avatar = avatar,
			tts = tts ?: false,
		)
	}

}
