/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ProcessDefinitionSuspensionStateDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class ProcessDefinitionSuspensionStateDto {
  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_INCLUDE_PROCESS_INSTANCES = "includeProcessInstances";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PROCESS_INSTANCES)
  private Boolean includeProcessInstances;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "executionDate";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  private OffsetDateTime executionDate;


  public ProcessDefinitionSuspensionStateDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * A &#x60;Boolean&#x60; value which indicates whether to activate or suspend all process definitions with the given key. When the value is set to &#x60;true&#x60;, all process definitions with the given key will be suspended and when the value is set to &#x60;false&#x60;, all process definitions with the given key will be activated.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `Boolean` value which indicates whether to activate or suspend all process definitions with the given key. When the value is set to `true`, all process definitions with the given key will be suspended and when the value is set to `false`, all process definitions with the given key will be activated.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ProcessDefinitionSuspensionStateDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definitions to activate or suspend.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definitions to activate or suspend.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ProcessDefinitionSuspensionStateDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   *  The key of the process definitions to activate or suspend.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " The key of the process definitions to activate or suspend.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public ProcessDefinitionSuspensionStateDto includeProcessInstances(Boolean includeProcessInstances) {
    
    this.includeProcessInstances = includeProcessInstances;
    return this;
  }

   /**
   * A &#x60;Boolean&#x60; value which indicates whether to activate or suspend also all process instances of  the process definitions with the given key. When the value is set to &#x60;true&#x60;, all process instances of the process definitions with the given key will be activated or suspended and when the value is set to &#x60;false&#x60;, the suspension state of  all process instances of the process definitions with the given key will not be updated.
   * @return includeProcessInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A `Boolean` value which indicates whether to activate or suspend also all process instances of  the process definitions with the given key. When the value is set to `true`, all process instances of the process definitions with the given key will be activated or suspended and when the value is set to `false`, the suspension state of  all process instances of the process definitions with the given key will not be updated.")

  public Boolean getIncludeProcessInstances() {
    return includeProcessInstances;
  }


  public void setIncludeProcessInstances(Boolean includeProcessInstances) {
    this.includeProcessInstances = includeProcessInstances;
  }


  public ProcessDefinitionSuspensionStateDto executionDate(OffsetDateTime executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * The date on which all process definitions with the given key will be activated or suspended. If &#x60;null&#x60;, the suspension state of all process definitions with the given key is updated immediately. By [default](https://docs.camunda.org/manual/7.13/reference/rest/overview/date-format/), the date must have the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ, e.g., 2013-01-23T14:42:45.000+0200.
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which all process definitions with the given key will be activated or suspended. If `null`, the suspension state of all process definitions with the given key is updated immediately. By [default](https://docs.camunda.org/manual/7.13/reference/rest/overview/date-format/), the date must have the format yyyy-MM-dd'T'HH:mm:ss.SSSZ, e.g., 2013-01-23T14:42:45.000+0200.")

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionSuspensionStateDto processDefinitionSuspensionStateDto = (ProcessDefinitionSuspensionStateDto) o;
    return Objects.equals(this.suspended, processDefinitionSuspensionStateDto.suspended) &&
        Objects.equals(this.processDefinitionId, processDefinitionSuspensionStateDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processDefinitionSuspensionStateDto.processDefinitionKey) &&
        Objects.equals(this.includeProcessInstances, processDefinitionSuspensionStateDto.includeProcessInstances) &&
        Objects.equals(this.executionDate, processDefinitionSuspensionStateDto.executionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspended, processDefinitionId, processDefinitionKey, includeProcessInstances, executionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionSuspensionStateDto {\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    includeProcessInstances: ").append(toIndentedString(includeProcessInstances)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

