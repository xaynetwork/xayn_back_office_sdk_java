# xayn_back_office_sdk

Back Office API
- API version: 1.0.0
  - Build date: 2022-12-19T14:21:56.879349Z[Etc/UTC]

# Back Office
For this system, a document is anything that has an id, a snippet, and an arbitrary set of properties.
The id uniquely identifies the document in the system.
The system uses the snippet to create a document representation that can be matched against user interests.

It is possible to attach any properties to a document; the system will not use them but will be returned together with the document when asking for personalized documents for a user. They could help store information like a title and the URL where it is possible to find the document. Each document can have its own set of properties.

The API offers an endpoint that allows uploading the documents to the system. After a successful upload, it will be possible to use the document in other endpoints.

# Auth
To authenticate with the API, a token will be provided.


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
  <version>v1.0.11</version>
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
     implementation "com.xayn:xayn_back_office_sdk:v1.0.11"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/xayn_back_office_sdk-v1.0.11.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.xayn.backoffice.ApiClient;
import com.xayn.backoffice.ApiException;
import com.xayn.backoffice.Configuration;
import com.xayn.backoffice.auth.*;
import com.xayn.backoffice.models.*;
import com.xayn.backoffice.BackOfficeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BackOfficeApi apiInstance = new BackOfficeApi(defaultClient);
    String documentId = "documentId_example"; // String | Id of the document
    try {
      apiInstance.deleteDocument(documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#deleteDocument");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BackOfficeApi* | [**deleteDocument**](docs/BackOfficeApi.md#deleteDocument) | **DELETE** /documents/{document_id} | Delete the document from the system.
*BackOfficeApi* | [**deleteDocumentProperties**](docs/BackOfficeApi.md#deleteDocumentProperties) | **DELETE** /documents/{document_id}/properties | Delete all document properties
*BackOfficeApi* | [**deleteDocumentProperty**](docs/BackOfficeApi.md#deleteDocumentProperty) | **DELETE** /documents/{document_id}/properties/{property_id} | Delete a document property
*BackOfficeApi* | [**deleteDocuments**](docs/BackOfficeApi.md#deleteDocuments) | **DELETE** /documents | Delete all listed documents.
*BackOfficeApi* | [**getDocumentProperties**](docs/BackOfficeApi.md#getDocumentProperties) | **GET** /documents/{document_id}/properties | Get all document properties
*BackOfficeApi* | [**getDocumentProperty**](docs/BackOfficeApi.md#getDocumentProperty) | **GET** /documents/{document_id}/properties/{property_id} | Get a document property
*BackOfficeApi* | [**ingestDocuments**](docs/BackOfficeApi.md#ingestDocuments) | **POST** /documents | Add documents to the system
*BackOfficeApi* | [**setDocumentProperties**](docs/BackOfficeApi.md#setDocumentProperties) | **PUT** /documents/{document_id}/properties | Set all document properties
*BackOfficeApi* | [**setDocumentProperty**](docs/BackOfficeApi.md#setDocumentProperty) | **PUT** /documents/{document_id}/properties/{property_id} | Set a document property


## Documentation for Models

 - [BaseError](docs/BaseError.md)
 - [DeleteDocumentsRequest](docs/DeleteDocumentsRequest.md)
 - [DocumentPropertiesRequest](docs/DocumentPropertiesRequest.md)
 - [DocumentPropertiesResponse](docs/DocumentPropertiesResponse.md)
 - [DocumentPropertyRequest](docs/DocumentPropertyRequest.md)
 - [DocumentPropertyResponse](docs/DocumentPropertyResponse.md)
 - [IngestedDocument](docs/IngestedDocument.md)
 - [IngestionError](docs/IngestionError.md)
 - [IngestionErrorAllOf](docs/IngestionErrorAllOf.md)
 - [IngestionErrorAllOfDetails](docs/IngestionErrorAllOfDetails.md)
 - [IngestionErrorAllOfDetailsDocuments](docs/IngestionErrorAllOfDetailsDocuments.md)
 - [IngestionRequest](docs/IngestionRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: authorizationToken
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



