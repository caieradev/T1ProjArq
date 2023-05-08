package Entities;

import java.util.HashMap;
import java.util.List;

public class Aerovia {
    private String id;
    private String origem;
    private String destino;
    private HashMap<Integer, List<Integer>> Slots; // Integer: Hora - List<Integer>: Altura

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public HashMap<Integer, List<Integer>> getSlots() {
        return Slots;
    }

    public void setSlots(HashMap<Integer, List<Integer>> slots) {
        Slots = slots;
    }
}