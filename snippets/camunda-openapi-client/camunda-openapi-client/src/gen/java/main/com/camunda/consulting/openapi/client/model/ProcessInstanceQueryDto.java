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
import com.camunda.consulting.openapi.client.model.ProcessInstanceQueryDtoSorting;
import com.camunda.consulting.openapi.client.model.VariableQueryParameterDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A process instance query which defines a group of process instances
 */
@ApiModel(description = "A process instance query which defines a group of process instances")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-14T01:59:23.608853+02:00[Europe/Berlin]")
public class ProcessInstanceQueryDto {
  public static final String SERIALIZED_NAME_DEPLOYMENT_ID = "deploymentId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ID)
  private String deploymentId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_ID = "processDefinitionId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_ID)
  private String processDefinitionId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY)
  private String processDefinitionKey;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY_IN = "processDefinitionKeyIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY_IN)
  private List<String> processDefinitionKeyIn = null;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_KEY_NOT_IN = "processDefinitionKeyNotIn";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_KEY_NOT_IN)
  private List<String> processDefinitionKeyNotIn = null;

  public static final String SERIALIZED_NAME_BUSINESS_KEY = "businessKey";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY)
  private String businessKey;

  public static final String SERIALIZED_NAME_BUSINESS_KEY_LIKE = "businessKeyLike";
  @SerializedName(SERIALIZED_NAME_BUSINESS_KEY_LIKE)
  private String businessKeyLike;

  public static final String SERIALIZED_NAME_CASE_INSTANCE_ID = "caseInstanceId";
  @SerializedName(SERIALIZED_NAME_CASE_INSTANCE_ID)
  private String caseInstanceId;

  public static final String SERIALIZED_NAME_SUPER_PROCESS_INSTANCE = "superProcessInstance";
  @SerializedName(SERIALIZED_NAME_SUPER_PROCESS_INSTANCE)
  private String superProcessInstance;

  public static final String SERIALIZED_NAME_SUB_PROCESS_INSTANCE = "subProcessInstance";
  @SerializedName(SERIALIZED_NAME_SUB_PROCESS_INSTANCE)
  private String subProcessInstance;

  public static final String SERIALIZED_NAME_SUPER_CASE_INSTANCE = "superCaseInstance";
  @SerializedName(SERIALIZED_NAME_SUPER_CASE_INSTANCE)
  private String superCaseInstance;

  public static final String SERIALIZED_NAME_SUB_CASE_INSTANCE = "subCaseInstance";
  @SerializedName(SERIALIZED_NAME_SUB_CASE_INSTANCE)
  private String subCaseInstance;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_SUSPENDED = "suspended";
  @SerializedName(SERIALIZED_NAME_SUSPENDED)
  private Boolean suspended;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_IDS = "processInstanceIds";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_IDS)
  private List<String> processInstanceIds = null;

  public static final String SERIALIZED_NAME_WITH_INCIDENT = "withIncident";
  @SerializedName(SERIALIZED_NAME_WITH_INCIDENT)
  private Boolean withIncident;

  public static final String SERIALIZED_NAME_INCIDENT_ID = "incidentId";
  @SerializedName(SERIALIZED_NAME_INCIDENT_ID)
  private String incidentId;

  public static final String SERIALIZED_NAME_INCIDENT_TYPE = "incidentType";
  @SerializedName(SERIALIZED_NAME_INCIDENT_TYPE)
  private String incidentType;

  public static final String SERIALIZED_NAME_INCIDENT_MESSAGE = "incidentMessage";
  @SerializedName(SERIALIZED_NAME_INCIDENT_MESSAGE)
  private String incidentMessage;

  public static final String SERIALIZED_NAME_INCIDENT_MESSAGE_LIKE = "incidentMessageLike";
  @SerializedName(SERIALIZED_NAME_INCIDENT_MESSAGE_LIKE)
  private String incidentMessageLike;

  public static final String SERIALIZED_NAME_TENANT_ID_IN = "tenantIdIn";
  @SerializedName(SERIALIZED_NAME_TENANT_ID_IN)
  private List<String> tenantIdIn = null;

  public static final String SERIALIZED_NAME_WITHOUT_TENANT_ID = "withoutTenantId";
  @SerializedName(SERIALIZED_NAME_WITHOUT_TENANT_ID)
  private Boolean withoutTenantId;

  public static final String SERIALIZED_NAME_PROCESS_DEFINITION_WITHOUT_TENANT_ID = "processDefinitionWithoutTenantId";
  @SerializedName(SERIALIZED_NAME_PROCESS_DEFINITION_WITHOUT_TENANT_ID)
  private Boolean processDefinitionWithoutTenantId;

  public static final String SERIALIZED_NAME_ACTIVITY_ID_IN = "activityIdIn";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID_IN)
  private List<String> activityIdIn = null;

  public static final String SERIALIZED_NAME_ROOT_PROCESS_INSTANCES = "rootProcessInstances";
  @SerializedName(SERIALIZED_NAME_ROOT_PROCESS_INSTANCES)
  private Boolean rootProcessInstances;

  public static final String SERIALIZED_NAME_LEAF_PROCESS_INSTANCES = "leafProcessInstances";
  @SerializedName(SERIALIZED_NAME_LEAF_PROCESS_INSTANCES)
  private Boolean leafProcessInstances;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<VariableQueryParameterDto> variables = null;

  public static final String SERIALIZED_NAME_VARIABLE_NAMES_IGNORE_CASE = "variableNamesIgnoreCase";
  @SerializedName(SERIALIZED_NAME_VARIABLE_NAMES_IGNORE_CASE)
  private Boolean variableNamesIgnoreCase;

  public static final String SERIALIZED_NAME_VARIABLE_VALUES_IGNORE_CASE = "variableValuesIgnoreCase";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VALUES_IGNORE_CASE)
  private Boolean variableValuesIgnoreCase;

  public static final String SERIALIZED_NAME_OR_QUERIES = "orQueries";
  @SerializedName(SERIALIZED_NAME_OR_QUERIES)
  private List<ProcessInstanceQueryDto> orQueries = null;

  public static final String SERIALIZED_NAME_SORTING = "sorting";
  @SerializedName(SERIALIZED_NAME_SORTING)
  private List<ProcessInstanceQueryDtoSorting> sorting = null;


  public ProcessInstanceQueryDto deploymentId(String deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Filter by the deployment the id belongs to.
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the deployment the id belongs to.")

  public String getDeploymentId() {
    return deploymentId;
  }


  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  public ProcessInstanceQueryDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Filter by the process definition the instances run on.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the process definition the instances run on.")

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ProcessInstanceQueryDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * Filter by the key of the process definition the instances run on.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the key of the process definition the instances run on.")

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public ProcessInstanceQueryDto processDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    
    this.processDefinitionKeyIn = processDefinitionKeyIn;
    return this;
  }

  public ProcessInstanceQueryDto addProcessDefinitionKeyInItem(String processDefinitionKeyInItem) {
    if (this.processDefinitionKeyIn == null) {
      this.processDefinitionKeyIn = new ArrayList<String>();
    }
    this.processDefinitionKeyIn.add(processDefinitionKeyInItem);
    return this;
  }

   /**
   * Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of Strings.
   * @return processDefinitionKeyIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a list of process definition keys. A process instance must have one of the given process definition keys. Must be a JSON array of Strings.")

  public List<String> getProcessDefinitionKeyIn() {
    return processDefinitionKeyIn;
  }


  public void setProcessDefinitionKeyIn(List<String> processDefinitionKeyIn) {
    this.processDefinitionKeyIn = processDefinitionKeyIn;
  }


  public ProcessInstanceQueryDto processDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
    return this;
  }

  public ProcessInstanceQueryDto addProcessDefinitionKeyNotInItem(String processDefinitionKeyNotInItem) {
    if (this.processDefinitionKeyNotIn == null) {
      this.processDefinitionKeyNotIn = new ArrayList<String>();
    }
    this.processDefinitionKeyNotIn.add(processDefinitionKeyNotInItem);
    return this;
  }

   /**
   * Exclude instances by a list of process definition keys. A process instance must not have one of the given process definition keys. Must be a JSON array of Strings.
   * @return processDefinitionKeyNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exclude instances by a list of process definition keys. A process instance must not have one of the given process definition keys. Must be a JSON array of Strings.")

  public List<String> getProcessDefinitionKeyNotIn() {
    return processDefinitionKeyNotIn;
  }


  public void setProcessDefinitionKeyNotIn(List<String> processDefinitionKeyNotIn) {
    this.processDefinitionKeyNotIn = processDefinitionKeyNotIn;
  }


  public ProcessInstanceQueryDto businessKey(String businessKey) {
    
    this.businessKey = businessKey;
    return this;
  }

   /**
   * Filter by process instance business key.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by process instance business key.")

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public ProcessInstanceQueryDto businessKeyLike(String businessKeyLike) {
    
    this.businessKeyLike = businessKeyLike;
    return this;
  }

   /**
   * Filter by process instance business key that the parameter is a substring of.
   * @return businessKeyLike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by process instance business key that the parameter is a substring of.")

  public String getBusinessKeyLike() {
    return businessKeyLike;
  }


  public void setBusinessKeyLike(String businessKeyLike) {
    this.businessKeyLike = businessKeyLike;
  }


  public ProcessInstanceQueryDto caseInstanceId(String caseInstanceId) {
    
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * Filter by case instance id.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by case instance id.")

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public ProcessInstanceQueryDto superProcessInstance(String superProcessInstance) {
    
    this.superProcessInstance = superProcessInstance;
    return this;
  }

   /**
   * Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.
   * @return superProcessInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict query to all process instances that are sub process instances of the given process instance. Takes a process instance id.")

  public String getSuperProcessInstance() {
    return superProcessInstance;
  }


  public void setSuperProcessInstance(String superProcessInstance) {
    this.superProcessInstance = superProcessInstance;
  }


  public ProcessInstanceQueryDto subProcessInstance(String subProcessInstance) {
    
    this.subProcessInstance = subProcessInstance;
    return this;
  }

   /**
   * Restrict query to all process instances that have the given process instance as a sub process instance. Takes a process instance id.
   * @return subProcessInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict query to all process instances that have the given process instance as a sub process instance. Takes a process instance id.")

  public String getSubProcessInstance() {
    return subProcessInstance;
  }


  public void setSubProcessInstance(String subProcessInstance) {
    this.subProcessInstance = subProcessInstance;
  }


  public ProcessInstanceQueryDto superCaseInstance(String superCaseInstance) {
    
    this.superCaseInstance = superCaseInstance;
    return this;
  }

   /**
   * Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.
   * @return superCaseInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict query to all process instances that are sub process instances of the given case instance. Takes a case instance id.")

  public String getSuperCaseInstance() {
    return superCaseInstance;
  }


  public void setSuperCaseInstance(String superCaseInstance) {
    this.superCaseInstance = superCaseInstance;
  }


  public ProcessInstanceQueryDto subCaseInstance(String subCaseInstance) {
    
    this.subCaseInstance = subCaseInstance;
    return this;
  }

   /**
   * Restrict query to all process instances that have the given case instance as a sub case instance. Takes a case instance id.
   * @return subCaseInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict query to all process instances that have the given case instance as a sub case instance. Takes a case instance id.")

  public String getSubCaseInstance() {
    return subCaseInstance;
  }


  public void setSubCaseInstance(String subCaseInstance) {
    this.subCaseInstance = subCaseInstance;
  }


  public ProcessInstanceQueryDto active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Only include active process instances. Value may only be true, as false is the default behavior.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include active process instances. Value may only be true, as false is the default behavior.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ProcessInstanceQueryDto suspended(Boolean suspended) {
    
    this.suspended = suspended;
    return this;
  }

   /**
   * Only include suspended process instances. Value may only be true, as false is the default behavior.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include suspended process instances. Value may only be true, as false is the default behavior.")

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ProcessInstanceQueryDto processInstanceIds(List<String> processInstanceIds) {
    
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ProcessInstanceQueryDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<String>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

   /**
   * Filter by a list of process instance ids. Must be a JSON array of Strings.
   * @return processInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a list of process instance ids. Must be a JSON array of Strings.")

  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }


  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }


  public ProcessInstanceQueryDto withIncident(Boolean withIncident) {
    
    this.withIncident = withIncident;
    return this;
  }

   /**
   * Filter by presence of incidents. Selects only process instances that have an incident.
   * @return withIncident
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by presence of incidents. Selects only process instances that have an incident.")

  public Boolean getWithIncident() {
    return withIncident;
  }


  public void setWithIncident(Boolean withIncident) {
    this.withIncident = withIncident;
  }


  public ProcessInstanceQueryDto incidentId(String incidentId) {
    
    this.incidentId = incidentId;
    return this;
  }

   /**
   * Filter by the incident id.
   * @return incidentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the incident id.")

  public String getIncidentId() {
    return incidentId;
  }


  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }


  public ProcessInstanceQueryDto incidentType(String incidentType) {
    
    this.incidentType = incidentType;
    return this;
  }

   /**
   * Filter by the incident type. See the User Guide for a list of incident types.
   * @return incidentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the incident type. See the User Guide for a list of incident types.")

  public String getIncidentType() {
    return incidentType;
  }


  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }


  public ProcessInstanceQueryDto incidentMessage(String incidentMessage) {
    
    this.incidentMessage = incidentMessage;
    return this;
  }

   /**
   * Filter by the incident message. Exact match.
   * @return incidentMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the incident message. Exact match.")

  public String getIncidentMessage() {
    return incidentMessage;
  }


  public void setIncidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
  }


  public ProcessInstanceQueryDto incidentMessageLike(String incidentMessageLike) {
    
    this.incidentMessageLike = incidentMessageLike;
    return this;
  }

   /**
   * Filter by the incident message that the parameter is a substring of.
   * @return incidentMessageLike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by the incident message that the parameter is a substring of.")

  public String getIncidentMessageLike() {
    return incidentMessageLike;
  }


  public void setIncidentMessageLike(String incidentMessageLike) {
    this.incidentMessageLike = incidentMessageLike;
  }


  public ProcessInstanceQueryDto tenantIdIn(List<String> tenantIdIn) {
    
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public ProcessInstanceQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<String>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

   /**
   * Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of Strings.
   * @return tenantIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a list of tenant ids. A process instance must have one of the given tenant ids. Must be a JSON array of Strings.")

  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }


  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }


  public ProcessInstanceQueryDto withoutTenantId(Boolean withoutTenantId) {
    
    this.withoutTenantId = withoutTenantId;
    return this;
  }

   /**
   * Only include process instances which belong to no tenant. Value may only be true, as false is the default behavior.
   * @return withoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include process instances which belong to no tenant. Value may only be true, as false is the default behavior.")

  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }


  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  public ProcessInstanceQueryDto processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

   /**
   * Only include process instances which process definition has no tenant id.
   * @return processDefinitionWithoutTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only include process instances which process definition has no tenant id.")

  public Boolean getProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }


  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }


  public ProcessInstanceQueryDto activityIdIn(List<String> activityIdIn) {
    
    this.activityIdIn = activityIdIn;
    return this;
  }

  public ProcessInstanceQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<String>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

   /**
   * Filter by a list of activity ids. A process instance must currently wait in a leaf activity with one of the given activity ids.
   * @return activityIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by a list of activity ids. A process instance must currently wait in a leaf activity with one of the given activity ids.")

  public List<String> getActivityIdIn() {
    return activityIdIn;
  }


  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }


  public ProcessInstanceQueryDto rootProcessInstances(Boolean rootProcessInstances) {
    
    this.rootProcessInstances = rootProcessInstances;
    return this;
  }

   /**
   * Restrict the query to all process instances that are top level process instances.
   * @return rootProcessInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict the query to all process instances that are top level process instances.")

  public Boolean getRootProcessInstances() {
    return rootProcessInstances;
  }


  public void setRootProcessInstances(Boolean rootProcessInstances) {
    this.rootProcessInstances = rootProcessInstances;
  }


  public ProcessInstanceQueryDto leafProcessInstances(Boolean leafProcessInstances) {
    
    this.leafProcessInstances = leafProcessInstances;
    return this;
  }

   /**
   * Restrict the query to all process instances that are leaf instances. (i.e. don&#39;t have any sub instances)
   * @return leafProcessInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restrict the query to all process instances that are leaf instances. (i.e. don't have any sub instances)")

  public Boolean getLeafProcessInstances() {
    return leafProcessInstances;
  }


  public void setLeafProcessInstances(Boolean leafProcessInstances) {
    this.leafProcessInstances = leafProcessInstances;
  }


  public ProcessInstanceQueryDto variables(List<VariableQueryParameterDto> variables) {
    
    this.variables = variables;
    return this;
  }

  public ProcessInstanceQueryDto addVariablesItem(VariableQueryParameterDto variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<VariableQueryParameterDto>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * A JSON array to only include process instances that have variables with certain values. The array consists of objects with the three properties &#x60;name&#x60;, &#x60;operator&#x60; and &#x60;value&#x60;. &#x60;name&#x60; (String) is the variable name, &#x60;operator&#x60; (String) is the comparison operator to be used and &#x60;value&#x60; the variable value. The &#x60;value&#x60; may be String, Number or Boolean.  Valid operator values are: &#x60;eq&#x60; - equal to; &#x60;neq&#x60; - not equal to; &#x60;gt&#x60; - greater than; &#x60;gteq&#x60; - greater than or equal to; &#x60;lt&#x60; - lower than; &#x60;lteq&#x60; - lower than or equal to; &#x60;like&#x60;.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array to only include process instances that have variables with certain values. The array consists of objects with the three properties `name`, `operator` and `value`. `name` (String) is the variable name, `operator` (String) is the comparison operator to be used and `value` the variable value. The `value` may be String, Number or Boolean.  Valid operator values are: `eq` - equal to; `neq` - not equal to; `gt` - greater than; `gteq` - greater than or equal to; `lt` - lower than; `lteq` - lower than or equal to; `like`.")

  public List<VariableQueryParameterDto> getVariables() {
    return variables;
  }


  public void setVariables(List<VariableQueryParameterDto> variables) {
    this.variables = variables;
  }


  public ProcessInstanceQueryDto variableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
    return this;
  }

   /**
   * Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.
   * @return variableNamesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match all variable names in this query case-insensitively. If set to true variableName and variablename are treated as equal.")

  public Boolean getVariableNamesIgnoreCase() {
    return variableNamesIgnoreCase;
  }


  public void setVariableNamesIgnoreCase(Boolean variableNamesIgnoreCase) {
    this.variableNamesIgnoreCase = variableNamesIgnoreCase;
  }


  public ProcessInstanceQueryDto variableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
    return this;
  }

   /**
   * Match all variable values in this query case-insensitively. If set to true variableValue and variablevalue are treated as equal.
   * @return variableValuesIgnoreCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match all variable values in this query case-insensitively. If set to true variableValue and variablevalue are treated as equal.")

  public Boolean getVariableValuesIgnoreCase() {
    return variableValuesIgnoreCase;
  }


  public void setVariableValuesIgnoreCase(Boolean variableValuesIgnoreCase) {
    this.variableValuesIgnoreCase = variableValuesIgnoreCase;
  }


  public ProcessInstanceQueryDto orQueries(List<ProcessInstanceQueryDto> orQueries) {
    
    this.orQueries = orQueries;
    return this;
  }

  public ProcessInstanceQueryDto addOrQueriesItem(ProcessInstanceQueryDto orQueriesItem) {
    if (this.orQueries == null) {
      this.orQueries = new ArrayList<ProcessInstanceQueryDto>();
    }
    this.orQueries.add(orQueriesItem);
    return this;
  }

   /**
   * A JSON array of nested process instance queries with OR semantics. A process instance matches a nested query if it fulfills at least one of the query&#39;s predicates. With multiple nested queries, a process instance must fulfill at least one predicate of each query (Conjunctive Normal Form). All process instance query properties can be used except for: &#x60;sorting&#x60; See the [User guide](https://docs.camunda.org/manual/7.13/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.
   * @return orQueries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON array of nested process instance queries with OR semantics. A process instance matches a nested query if it fulfills at least one of the query's predicates. With multiple nested queries, a process instance must fulfill at least one predicate of each query (Conjunctive Normal Form). All process instance query properties can be used except for: `sorting` See the [User guide](https://docs.camunda.org/manual/7.13/user-guide/process-engine/process-engine-api/#or-queries) for more information about OR queries.")

  public List<ProcessInstanceQueryDto> getOrQueries() {
    return orQueries;
  }


  public void setOrQueries(List<ProcessInstanceQueryDto> orQueries) {
    this.orQueries = orQueries;
  }


  public ProcessInstanceQueryDto sorting(List<ProcessInstanceQueryDtoSorting> sorting) {
    
    this.sorting = sorting;
    return this;
  }

  public ProcessInstanceQueryDto addSortingItem(ProcessInstanceQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<ProcessInstanceQueryDtoSorting>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

   /**
   * Apply sorting of the result
   * @return sorting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply sorting of the result")

  public List<ProcessInstanceQueryDtoSorting> getSorting() {
    return sorting;
  }


  public void setSorting(List<ProcessInstanceQueryDtoSorting> sorting) {
    this.sorting = sorting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceQueryDto processInstanceQueryDto = (ProcessInstanceQueryDto) o;
    return Objects.equals(this.deploymentId, processInstanceQueryDto.deploymentId) &&
        Objects.equals(this.processDefinitionId, processInstanceQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processInstanceQueryDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyIn, processInstanceQueryDto.processDefinitionKeyIn) &&
        Objects.equals(this.processDefinitionKeyNotIn, processInstanceQueryDto.processDefinitionKeyNotIn) &&
        Objects.equals(this.businessKey, processInstanceQueryDto.businessKey) &&
        Objects.equals(this.businessKeyLike, processInstanceQueryDto.businessKeyLike) &&
        Objects.equals(this.caseInstanceId, processInstanceQueryDto.caseInstanceId) &&
        Objects.equals(this.superProcessInstance, processInstanceQueryDto.superProcessInstance) &&
        Objects.equals(this.subProcessInstance, processInstanceQueryDto.subProcessInstance) &&
        Objects.equals(this.superCaseInstance, processInstanceQueryDto.superCaseInstance) &&
        Objects.equals(this.subCaseInstance, processInstanceQueryDto.subCaseInstance) &&
        Objects.equals(this.active, processInstanceQueryDto.active) &&
        Objects.equals(this.suspended, processInstanceQueryDto.suspended) &&
        Objects.equals(this.processInstanceIds, processInstanceQueryDto.processInstanceIds) &&
        Objects.equals(this.withIncident, processInstanceQueryDto.withIncident) &&
        Objects.equals(this.incidentId, processInstanceQueryDto.incidentId) &&
        Objects.equals(this.incidentType, processInstanceQueryDto.incidentType) &&
        Objects.equals(this.incidentMessage, processInstanceQueryDto.incidentMessage) &&
        Objects.equals(this.incidentMessageLike, processInstanceQueryDto.incidentMessageLike) &&
        Objects.equals(this.tenantIdIn, processInstanceQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, processInstanceQueryDto.withoutTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, processInstanceQueryDto.processDefinitionWithoutTenantId) &&
        Objects.equals(this.activityIdIn, processInstanceQueryDto.activityIdIn) &&
        Objects.equals(this.rootProcessInstances, processInstanceQueryDto.rootProcessInstances) &&
        Objects.equals(this.leafProcessInstances, processInstanceQueryDto.leafProcessInstances) &&
        Objects.equals(this.variables, processInstanceQueryDto.variables) &&
        Objects.equals(this.variableNamesIgnoreCase, processInstanceQueryDto.variableNamesIgnoreCase) &&
        Objects.equals(this.variableValuesIgnoreCase, processInstanceQueryDto.variableValuesIgnoreCase) &&
        Objects.equals(this.orQueries, processInstanceQueryDto.orQueries) &&
        Objects.equals(this.sorting, processInstanceQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, processDefinitionId, processDefinitionKey, processDefinitionKeyIn, processDefinitionKeyNotIn, businessKey, businessKeyLike, caseInstanceId, superProcessInstance, subProcessInstance, superCaseInstance, subCaseInstance, active, suspended, processInstanceIds, withIncident, incidentId, incidentType, incidentMessage, incidentMessageLike, tenantIdIn, withoutTenantId, processDefinitionWithoutTenantId, activityIdIn, rootProcessInstances, leafProcessInstances, variables, variableNamesIgnoreCase, variableValuesIgnoreCase, orQueries, sorting);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceQueryDto {\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyIn: ").append(toIndentedString(processDefinitionKeyIn)).append("\n");
    sb.append("    processDefinitionKeyNotIn: ").append(toIndentedString(processDefinitionKeyNotIn)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    businessKeyLike: ").append(toIndentedString(businessKeyLike)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    superProcessInstance: ").append(toIndentedString(superProcessInstance)).append("\n");
    sb.append("    subProcessInstance: ").append(toIndentedString(subProcessInstance)).append("\n");
    sb.append("    superCaseInstance: ").append(toIndentedString(superCaseInstance)).append("\n");
    sb.append("    subCaseInstance: ").append(toIndentedString(subCaseInstance)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    withIncident: ").append(toIndentedString(withIncident)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    incidentMessageLike: ").append(toIndentedString(incidentMessageLike)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    rootProcessInstances: ").append(toIndentedString(rootProcessInstances)).append("\n");
    sb.append("    leafProcessInstances: ").append(toIndentedString(leafProcessInstances)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    variableNamesIgnoreCase: ").append(toIndentedString(variableNamesIgnoreCase)).append("\n");
    sb.append("    variableValuesIgnoreCase: ").append(toIndentedString(variableValuesIgnoreCase)).append("\n");
    sb.append("    orQueries: ").append(toIndentedString(orQueries)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

