package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Embed (

	@SerialName("title")
	val title: String?,

	@SerialName("description")
	val description: String?,

	@SerialName("url")
	val url: String?,

	@SerialName("timestamp")
	val timestamp: Long?,

	@SerialName("color")
	val color: Int?,

	@SerialName("footer")
	val footer: String?, // TODO

	@SerialName("image")
	val image: String?, // TODO

	@SerialName("thumbnail")
	val thumbnail: String?, // TODO

	@SerialName("video")
	val video: String?, // TODO

	@SerialName("provider")
	val provider: String?, // TODO

	@SerialName("author")
	val author: String?, // TODO

	@SerialName("fields")
	val fields: List<EmbedField>,

)

@Serializable
data class EmbedField (

	@SerialName("name")
	val name: String,

	@SerialName("value")
	val value: String,

	@SerialName("inline")
	val shouldInline: Boolean?

)
