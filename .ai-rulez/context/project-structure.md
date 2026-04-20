---
priority: medium
---

# Project Structure

## Build System

- Maven wrapper: `./mvnw verify` (no Taskfile, no Gradle)
- Java 25 with `--enable-preview`
- Enforcer plugin rejects lower Maven versions

## Coordinates

- Group: `dev.kreuzberg`, Artifact: `kreuzberg-spring-ai-document-reader`
- Package: `dev.kreuzberg.springai`

## Public API

- Single class: `KreuzbergDocumentReader implements DocumentReader` (Spring AI)
- Builder pattern for configuration

## Key Dependencies

- `dev.kreuzberg:kreuzberg` (Java binding, version property `kreuzberg.version`)
- `org.springframework.ai:spring-ai-commons`

## Quality Gates (`./mvnw verify`)

- Checkstyle, PMD/CPD, Spotless formatter, JaCoCo 80% line coverage

## Publishing

- Profile `publish`: GPG signing + Central Publishing Plugin (OSSRH)
