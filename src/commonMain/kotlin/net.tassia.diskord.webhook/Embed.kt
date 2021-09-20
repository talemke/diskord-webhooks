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
	val footer: EmbedFooter?,

	@SerialName("image")
	val image: EmbedImage?,

	@SerialName("thumbnail")
	val thumbnail: EmbedThumbnail?,

	@SerialName("author")
	val author: EmbedAuthor?,

	@SerialName("fields")
	val fields: List<EmbedField>,

)
