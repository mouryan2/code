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
import com.camunda.consulting.openapi.client.model.VariableValueDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SignalDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class SignalDto {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, VariableValueDto> variables = null;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_WITHOUT_TENANT_ID = "withoutTenantId";
  @SerializedName(SERIALIZED_NAME_WITHOUT_TENANT_ID)
  private Boolean withoutTenantId;


  public SignalDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the signal to deliver.  **Note**: This property is mandatory.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the signal to deliver.  **Note**: This property is mandatory.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SignalDto executionId(String executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * Optionally specifies a single execution which is notified by the signal.  **Note**: If no execution id is defined the signal is broadcasted to all subscribed handlers. 
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionally specifies a single execution which is notified by the signal.  **Note**: If no execution id is defined the signal is broadcasted to all subscribed handlers. ")

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public SignalDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public SignalDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object.")

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  public SignalDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Specifies a tenant to deliver the signal. The signal can only be received on executions or process definitions which belongs to the given tenant.  **Note**: Cannot be used in combination with executionId.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a tenant to deliver the signal. The signal can only be received on executions or process definitions which belongs to the given tenant.  **Note**: Cannot be used in combination with executionId.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public SignalDto withoutTenantId(Boolean withoutTenantId) {
    
    this.withoutTenantId = withoutTenantId;
    return this;
  }

   /**
   * If true the signal can only be received on executions or process definitions which belongs to no tenant. Value may not be false as this is the default behavior.  **Note**: Cannot be used in combination with &#x60;executionId&#x60;.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true the signal can only be received on executions or process definitions which belongs to no tenant. Value may not be false as this is the default behavior.  **Note**: Cannot be used in combination with `executionId`.")

  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }


  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalDto signalDto = (SignalDto) o;
    return Objects.equals(this.name, signalDto.name) &&
        Objects.equals(this.executionId, signalDto.executionId) &&
        Objects.equals(this.variables, signalDto.variables) &&
        Objects.equals(this.tenantId, signalDto.tenantId) &&
        Objects.equals(this.withoutTenantId, signalDto.withoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, executionId, variables, tenantId, withoutTenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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

