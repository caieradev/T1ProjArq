package Repositories;

import java.util.List;

import Entities.PlanoDeVoo;

public interface IPlanosRepository {
    public PlanoDeVoo getPlano(String planoId);

    public List<PlanoDeVoo> getPlanos();

    public boolean addPlano(PlanoDeVoo plano);
}
