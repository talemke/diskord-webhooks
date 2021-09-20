package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmbedField (

	@SerialName("name")
	val name: String,

	@SerialName("value")
	val value: String,

	@SerialName("inline")
	val shouldInline: Boolean?,

)
