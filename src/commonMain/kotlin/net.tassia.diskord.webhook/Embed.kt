package net.tassia.diskord.webhook

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Message (

	@SerialName("content")
	val content: String,

	@SerialName("embeds")
	val embeds: String,

	@SerialName("files")
	val files: String,


	@SerialName("username")
	val username: String?,

	@SerialName("avatar_url")
	val avatarUrl: String?,

	@SerialName("tts")
	val tts: Boolean,

)
