# xayn_back_office_sdk

Back Office API
- API version: 1.0.0-rc6
  - Build date: 2022-12-22T15:59:21.878312Z[Etc/UTC]

# Back Office
The back office is typically used within server-side apps.
This SDK acts as a create/read/update/delete interface for anything related to documents.

## Document
By document, we refer to a cohesive text, for example a complete news article.
However, we only require a simple representation for our system to work. Consisting just of a unique ID, a text snippet and optional properties.
The text snippet is ideally a short, meaningful representation of the larger document, reduced to just one paragraph.

### Id
The document_id is a unique identifier for a single document.
We don't require a specific format, it just needs to comply to the following regexp: `^[a-zA-Z0-9_:@.-]+$`.

## Snippet
A snippet is a reduced representation of a larger text, for example if the document would be a news article, then its text would be the news article in a pure textual format.
In order for our system to work correctly, it is important that the snippet is just the size of one or two paragraphs, and that the snippet's text clearly summarises the larger text.
For example, let's take a news article which talks about the effects of inflation.
Our snippet could then be: \"Inflation worries as prices keep rising. People having budgetary difficulties as a result. Government pressured to take action.\".
A bad snippet would for example be just taking the very first paragraph of a document, which could sometimes work, but could also lead to:
\"December 20th 2020. Article written by Jane Doe. On this bright and sunny day, people might forget about their worries sometimes.\"

## Properties
Properties are optional entries for documents, which are usually needed to properly show the document back to the user, when it returns as a personalized document.
If for example, you'd wish to integrate a type of carousel view, listing a total of 10 personalized documents in a \"for you\"-section, then you might choose to display each document as an image and title, with a url to link the user to when pressed.
For this, you would need three document properties: `image`, `link` and `title`.
You are free to add as many properties as needed.

## Auth
The API requires an authentication token when used.
Please see further down in this README.md file, or refer to the test included in this SDK's codebase, on how to set this token correctly.
\\


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xayn</groupId>
  <artifactId>xayn_back_office_sdk</artifactId>
  <version>1.0.16</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'xayn_back_office_sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'xayn_back_office_sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.xayn:xayn_back_office_sdk:1.0.16"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xayn_back_office_sdk-1.0.16.jar`
* `target/lib/*.jar`

