package net.tassia.diskord.webhook

import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import net.tassia.diskord.webhook.dsl.MessageBuilder
import net.tassia.diskord.webhook.dsl.MessageBuilderDSL

class DiscordWebhook(val context: WebhookContext) {

	@MessageBuilderDSL
	suspend inline fun execute(msg: Message, threadID: Long? = null) {
		val url = if (threadID != null) "${context.url}?thread_id=$threadID" else context.url
		context.client.post<HttpResponse>(url) {
			contentType(ContentType.Application.Json)
			this.body = msg
			this.expectSuccess = true
		}
	}

	@MessageBuilderDSL
	suspend inline fun execute(msg: String, threadID: Long? = null) {
		execute(threadID) {
			content = msg
		}
	}

	@MessageBuilderDSL
	suspend inline fun execute(threadID: Long? = null, block: MessageBuilder.() -> Unit) {
		val msg = MessageBuilder().also(block).build()
		execute(msg, threadID)
	}





	suspend inline fun reload() {
		TODO()
	}

	suspend inline fun update() {
		TODO()
	}

	suspend inline fun delete() {
		context.client.delete<HttpResponse>(context.url) {
			this.expectSuccess = true
		}
	}





	suspend inline fun fetchMessage(messageID: Long) {
		TODO()
	}

	suspend inline fun updateMessage(messageID: Long) {
		TODO()
	}

	suspend inline fun deleteMessage(messageID: Long) {
		TODO()
	}

}
