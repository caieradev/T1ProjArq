package Repositories;

import java.util.ArrayList;
import java.util.List;

import Entities.Aerovia;

public class AeroviasRepository {
    private List<Aerovia> aerovias;

    public AeroviasRepository() {
        aerovias = new ArrayList<Aerovia>();
    }

    public Aerovia getAerovia(String aeroviaId) {
        return aerovias
                .stream()
                .filter(x -> x.getId() == aeroviaId)
                .findFirst()
                .orElseThrow();
    }

    public List<Aerovia> getAerovias() {
        return new ArrayList<Aerovia>(aerovias);
    }
}
