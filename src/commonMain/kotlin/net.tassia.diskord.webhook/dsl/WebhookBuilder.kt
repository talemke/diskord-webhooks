package net.tassia.diskord.webhook.dsl

import io.ktor.client.*
import net.tassia.diskord.webhook.WebhookContext

class WebhookBuilder {

	var id: Long? = null
	var token: String? = null
	var server: String? = null
	var client: HttpClient? = null

	var url: String
		get() = "$server/$id/$token"
		set(value) {
			val regex = Regex("([A-z0-9/.]+)/([0-9]+)/([A-z0-9_-]+)")
			val match = regex.matchEntire(value) ?: throw IllegalArgumentException("Illegal webhook URL")

			this.id = match.groupValues[2].toLong()
			this.token = match.groupValues[3]
			this.server = match.groupValues[1]
		}



	fun build(): WebhookContext {
		return WebhookContext(
			webhookID = id ?: throw IllegalStateException("The ID of the webhook was not specified."),
			webhookToken = token ?: throw IllegalStateException("The token of the webhook was not specified."),
			server = server ?: throw IllegalStateException("No server was specified."),
			client = client ?: HttpClient(),
		)
	}

}
