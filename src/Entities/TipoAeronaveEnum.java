package Entities;

public enum TipoAeronaveEnum {
    CARGA(1),
    COMERCIAL(2),
    PARTICULAR(3);

    private int tipo;

    TipoAeronaveEnum(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
