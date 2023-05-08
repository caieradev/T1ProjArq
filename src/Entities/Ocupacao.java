package Entities;

import java.util.Date;

public class Ocupacao {
    private String aeroviaId;
    private Date data;
    private int horario;
    private int altitude;

    public String getAeroviaId() {
        return aeroviaId;
    }

    public void setAeroviaId(String aeroviaId) {
        this.aeroviaId = aeroviaId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
