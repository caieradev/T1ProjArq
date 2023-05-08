package Controllers.DTOs;

public class PlanoDeVooDTO {
    private String planoId;
    private String aeronaveId;
    private String aeroviaId;
    private String matriculaPiloto;

    public String getPlanoId() {
        return planoId;
    }

    public void setPlanoId(String planoId) {
        this.planoId = planoId;
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

    public String getMatriculaPiloto() {
        return matriculaPiloto;
    }

    public void setMatriculaPiloto(String matriculaPiloto) {
        this.matriculaPiloto = matriculaPiloto;
    }
}
