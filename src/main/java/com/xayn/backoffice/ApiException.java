/*
 * Back Office API
 * # Back Office The back office is typically used within server-side apps. This SDK acts as a create/read/update/delete interface for anything related to documents.  ## Document By document, we refer to a cohesive text, for example a complete news article. However, we only require a simple representation for our system to work. Consisting just of a unique ID, a text snippet and optional properties. The text snippet is ideally a short, meaningful representation of the larger document, reduced to just one paragraph.  ### Id The document_id is a unique identifier for a single document. We don't require a specific format, it just needs to comply to the following regexp: `^[a-zA-Z0-9_:@.-]+$`.  ## Snippet A snippet is a reduced representation of a larger text, for example if the document would be a news article, then its text would be the news article in a pure textual format. In order for our system to work correctly, it is important that the snippet is just the size of one or two paragraphs, and that the snippet's text clearly summarises the larger text. For example, let's take a news article which talks about the effects of inflation. Our snippet could then be: \"Inflation worries as prices keep rising. People having budgetary difficulties as a result. Government pressured to take action.\". A bad snippet would for example be just taking the very first paragraph of a document, which could sometimes work, but could also lead to: \"December 20th 2020. Article written by Jane Doe. On this bright and sunny day, people might forget about their worries sometimes.\"  ## Properties Properties are optional entries for documents, which are usually needed to properly show the document back to the user, when it returns as a personalized document. If for example, you'd wish to integrate a type of carousel view, listing a total of 10 personalized documents in a \"for you\"-section, then you might choose to display each document as an image and title, with a url to link the user to when pressed. For this, you would need three document properties: `image`, `link` and `title`. You are free to add as many properties as needed.  ## Auth The API requires an authentication token when used. Please see further down in this README.md file, or refer to the test included in this SDK's codebase, on how to set this token correctly. \\
 *
 * The version of the OpenAPI document: 1.0.0-rc10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xayn.backoffice;

import java.util.Map;
import java.util.List;

import javax.ws.rs.core.GenericType;

/**
 * <p>ApiException class.</p>
 */
@SuppressWarnings("serial")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-07T13:31:10.105795Z[Etc/UTC]")
public class ApiException extends Exception {
    private int code = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;
 
    /**
     * <p>Constructor for ApiException.</p>
     */
    public ApiException() {}

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param throwable a {@link java.lang.Throwable} object
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param message the error message
     * @param throwable a {@link java.lang.Throwable} object
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
        this("Response Code: " + code + " Response Body: " + responseBody, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message a {@link java.lang.String} object
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * <p>Constructor for ApiException.</p>
     *
     * @param code HTTP status code
     * @param message the error message
     * @param responseHeaders a {@link java.util.Map} of HTTP response headers
     * @param responseBody the response body
     */
    public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the HTTP response body.
     *
     * @return Response body in the form of string
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    public String getMessage() {
        return String.format("Message: %s%nHTTP response code: %s%nHTTP response body: %s%nHTTP response headers: %s",
                super.getMessage(), this.getCode(), this.getResponseBody(), this.getResponseHeaders());
    }
}
