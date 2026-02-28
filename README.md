# API-ECosmetics
this repository only contains api methods, it is not the plugin code.
How to include the API with Maven:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.flestiz</groupId>
        <artifactId>API-ECosmetics</artifactId>
        <version>LAST-VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

How to include the API with Gradle:

```kotlin
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.flestiz:API-ECosmetics:LAST-VERSION"
}
```
