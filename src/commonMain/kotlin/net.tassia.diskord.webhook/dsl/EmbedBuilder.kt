@file:Suppress("MemberVisibilityCanBePrivate")
package net.tassia.diskord.webhook.dsl

import net.tassia.diskord.webhook.*
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



	var footer: EmbedFooter? = null

	fun footer(text: String, icon: String? = null) {
		this.footer = EmbedFooter(text, icon)
	}



	var image: EmbedImage? = null

	fun image(url: String) {
		this.image = EmbedImage(url)
	}



	var thumbnail: EmbedThumbnail? = null

	fun thumbnail(url: String) {
		this.thumbnail = EmbedThumbnail(url)
	}



	var author: EmbedAuthor? = null

	fun author(name: String, url: String? = null, icon: String? = null) {
		this.author = EmbedAuthor(name, url, icon)
	}



	fun build(): Embed {
		return Embed(
			title = title,
			description = description,
			url = url,
			timestamp = timestamp,
			color = color,
			footer = footer,
			image = image,
			thumbnail = thumbnail,
			author = author,
			fields = fields,
		)
	}

}
