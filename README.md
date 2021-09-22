# Kotlin Discord Webhooks

![](https://img.shields.io/github/license/TASSIA710/diskord-webhooks?label=License)
![](https://img.shields.io/github/v/release/TASSIA710/diskord-webhooks?label=Stable)
![](https://img.shields.io/github/v/release/TASSIA710/diskord-webhooks?label=Preview&include_prereleases)
![](https://img.shields.io/github/workflow/status/TASSIA710/diskord-webhooks/Build/main?label=Build)

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





## Installation

### Gradle Kotlin

```kotlin
repositories {
    maven("https://nexus.tassia.net/repository/maven-public/")
}

dependencies {
    implementation("net.tassia", "diskord-webhooks", "1.0.0")
}
```

### Gradle Groovy

```groovy
repositories {
    maven {
        url = uri('https://nexus.tassia.net/repository/maven-public/')
    }
}

dependencies {
    implementation 'net.tassia:diskord-webhooks:1.0.0'
}
```

### Maven

```xml
<repository>
    <id>tassia-nexus</id>
    <url>https://nexus.tassia.net/repository/maven-public/</url>
</repository>
```
```xml
<dependency>
    <groupId>net.tassia</groupId>
    <artifactId>diskord-webhooks</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Other

[➥ View Artifact](https://nexus.tassia.net/#browse/browse:maven-public:net/tassia/diskord-webhooks/1.0.0)
