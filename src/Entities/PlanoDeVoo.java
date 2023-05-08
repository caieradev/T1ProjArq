package Entities;

import java.util.Date;

public class PlanoDeVoo {
    private String id;
    private String aeronaveId;
    private String aeroviaId;
    private Integer altitude;
    private Integer horario;
    private Date data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAeronaveId() {
        return aeronaveId;
    }

    public void setAeronaveId(String aeronaveId) {
        this.aeronaveId = aeronaveId;
    }

    public String getAeroviaId() {
        return aeroviaId;
    }

    public void setAeroviaId(String aeroviaId) {
        this.aeroviaId = aeroviaId;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
