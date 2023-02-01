# xayn_back_office_sdk

Back Office API
- API version: 1.0.0-rc8
  - Build date: 2023-02-01T11:27:04.722435Z[Etc/UTC]

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
  <version>1.20.1</version>
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
     implementation "com.xayn:xayn_back_office_sdk:1.20.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xayn_back_office_sdk-1.20.1.jar`
* `target/lib/*.jar`

# Getting started

## Setting up the SDK

Our SDK includes a test code page, which simply invokes each existing method. Method invocation examples can always be copied from there.

This SDK has been generated via OpenAPI. The original spec files can be found in our [open source git repository](https://github.com/xaynetwork/xayn_discovery_engine/tree/main/web-api/openapi).
If preferred, you can also generate the SDK yourself using the tooling provided by [OpenAPI](https://www.openapis.org/).

The following code snippet initializes the API using 2 parameters:
- A `base_url`, which acts as the endpoint for API calls
- An authorization token

```java
BackOfficeApi api = new BackOfficeApi(new ApiClient());

api.getApiClient().setBasePath($URL).setApiKey($TOKEN);
```

## Creating documents

You can, submit multiple documents at once, with an upper limit of 100 documents per call.
If you need to create more documents, then split up your document list into batches of 100 each and then call this method sequentially.

Should one or more documents from a batch fail to be created, then the response will list these documents.

If you pass a document which _was already created in the past_, then you simply overwrite the old document with the newly provided one. This can only happen if we find the exact same document ID already in our system.

```java
List<IngestedDocument> documents = new ArrayList<IngestedDocument>();
Map<String, Object> properties = new HashMap<String, Object>();

properties
    .put("imageUrl", "https://...")
    .put("linkUrl", "https://...")
    .put("datePublished", "...")
    .put("author", "...");

documents
    .add(new IngestedDocument()
    .id("document_A")
    .snippet("one paragraph about document A")
    .properties(properties));

api.createDocuments(new IngestionRequest().documents(documents));
```

## Other operations

After documents have been created, you can continue to manage them in different ways.

Please refer to the test file to see some examples, below is a list of available methods:
- `deleteDocuments`
- `deleteDocument`
- `deleteDocumentProperties`
- `deleteDocumentProperty`
- `listDocumentProperties`
- `getDocumentProperty`
- `replaceDocumentProperties`
- `replaceDocumentProperty`