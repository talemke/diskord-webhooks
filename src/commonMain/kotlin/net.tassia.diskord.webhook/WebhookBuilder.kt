package net.tassia.diskord.webhook

import net.tassia.diskord.webhook.dsl.WebhookBuilder
import net.tassia.diskord.webhook.dsl.WebhookBuilderDSL

@WebhookBuilderDSL
@Suppress("FunctionName")
inline fun Webhook(block: WebhookBuilder.() -> Unit): DiscordWebhook {
	val context = WebhookBuilder().also(block).build()
	return DiscordWebhook(context)
}

@WebhookBuilderDSL
@Suppress("FunctionName")
inline fun Webhook(id: Long, token: String, block: WebhookBuilder.() -> Unit = {}): DiscordWebhook {
	return Webhook {
		this.id = id
		this.token = token
		this.block()
	}
}

@WebhookBuilderDSL
@Suppress("FunctionName")
inline fun Webhook(url: String, block: WebhookBuilder.() -> Unit = {}): DiscordWebhook {
	return Webhook {
		this.url = url
		this.block()
	}
}
