package Entities;

public abstract class Aeronave {
    private String aeronaveId;
    private double velocidade;
    private double autonomia;
    private TipoAeronaveEnum tipoAeronave;

    public TipoAeronaveEnum getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(TipoAeronaveEnum tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public String getAeronaveId() {
        return aeronaveId;
    }

    public void setAeronaveId(String aeronaveId) {
        this.aeronaveId = aeronaveId;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
}
