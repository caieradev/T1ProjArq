package Repositories;

import java.util.List;

import Entities.Aerovia;

public interface IAeroviasRepository {
    public Aerovia getAerovia(String aeroviaId);

    public List<Aerovia> getAerovias();
}
