package com.cdc.apihub.pe.calificaentel.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Peticion {
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  @SerializedName("idUsuario")
  private String idUsuario = null;
  @SerializedName("idTipoOperacion")
  private String idTipoOperacion = null;
  public Peticion folio(String folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "000012", value = "Es el identificador de la consulta realizada por parte del cliente.")
  public String getFolio() {
    return folio;
  }
  public void setFolio(String folio) {
    this.folio = folio;
  }
  public Peticion tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "10", required = true, value = "<table><thead><tr>Tipo de documento que corresponde al número de documento que se quiere consultar</tr><tr><th>Tipo documento</th><th>Descripción</th></tr></thead><tbody><td>10</td><td>RUC</td></tr></tbody></table>")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public Peticion numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "20999999999", required = true, value = "Numero de documento de la persona que se quiera evaluar.")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  public Peticion idUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }
   
  @ApiModelProperty(example = "88888888", required = true, value = "Identificador del usuario que solicita la evaluación.")
  public String getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
  }
  public Peticion idTipoOperacion(String idTipoOperacion) {
    this.idTipoOperacion = idTipoOperacion;
    return this;
  }
   
  @ApiModelProperty(example = "VEN", required = true, value = "Código que corresponde al Tipo de operación para la evaluación. <table><thead><tr><th>id Tipo Operación</th><th>Descripción</th></tr></thead><tbody><tr><td>VEN</td><td>Móvil - Venta</td></tr><tr><td>PPR</td><td>Móvil - Portabilidad PrePago</td></tr><tr><td>PPO</td><td>Móvil - Portabilidad PostPago</td></tr><tr><td>HOG</td><td>Móvil - Hogar</td></tr><tr><td>CDM</td><td>Móvil - Renovación </td></tr><tr><td>FPO</td><td>Fijo – Portabilidad</td></tr><tr><td>FVE</td><td>Fijo – Venta</td></tr><tr><td>FPV</td><td>Fijo – Post Venta</td></tr><tr><td>FRE</td><td>Fijo - Renovación</td></tr></tbody></table>")
  public String getIdTipoOperacion() {
    return idTipoOperacion;
  }
  public void setIdTipoOperacion(String idTipoOperacion) {
    this.idTipoOperacion = idTipoOperacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.folio, peticion.folio) &&
        Objects.equals(this.tipoDocumento, peticion.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, peticion.numeroDocumento) &&
        Objects.equals(this.idUsuario, peticion.idUsuario) &&
        Objects.equals(this.idTipoOperacion, peticion.idTipoOperacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folio, tipoDocumento, numeroDocumento, idUsuario, idTipoOperacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    idTipoOperacion: ").append(toIndentedString(idTipoOperacion)).append("\n");
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
