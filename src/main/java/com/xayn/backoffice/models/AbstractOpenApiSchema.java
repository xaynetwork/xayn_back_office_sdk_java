/*
 * Back Office API
 * # Back Office The back office is typically used within server-side apps. This SDK acts as a create/read/update/delete interface for anything related to documents.  ## Document By document, we refer to a cohesive text, for example a complete news article. However, we only require a simple representation for our system to work. Consisting just of a unique ID, a text snippet and optional properties. The text snippet is ideally a short, meaningful representation of the larger document, reduced to just one paragraph.  ### Id The document_id is a unique identifier for a single document. We don't require a specific format, it just needs to comply to the following regexp: `^[a-zA-Z0-9_:@.-]+$`.  ## Snippet A snippet is a reduced representation of a larger text, for example if the document would be a news article, then its text would be the news article in a pure textual format. In order for our system to work correctly, it is important that the snippet is just the size of one or two paragraphs, and that the snippet's text clearly summarises the larger text. For example, let's take a news article which talks about the effects of inflation. Our snippet could then be: \"Inflation worries as prices keep rising. People having budgetary difficulties as a result. Government pressured to take action.\". A bad snippet would for example be just taking the very first paragraph of a document, which could sometimes work, but could also lead to: \"December 20th 2020. Article written by Jane Doe. On this bright and sunny day, people might forget about their worries sometimes.\"  ## Properties Properties are optional entries for documents, which are usually needed to properly show the document back to the user, when it returns as a personalized document. If for example, you'd wish to integrate a type of carousel view, listing a total of 10 personalized documents in a \"for you\"-section, then you might choose to display each document as an image and title, with a url to link the user to when pressed. For this, you would need three document properties: `image`, `link` and `title`. You are free to add as many properties as needed.  ## Auth The API requires an authentication token when used. Please see further down in this README.md file, or refer to the test included in this SDK's codebase, on how to set this token correctly. \\
 *
 * The version of the OpenAPI document: 1.0.0-rc6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xayn.backoffice.models;

import com.xayn.backoffice.ApiException;
import java.util.Objects;
import java.lang.reflect.Type;
import java.util.Map;
import javax.ws.rs.core.GenericType;

//import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Abstract class for oneOf,anyOf schemas defined in OpenAPI spec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T15:59:21.878312Z[Etc/UTC]")
public abstract class AbstractOpenApiSchema {

    // store the actual instance of the schema/object
    private Object instance;

    // is nullable
    private Boolean isNullable;

    // schema type (e.g. oneOf, anyOf)
    private final String schemaType;

    public AbstractOpenApiSchema(String schemaType, Boolean isNullable) {
        this.schemaType = schemaType;
        this.isNullable = isNullable;
    }

    /**
     * Get the list of oneOf/anyOf composed schemas allowed to be stored in this object
     *
     * @return an instance of the actual schema/object
     */
    public abstract Map<String, GenericType> getSchemas();

    /**
     * Get the actual instance
     *
     * @return an instance of the actual schema/object
     */
    //@JsonValue
    public Object getActualInstance() {return instance;}

    /**
     * Set the actual instance
     *
     * @param instance the actual instance of the schema/object
     */
    public void setActualInstance(Object instance) {this.instance = instance;}

    /**
     * Get the instant recursively when the schemas defined in oneOf/anyof happen to be oneOf/anyOf schema as well
     *
     * @return an instance of the actual schema/object
     */
    public Object getActualInstanceRecursively() {
        return getActualInstanceRecursively(this);
    }

    private Object getActualInstanceRecursively(AbstractOpenApiSchema object) {
        if (object.getActualInstance() == null) {
            return null;
        } else if (object.getActualInstance() instanceof AbstractOpenApiSchema) {
            return getActualInstanceRecursively((AbstractOpenApiSchema)object.getActualInstance());
        } else {
            return object.getActualInstance();
        }
    }

    /**
     * Get the schema type (e.g. anyOf, oneOf)
     *
     * @return the schema type
     */
    public String getSchemaType() {
        return schemaType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(getClass()).append(" {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractOpenApiSchema a = (AbstractOpenApiSchema) o;
        return Objects.equals(this.instance, a.instance) &&
            Objects.equals(this.isNullable, a.isNullable) &&
            Objects.equals(this.schemaType, a.schemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, isNullable, schemaType);
    }

    /**
     * Is nullable
     *
     * @return true if it's nullable
     */
    public Boolean isNullable() {
        if (Boolean.TRUE.equals(isNullable)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }



}
