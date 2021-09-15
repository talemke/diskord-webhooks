package net.tassia.diskord.webhook.dsl

import io.ktor.client.*
import net.tassia.diskord.webhook.WebhookContext

class WebhookBuilder {

	var id: Long? = null
	var token: String? = null
	var client: HttpClient? = null

	fun url(url: String) {
		TODO()
	}



	fun build(): WebhookContext {
		return WebhookContext(
			webhookID = id ?: throw IllegalStateException("The ID of the webhook was not specified."),
			webhookToken = token ?: throw IllegalStateException("The token of the webhook was not specified."),
			client = client ?: HttpClient(),
		)
	}

}
