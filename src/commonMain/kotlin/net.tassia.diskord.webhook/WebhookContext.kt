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
	 * The ID of the webhook.
	 */
	val webhookID: Long,

	/**
	 * The token/secret of the webhook.
	 */
	val webhookToken: String,

	/**
	 * The server to send requests to.
	 */
	val server: String,

	/**
	 * The [HttpClient] to use under the hood.
	 */
	val client: HttpClient

) {

	/**
	 * The base URL of this webhook.
	 */
	val url = "$server/webhooks/$webhookID/$webhookToken"

}
