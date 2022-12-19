# BackOfficeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDocument**](BackOfficeApi.md#deleteDocument) | **DELETE** /documents/{document_id} | Delete the document from the system. |
| [**deleteDocumentProperties**](BackOfficeApi.md#deleteDocumentProperties) | **DELETE** /documents/{document_id}/properties | Delete all document properties |
| [**deleteDocumentProperty**](BackOfficeApi.md#deleteDocumentProperty) | **DELETE** /documents/{document_id}/properties/{property_id} | Delete a document property |
| [**deleteDocuments**](BackOfficeApi.md#deleteDocuments) | **DELETE** /documents | Delete all listed documents. |
| [**getDocumentProperties**](BackOfficeApi.md#getDocumentProperties) | **GET** /documents/{document_id}/properties | Get all document properties |
| [**getDocumentProperty**](BackOfficeApi.md#getDocumentProperty) | **GET** /documents/{document_id}/properties/{property_id} | Get a document property |
| [**ingestDocuments**](BackOfficeApi.md#ingestDocuments) | **POST** /documents | Add documents to the system |
| [**setDocumentProperties**](BackOfficeApi.md#setDocumentProperties) | **PUT** /documents/{document_id}/properties | Set all document properties |
| [**setDocumentProperty**](BackOfficeApi.md#setDocumentProperty) | **PUT** /documents/{document_id}/properties/{property_id} | Set a document property |


<a name="deleteDocument"></a>
# **deleteDocument**
> deleteDocument(documentId)

Delete the document from the system.

Permanently deletes the document from the system. The endpoint is idempotent. Deleting a non-existing document does not produce an error.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid request |  -  |

<a name="deleteDocumentProperties"></a>
# **deleteDocumentProperties**
> deleteDocumentProperties(documentId)

Delete all document properties

Deletes all the properties of the document.

### Example
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
      apiInstance.deleteDocumentProperties(documentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#deleteDocumentProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid document id |  -  |
| **404** | document id not found |  -  |

<a name="deleteDocumentProperty"></a>
# **deleteDocumentProperty**
> deleteDocumentProperty(documentId, propertyId)

Delete a document property

Deletes the property of the document.

### Example
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
    String propertyId = "propertyId_example"; // String | Id of the document property
    try {
      apiInstance.deleteDocumentProperty(documentId, propertyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#deleteDocumentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |
| **propertyId** | **String**| Id of the document property | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid document id or property id |  -  |
| **404** | document id or property id not found |  -  |

<a name="deleteDocuments"></a>
# **deleteDocuments**
> deleteDocuments(deleteDocumentsRequest)

Delete all listed documents.

Delete all documents listed in the request body. The endpoint is idempotent. I.e. if the list contains one or multiple non-existing documents, no error is produced.

### Example
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
    DeleteDocumentsRequest deleteDocumentsRequest = new DeleteDocumentsRequest(); // DeleteDocumentsRequest | 
    try {
      apiInstance.deleteDocuments(deleteDocumentsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#deleteDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteDocumentsRequest** | [**DeleteDocumentsRequest**](DeleteDocumentsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid request |  -  |

<a name="getDocumentProperties"></a>
# **getDocumentProperties**
> DocumentPropertiesResponse getDocumentProperties(documentId)

Get all document properties

Gets all the properties of the document.

### Example
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
      DocumentPropertiesResponse result = apiInstance.getDocumentProperties(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#getDocumentProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |

### Return type

[**DocumentPropertiesResponse**](DocumentPropertiesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid document id |  -  |
| **404** | document id not found |  -  |

<a name="getDocumentProperty"></a>
# **getDocumentProperty**
> DocumentPropertyResponse getDocumentProperty(documentId, propertyId)

Get a document property

Gets the property of the document.

### Example
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
    String propertyId = "propertyId_example"; // String | Id of the document property
    try {
      DocumentPropertyResponse result = apiInstance.getDocumentProperty(documentId, propertyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#getDocumentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |
| **propertyId** | **String**| Id of the document property | |

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid document id or property id |  -  |
| **404** | document id or property id not found |  -  |

<a name="ingestDocuments"></a>
# **ingestDocuments**
> ingestDocuments(ingestionRequest)

Add documents to the system

Add documents to the system. The system will create a representation of the document that will be used to match it against the preferences of a user.

### Example
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
    IngestionRequest ingestionRequest = new IngestionRequest(); // IngestionRequest | 
    try {
      apiInstance.ingestDocuments(ingestionRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#ingestDocuments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ingestionRequest** | [**IngestionRequest**](IngestionRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid request |  -  |
| **500** | all or some of the documents were not successfully uploaded |  -  |

<a name="setDocumentProperties"></a>
# **setDocumentProperties**
> setDocumentProperties(documentId, documentPropertiesRequest)

Set all document properties

Sets or replaces all the properties of the document.

### Example
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
    DocumentPropertiesRequest documentPropertiesRequest = new DocumentPropertiesRequest(); // DocumentPropertiesRequest | 
    try {
      apiInstance.setDocumentProperties(documentId, documentPropertiesRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#setDocumentProperties");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |
| **documentPropertiesRequest** | [**DocumentPropertiesRequest**](DocumentPropertiesRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid document id |  -  |
| **404** | document id not found |  -  |

<a name="setDocumentProperty"></a>
# **setDocumentProperty**
> setDocumentProperty(documentId, propertyId, documentPropertyRequest)

Set a document property

Sets or replaces the property of the document.

### Example
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
    String propertyId = "propertyId_example"; // String | Id of the document property
    DocumentPropertyRequest documentPropertyRequest = new DocumentPropertyRequest(); // DocumentPropertyRequest | 
    try {
      apiInstance.setDocumentProperty(documentId, propertyId, documentPropertyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BackOfficeApi#setDocumentProperty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **documentId** | **String**| Id of the document | |
| **propertyId** | **String**| Id of the document property | |
| **documentPropertyRequest** | [**DocumentPropertyRequest**](DocumentPropertyRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successful operation |  -  |
| **400** | invalid document id or property id |  -  |
| **404** | document id not found |  -  |

