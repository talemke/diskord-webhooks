package net.tassia.diskord.webhook

import io.ktor.client.*

/**
 * Contains the context for a [DiscordWebhook].
 *
 * @since DiskordWebhooks 1.0
 * @author [Tassilo](https://github.com/TASSIA710)
 */
data class WebhookContext (

	/**
	 * The base URL of this webhook. Contains the server, webhook ID and token.
	 */
	val url: String,

	/**
	 * The [HttpClient] to use under the hood.
	 */
	val client: HttpClient

)
