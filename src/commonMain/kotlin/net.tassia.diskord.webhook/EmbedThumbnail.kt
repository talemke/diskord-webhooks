package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmbedThumbnail (

	@SerialName("url")
	val url: String,

)
