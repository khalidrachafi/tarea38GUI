/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id_paciente",
    "nombre",
    "fechaNacimiento",
    "grupoSanguineo",
    "rh",
    "numeroDonaciones"
})
@Generated("jsonschema2pojo")
public class Donante {

    @JsonProperty("id_paciente")
    private String idPaciente;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("fechaNacimiento")
    private String fechaNacimiento;
    @JsonProperty("grupoSanguineo")
    private String grupoSanguineo;
    @JsonProperty("rh")
    private String rh;
    @JsonProperty("numeroDonaciones")
    private Integer numeroDonaciones;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Donante() {
    }

    /**
     *
     * @param idPaciente
     * @param grupoSanguineo
     * @param fechaNacimiento
     * @param rh
     * @param numeroDonaciones
     * @param nombre
     */
    public Donante(String idPaciente, String nombre, String fechaNacimiento, String grupoSanguineo, String rh, Integer numeroDonaciones) {
        super();
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
        this.numeroDonaciones = numeroDonaciones;
    }

    @JsonProperty("id_paciente")
    public String getIdPaciente() {
        return idPaciente;
    }

    @JsonProperty("id_paciente")
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Donante withIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
        return this;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Donante withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @JsonProperty("fechaNacimiento")
    public String getFechaNacimiento() {
        return fechaNacimiento;
                //LocalDate.parse(this.fechaNacimiento, DateTimeFormatter.ofPattern("MM/dd/uuuu"));
    }

//    @JsonProperty("fechaNacimiento")
//    public void setFechaNacimiento(LocalDate fechaNacimiento) {
//        // Convertir la fecha al formato MM/dd/uuuu
//        String fechaFormateada = fechaNacimiento.format(DateTimeFormatter.ofPattern("MM/dd/uuuu"));
//        // Asignar la fecha formateada como un String
//        this.fechaNacimiento = fechaFormateada;
//    }

    public Donante withFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    @JsonProperty("grupoSanguineo")
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    @JsonProperty("grupoSanguineo")
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Donante withGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
        return this;
    }

    @JsonProperty("rh")
    public String getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(String rh) {
        this.rh = rh;
    }

    public Donante withRh(String rh) {
        this.rh = rh;
        return this;
    }

    @JsonProperty("numeroDonaciones")
    public Integer getNumeroDonaciones() {
        return numeroDonaciones;
    }

    @JsonProperty("numeroDonaciones")
    public void setNumeroDonaciones(Integer numeroDonaciones) {
        this.numeroDonaciones = numeroDonaciones;
    }

    public Donante withNumeroDonaciones(Integer numeroDonaciones) {
        this.numeroDonaciones = numeroDonaciones;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Donante withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Donante.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("idPaciente");
        sb.append('=');
        sb.append(((this.idPaciente == null) ? "<null>" : this.idPaciente));
        sb.append(',');
        sb.append("nombre");
        sb.append('=');
        sb.append(((this.nombre == null) ? "<null>" : this.nombre));
        sb.append(',');
        sb.append("fechaNacimiento");
        sb.append('=');
        sb.append(((this.fechaNacimiento == null) ? "<null>" : this.fechaNacimiento));
        sb.append(',');
        sb.append("grupoSanguineo");
        sb.append('=');
        sb.append(((this.grupoSanguineo == null) ? "<null>" : this.grupoSanguineo));
        sb.append(',');
        sb.append("rh");
        sb.append('=');
        sb.append(((this.rh == null) ? "<null>" : this.rh));
        sb.append(',');
        sb.append("numeroDonaciones");
        sb.append('=');
        sb.append(((this.numeroDonaciones == null) ? "<null>" : this.numeroDonaciones));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.idPaciente == null) ? 0 : this.idPaciente.hashCode()));
        result = ((result * 31) + ((this.grupoSanguineo == null) ? 0 : this.grupoSanguineo.hashCode()));
        result = ((result * 31) + ((this.fechaNacimiento == null) ? 0 : this.fechaNacimiento.hashCode()));
        result = ((result * 31) + ((this.rh == null) ? 0 : this.rh.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.numeroDonaciones == null) ? 0 : this.numeroDonaciones.hashCode()));
        result = ((result * 31) + ((this.nombre == null) ? 0 : this.nombre.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Donante) == false) {
            return false;
        }
        Donante rhs = ((Donante) other);
        return ((((((((this.idPaciente == rhs.idPaciente) || ((this.idPaciente != null) && this.idPaciente.equals(rhs.idPaciente))) && ((this.grupoSanguineo == rhs.grupoSanguineo) || ((this.grupoSanguineo != null) && this.grupoSanguineo.equals(rhs.grupoSanguineo)))) && ((this.fechaNacimiento == rhs.fechaNacimiento) || ((this.fechaNacimiento != null) && this.fechaNacimiento.equals(rhs.fechaNacimiento)))) && ((this.rh == rhs.rh) || ((this.rh != null) && this.rh.equals(rhs.rh)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.numeroDonaciones == rhs.numeroDonaciones) || ((this.numeroDonaciones != null) && this.numeroDonaciones.equals(rhs.numeroDonaciones)))) && ((this.nombre == rhs.nombre) || ((this.nombre != null) && this.nombre.equals(rhs.nombre))));
    }

}
