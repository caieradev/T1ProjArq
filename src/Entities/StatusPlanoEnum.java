package Entities;

public enum StatusPlanoEnum {
    AGUARDANDO(1),
    APROVADO(2),
    CANCELADO(3);

    private int status;

    StatusPlanoEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}
