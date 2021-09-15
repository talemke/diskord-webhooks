@file:Suppress("MemberVisibilityCanBePrivate")
package net.tassia.diskord.webhook.dsl

import net.tassia.diskord.webhook.Embed
import net.tassia.diskord.webhook.EmbedField
import kotlin.js.JsName

class EmbedBuilder {

	var title: String? = null
	var description: String? = null
	var url: String? = null



	var timestamp: Long? = null

	@JsName("timestampNow")
	fun timestamp() {
		this.timestamp = TODO("Multiplatform time not supported yet.")
	}



	var color: Int? = null

	fun rgb(r: Int, g: Int, b: Int) {
		val actualR = (r % 0xFF) shl 16 and 0xFF0000
		val actualG = (g % 0xFF) shl  8 and 0x00FF00
		val actualB = (b % 0xFF) shl  0 and 0x0000FF
		this.color = actualR or actualG or actualB
	}



	var fields: List<EmbedField> = mutableListOf()
		set(value) { field = value.toMutableList() }

	fun field(name: String, value: String, shouldInline: Boolean? = null) {
		val field = EmbedField(name, value, shouldInline)
		(fields as MutableList<EmbedField>).add(field)
	}



	fun build(): Embed {
		return Embed(
			title = title,
			description = description,
			url = url,
			timestamp = timestamp,
			color = color,
			footer = null, // TODO
			image = null, // TODO
			thumbnail = null, // TODO
			video = null, // TODO
			provider = null, // TODO
			author = null, // TODO
			fields = fields,
		)
	}

}
