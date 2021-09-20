package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmbedFooter (

	@SerialName("text")
	val text: String,

	@SerialName("icon_url")
	val icon: String?,

)
