package com.cdc.apihub.pe.calificaentel.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Motivos {
  @SerializedName("condicion")
  private String condicion = null;
  @SerializedName("descripcion")
  private String descripcion = null;
  @SerializedName("motivo")
  private String motivo = null;
  public Motivos condicion(String condicion) {
    this.condicion = condicion;
    return this;
  }
   
  @ApiModelProperty(value = "Es la condición cuando se cumple la regla.")
  public String getCondicion() {
    return condicion;
  }
  public void setCondicion(String condicion) {
    this.condicion = condicion;
  }
  public Motivos descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(value = "Descripción cuando se cumple la regla.")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public Motivos motivo(String motivo) {
    this.motivo = motivo;
    return this;
  }
   
  @ApiModelProperty(value = "Clave del motivo de la evaluación.")
  public String getMotivo() {
    return motivo;
  }
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Motivos motivos = (Motivos) o;
    return Objects.equals(this.condicion, motivos.condicion) &&
        Objects.equals(this.descripcion, motivos.descripcion) &&
        Objects.equals(this.motivo, motivos.motivo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(condicion, descripcion, motivo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Motivos {\n");
    
    sb.append("    condicion: ").append(toIndentedString(condicion)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    motivo: ").append(toIndentedString(motivo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
