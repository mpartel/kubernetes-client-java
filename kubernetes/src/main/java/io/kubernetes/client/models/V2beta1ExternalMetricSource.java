/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.models.V1LabelSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \&quot;target\&quot; type should be set.
 */
@ApiModel(description = "ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \"target\" type should be set.")

public class V2beta1ExternalMetricSource {
  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("metricSelector")
  private V1LabelSelector metricSelector = null;

  @SerializedName("targetAverageValue")
  private Quantity targetAverageValue = null;

  @SerializedName("targetValue")
  private Quantity targetValue = null;

  public V2beta1ExternalMetricSource metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question.
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public V2beta1ExternalMetricSource metricSelector(V1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }

   /**
   * metricSelector is used to identify a specific time series within a given metric.
   * @return metricSelector
  **/
  @ApiModelProperty(value = "metricSelector is used to identify a specific time series within a given metric.")
  public V1LabelSelector getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(V1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
  }

  public V2beta1ExternalMetricSource targetAverageValue(Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }

   /**
   * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
   * @return targetAverageValue
  **/
  @ApiModelProperty(value = "targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.")
  public Quantity getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(Quantity targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public V2beta1ExternalMetricSource targetValue(Quantity targetValue) {
    this.targetValue = targetValue;
    return this;
  }

   /**
   * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
   * @return targetValue
  **/
  @ApiModelProperty(value = "targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.")
  public Quantity getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(Quantity targetValue) {
    this.targetValue = targetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ExternalMetricSource v2beta1ExternalMetricSource = (V2beta1ExternalMetricSource) o;
    return Objects.equals(this.metricName, v2beta1ExternalMetricSource.metricName) &&
        Objects.equals(this.metricSelector, v2beta1ExternalMetricSource.metricSelector) &&
        Objects.equals(this.targetAverageValue, v2beta1ExternalMetricSource.targetAverageValue) &&
        Objects.equals(this.targetValue, v2beta1ExternalMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, metricSelector, targetAverageValue, targetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ExternalMetricSource {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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

