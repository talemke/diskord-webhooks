# Kotlin Discord Webhooks

![](https://img.shields.io/github/license/talemke/diskord-webhooks?label=License)
![](https://img.shields.io/github/v/release/talemke/diskord-webhooks?label=Stable)
![](https://img.shields.io/github/v/release/talemke/diskord-webhooks?label=Preview&include_prereleases)

Multiplatform Kotlin library for sending Discord webhooks. Supports effectively all platforms
which are supported by [Ktor](https://github.com/ktorio/ktor) and
[kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization).





## Usage

1. Create a webhook instance.

```kotlin
import net.tassia.diskord.webhook.*

val webhook = Webhook("https://discord.com/api/webhooks/ID/TOKEN")
```

2. Send a message.

```kotlin
webhook.execute("Hello World!")
```

**Note:** `execute` is a suspending function.

### Other

[➥ View Artifact](https://nexus.tassia.net/#browse/browse:maven-public:net/tassia/diskord-webhooks/1.0.0)
