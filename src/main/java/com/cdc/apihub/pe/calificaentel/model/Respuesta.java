package com.cdc.apihub.pe.calificaentel.model;

import java.util.Objects;

import com.cdc.apihub.pe.calificaentel.model.Motivos;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("folio")
  private String folio = null;
  @SerializedName("numConsulta")
  private BigDecimal numConsulta = null;
  @SerializedName("resultado")
  private String resultado = null;
  @SerializedName("claveResultado")
  private String claveResultado = null;
  @SerializedName("topeEquipos")
  private String topeEquipos = null;
  @SerializedName("cedCargoFijo")
  private String cedCargoFijo = null;
  @SerializedName("ceVep")
  private String ceVep = null;
  @SerializedName("oferta")
  private String oferta = null;
  @SerializedName("plazoMaximo")
  private String plazoMaximo = null;
  @SerializedName("cuotaInicialMinima")
  private String cuotaInicialMinima = null;
  @SerializedName("cargoReciboMaximo")
  private String cargoReciboMaximo = null;
  @SerializedName("porcentaje")
  private String porcentaje = null;
  @SerializedName("mensajeOtros")
  private String mensajeOtros = null;
  @SerializedName("decil")
  private String decil = null;
  @SerializedName("promocionVigente")
  private String promocionVigente = null;
  @SerializedName("motivos")
  private List<Motivos> motivos = null;
  public Respuesta folio(String folio) {
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
  public Respuesta numConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "1574898.0", value = "Número de consulta de Círculo de Crédito.")
  public BigDecimal getNumConsulta() {
    return numConsulta;
  }
  public void setNumConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
  }
  public Respuesta resultado(String resultado) {
    this.resultado = resultado;
    return this;
  }
   
  @ApiModelProperty(example = "CONDICIONADO", value = "Resultado de la evaluación.")
  public String getResultado() {
    return resultado;
  }
  public void setResultado(String resultado) {
    this.resultado = resultado;
  }
  public Respuesta claveResultado(String claveResultado) {
    this.claveResultado = claveResultado;
    return this;
  }
   
  @ApiModelProperty(example = "3", value = "Identificador del resultado de la evaluación.")
  public String getClaveResultado() {
    return claveResultado;
  }
  public void setClaveResultado(String claveResultado) {
    this.claveResultado = claveResultado;
  }
  public Respuesta topeEquipos(String topeEquipos) {
    this.topeEquipos = topeEquipos;
    return this;
  }
   
  @ApiModelProperty(example = "10", value = "Tope de Equipos Disponibles calculado en la evaluación.")
  public String getTopeEquipos() {
    return topeEquipos;
  }
  public void setTopeEquipos(String topeEquipos) {
    this.topeEquipos = topeEquipos;
  }
  public Respuesta cedCargoFijo(String cedCargoFijo) {
    this.cedCargoFijo = cedCargoFijo;
    return this;
  }
   
  @ApiModelProperty(example = "820", value = "Capacidad de Endeudamiento Disponible calculado en la evaluación.")
  public String getCedCargoFijo() {
    return cedCargoFijo;
  }
  public void setCedCargoFijo(String cedCargoFijo) {
    this.cedCargoFijo = cedCargoFijo;
  }
  public Respuesta ceVep(String ceVep) {
    this.ceVep = ceVep;
    return this;
  }
   
  @ApiModelProperty(example = "246", value = "Cuota Vep calculado en la evaluación.")
  public String getCeVep() {
    return ceVep;
  }
  public void setCeVep(String ceVep) {
    this.ceVep = ceVep;
  }
  public Respuesta oferta(String oferta) {
    this.oferta = oferta;
    return this;
  }
   
  @ApiModelProperty(example = "SIM", value = "Oferta comercial resultado de la evaluación.")
  public String getOferta() {
    return oferta;
  }
  public void setOferta(String oferta) {
    this.oferta = oferta;
  }
  public Respuesta plazoMaximo(String plazoMaximo) {
    this.plazoMaximo = plazoMaximo;
    return this;
  }
   
  @ApiModelProperty(example = "CONTADO", value = "Plazo de la Oferta comercial resultado de la evaluación.")
  public String getPlazoMaximo() {
    return plazoMaximo;
  }
  public void setPlazoMaximo(String plazoMaximo) {
    this.plazoMaximo = plazoMaximo;
  }
  public Respuesta cuotaInicialMinima(String cuotaInicialMinima) {
    this.cuotaInicialMinima = cuotaInicialMinima;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Corresponde a la Cuota Inicial Mínima calculada.")
  public String getCuotaInicialMinima() {
    return cuotaInicialMinima;
  }
  public void setCuotaInicialMinima(String cuotaInicialMinima) {
    this.cuotaInicialMinima = cuotaInicialMinima;
  }
  public Respuesta cargoReciboMaximo(String cargoReciboMaximo) {
    this.cargoReciboMaximo = cargoReciboMaximo;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Corresponde a la Cargo de Recibo Máximo calculado.")
  public String getCargoReciboMaximo() {
    return cargoReciboMaximo;
  }
  public void setCargoReciboMaximo(String cargoReciboMaximo) {
    this.cargoReciboMaximo = cargoReciboMaximo;
  }
  public Respuesta porcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(example = "20", value = "Campo de uso futuro de momento se envía con contenido blanco.")
  public String getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
  }
  public Respuesta mensajeOtros(String mensajeOtros) {
    this.mensajeOtros = mensajeOtros;
    return this;
  }
   
  @ApiModelProperty(example = "Usuario evaluado en canal Otros", value = "Mensaje enviado cuando se usa el canal otros como medio de cálculo.")
  public String getMensajeOtros() {
    return mensajeOtros;
  }
  public void setMensajeOtros(String mensajeOtros) {
    this.mensajeOtros = mensajeOtros;
  }
  public Respuesta decil(String decil) {
    this.decil = decil;
    return this;
  }
   
  @ApiModelProperty(example = "D4", value = "Clave del decil.")
  public String getDecil() {
    return decil;
  }
  public void setDecil(String decil) {
    this.decil = decil;
  }
  public Respuesta promocionVigente(String promocionVigente) {
    this.promocionVigente = promocionVigente;
    return this;
  }
   
  @ApiModelProperty(example = "", value = "Corresponde al nombre de la campaña a la que aplica la empresa evaluada.")
  public String getPromocionVigente() {
    return promocionVigente;
  }
  public void setPromocionVigente(String promocionVigente) {
    this.promocionVigente = promocionVigente;
  }
  public Respuesta motivos(List<Motivos> motivos) {
    this.motivos = motivos;
    return this;
  }
  public Respuesta addMotivosItem(Motivos motivosItem) {
    if (this.motivos == null) {
      this.motivos = new ArrayList<Motivos>();
    }
    this.motivos.add(motivosItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"condicion\":\"Presenta adeudos pendientes por S/. 297\",\"descripcion\":\"Cliente presenta adeudos pendientes con Entel.\",\"motivo\":\"CO01\"},{\"condicion\":\"Cliente con morosidad comercial TE.\",\"descripcion\":\"Cliente con morosidad comercial TE.\",\"motivo\":\"CO07\"},{\"condicion\":\"Presenta adeudos pendientes:\",\"descripcion\":\"Empresa Relacionada presenta adeudos pendientes con ENTEL.\",\"motivo\":\"CO08\"}]", value = "Motivos de la calificación generada.")
  public List<Motivos> getMotivos() {
    return motivos;
  }
  public void setMotivos(List<Motivos> motivos) {
    this.motivos = motivos;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folio, respuesta.folio) &&
        Objects.equals(this.numConsulta, respuesta.numConsulta) &&
        Objects.equals(this.resultado, respuesta.resultado) &&
        Objects.equals(this.claveResultado, respuesta.claveResultado) &&
        Objects.equals(this.topeEquipos, respuesta.topeEquipos) &&
        Objects.equals(this.cedCargoFijo, respuesta.cedCargoFijo) &&
        Objects.equals(this.ceVep, respuesta.ceVep) &&
        Objects.equals(this.oferta, respuesta.oferta) &&
        Objects.equals(this.plazoMaximo, respuesta.plazoMaximo) &&
        Objects.equals(this.cuotaInicialMinima, respuesta.cuotaInicialMinima) &&
        Objects.equals(this.cargoReciboMaximo, respuesta.cargoReciboMaximo) &&
        Objects.equals(this.porcentaje, respuesta.porcentaje) &&
        Objects.equals(this.mensajeOtros, respuesta.mensajeOtros) &&
        Objects.equals(this.decil, respuesta.decil) &&
        Objects.equals(this.promocionVigente, respuesta.promocionVigente) &&
        Objects.equals(this.motivos, respuesta.motivos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folio, numConsulta, resultado, claveResultado, topeEquipos, cedCargoFijo, ceVep, oferta, plazoMaximo, cuotaInicialMinima, cargoReciboMaximo, porcentaje, mensajeOtros, decil, promocionVigente, motivos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
    sb.append("    resultado: ").append(toIndentedString(resultado)).append("\n");
    sb.append("    claveResultado: ").append(toIndentedString(claveResultado)).append("\n");
    sb.append("    topeEquipos: ").append(toIndentedString(topeEquipos)).append("\n");
    sb.append("    cedCargoFijo: ").append(toIndentedString(cedCargoFijo)).append("\n");
    sb.append("    ceVep: ").append(toIndentedString(ceVep)).append("\n");
    sb.append("    oferta: ").append(toIndentedString(oferta)).append("\n");
    sb.append("    plazoMaximo: ").append(toIndentedString(plazoMaximo)).append("\n");
    sb.append("    cuotaInicialMinima: ").append(toIndentedString(cuotaInicialMinima)).append("\n");
    sb.append("    cargoReciboMaximo: ").append(toIndentedString(cargoReciboMaximo)).append("\n");
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
    sb.append("    mensajeOtros: ").append(toIndentedString(mensajeOtros)).append("\n");
    sb.append("    decil: ").append(toIndentedString(decil)).append("\n");
    sb.append("    promocionVigente: ").append(toIndentedString(promocionVigente)).append("\n");
    sb.append("    motivos: ").append(toIndentedString(motivos)).append("\n");
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
