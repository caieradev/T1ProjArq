package Repositories;

import java.util.ArrayList;
import java.util.List;

import Entities.PlanoDeVoo;

public class PlanosRepository {
    private List<PlanoDeVoo> planos;

    public PlanosRepository() {
        this.planos = new ArrayList<PlanoDeVoo>();
    }

    public PlanoDeVoo getPlano(String planoId) {
        return new ArrayList<PlanoDeVoo>(planos)
                .stream()
                .filter(x -> x.getId().equals(planoId))
                .findFirst()
                .orElse(null);
    }

    public List<PlanoDeVoo> getPlanos() {
        return new ArrayList<PlanoDeVoo>(planos);
    }

    public boolean addPlano(PlanoDeVoo plano) {
        return this.planos.add(plano);
    }

}
