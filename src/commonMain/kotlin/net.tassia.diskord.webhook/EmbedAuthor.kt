package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmbedAuthor (

	@SerialName("name")
	val name: String,

	@SerialName("url")
	val url: String?,

	@SerialName("icon_url")
	val icon: String?,

)
