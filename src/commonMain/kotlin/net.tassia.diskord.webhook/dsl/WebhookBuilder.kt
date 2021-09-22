package net.tassia.diskord.webhook.dsl

import io.ktor.client.*
import net.tassia.diskord.webhook.WebhookContext

class WebhookBuilder {

	var url: String? = null
	var client: HttpClient? = null

	fun build(): WebhookContext {
		return WebhookContext(
			url = url ?: throw IllegalStateException("No URL was specified."),
			client = client ?: HttpClient(),
		)
	}

}
