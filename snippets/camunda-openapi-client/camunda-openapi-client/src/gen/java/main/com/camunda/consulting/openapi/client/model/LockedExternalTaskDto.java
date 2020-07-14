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
import org.threeten.bp.OffsetDateTime;

/**
 * LockedExternalTaskDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class LockedExternalTaskDto {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activityId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_INSTANCE_ID = "activityInstanceId";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INSTANCE_ID)
  private String activityInstanceId;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCK_EXPIRATION_TIME = "lockExpirationTime";
  @SerializedName(SERIALIZED_NAME_LOCK_EXPIRATION_TIME)
  private OffsetDateTime lockExpirationTime;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_VERSION_TAG = "processDefinitionVersionTag";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_VERSION_TAG)
  private String processDefinitionVersionTag;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_WORKER_ID = "workerId";
  @SerializedName(SERIALIZED_NAME_WORKER_ID)
  private String workerId;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Long priority;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, VariableValueDto> variables = null;


  public LockedExternalTaskDto activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity that this external task belongs to.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity that this external task belongs to.")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public LockedExternalTaskDto activityInstanceId(String activityInstanceId) {
    
    this.activityInstanceId = activityInstanceId;
    return this;
  }

   /**
   * The id of the activity instance that the external task belongs to.
   * @return activityInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity instance that the external task belongs to.")

  public String getActivityInstanceId() {
    return activityInstanceId;
  }


  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }


  public LockedExternalTaskDto errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The full error message submitted with the latest reported failure executing this task;&#x60;null&#x60; if no failure was reported previously or if no error message was submitted
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full error message submitted with the latest reported failure executing this task;`null` if no failure was reported previously or if no error message was submitted")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public LockedExternalTaskDto errorDetails(String errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * The error details submitted with the latest reported failure executing this task.&#x60;null&#x60; if no failure was reported previously or if no error details was submitted
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error details submitted with the latest reported failure executing this task.`null` if no failure was reported previously or if no error details was submitted")

  public String getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }


  public LockedExternalTaskDto executionId(String executionId) {
    
    this.executionId = executionId;
    return this;
  }

   /**
   * The id of the execution that the external task belongs to.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the execution that the external task belongs to.")

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public LockedExternalTaskDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the external task.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the external task.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LockedExternalTaskDto lockExpirationTime(OffsetDateTime lockExpirationTime) {
    
    this.lockExpirationTime = lockExpirationTime;
    return this;
  }

   /**
   * The date that the task&#39;s most recent lock expires or has expired.
   * @return lockExpirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the task's most recent lock expires or has expired.")

  public OffsetDateTime getLockExpirationTime() {
    return lockExpirationTime;
  }


  public void setLockExpirationTime(OffsetDateTime lockExpirationTime) {
    this.lockExpirationTime = lockExpirationTime;
  }


  public LockedExternalTaskDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition the external task is defined in.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition the external task is defined in.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public LockedExternalTaskDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition the external task is defined in.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition the external task is defined in.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public LockedExternalTaskDto processDefinitionVersionTag(String processDefinitionVersionTag) {
    
    this.processDefinitionVersionTag = processDefinitionVersionTag;
    return this;
  }

   /**
   * The version tag of the process definition the external task is defined in.
   * @return processDefinitionVersionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version tag of the process definition the external task is defined in.")

  public String getProcessDefinitionVersionTag() {
    return processDefinitionVersionTag;
  }


  public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
  }


  public LockedExternalTaskDto processInstanceId(String processInstanceId) {
    
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The id of the process instance the external task belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance the external task belongs to.")

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public LockedExternalTaskDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The id of the tenant the external task belongs to.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant the external task belongs to.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public LockedExternalTaskDto retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * The number of retries the task currently has left.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of retries the task currently has left.")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public LockedExternalTaskDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * Whether the process instance the external task belongs to is suspended.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the process instance the external task belongs to is suspended.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public LockedExternalTaskDto workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * The id of the worker that posesses or posessed the most recent lock.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the worker that posesses or posessed the most recent lock.")

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public LockedExternalTaskDto priority(Long priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the external task.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The priority of the external task.")

  public Long getPriority() {
    return priority;
  }


  public void setPriority(Long priority) {
    this.priority = priority;
  }


  public LockedExternalTaskDto topicName(String topicName) {
    
    this.topicName = topicName;
    return this;
  }

   /**
   * The topic name of the external task.
   * @return topicName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The topic name of the external task.")

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public LockedExternalTaskDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance the external task belongs to.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance the external task belongs to.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public LockedExternalTaskDto variables(Map<String, VariableValueDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public LockedExternalTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A JSON object containing a property for each of the requested variables. The key is the variable name, the value is a JSON object of serialized variable values with the following properties:
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing a property for each of the requested variables. The key is the variable name, the value is a JSON object of serialized variable values with the following properties:")

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockedExternalTaskDto lockedExternalTaskDto = (LockedExternalTaskDto) o;
    return Objects.equals(this.activityId, lockedExternalTaskDto.activityId) &&
        Objects.equals(this.activityInstanceId, lockedExternalTaskDto.activityInstanceId) &&
        Objects.equals(this.errorMessage, lockedExternalTaskDto.errorMessage) &&
        Objects.equals(this.errorDetails, lockedExternalTaskDto.errorDetails) &&
        Objects.equals(this.executionId, lockedExternalTaskDto.executionId) &&
        Objects.equals(this.id, lockedExternalTaskDto.id) &&
        Objects.equals(this.lockExpirationTime, lockedExternalTaskDto.lockExpirationTime) &&
        Objects.equals(this.processDefinitionId, lockedExternalTaskDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, lockedExternalTaskDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersionTag, lockedExternalTaskDto.processDefinitionVersionTag) &&
        Objects.equals(this.processInstanceId, lockedExternalTaskDto.processInstanceId) &&
        Objects.equals(this.tenantId, lockedExternalTaskDto.tenantId) &&
        Objects.equals(this.retries, lockedExternalTaskDto.retries) &&
        Objects.equals(this.suspended, lockedExternalTaskDto.suspended) &&
        Objects.equals(this.workerId, lockedExternalTaskDto.workerId) &&
        Objects.equals(this.priority, lockedExternalTaskDto.priority) &&
        Objects.equals(this.topicName, lockedExternalTaskDto.topicName) &&
        Objects.equals(this.businessKey, lockedExternalTaskDto.businessKey) &&
        Objects.equals(this.variables, lockedExternalTaskDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityInstanceId, errorMessage, errorDetails, executionId, id, lockExpirationTime, processDefinitionId, processDefinitionKey, processDefinitionVersionTag, processInstanceId, tenantId, retries, suspended, workerId, priority, topicName, businessKey, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockedExternalTaskDto {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockExpirationTime: ").append(toIndentedString(lockExpirationTime)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

