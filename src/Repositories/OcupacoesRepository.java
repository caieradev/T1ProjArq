package Repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.Ocupacao;

public class OcupacoesRepository {
    private List<Ocupacao> ocupacoes;

    public OcupacoesRepository() {
        ocupacoes = new ArrayList<Ocupacao>();
    }

    public List<Ocupacao> getOcupacoes(Date data, String aeroviaId) {
        return new ArrayList<>(ocupacoes)
                .stream()
                .filter(x -> x.getData() == data && x.getAeroviaId() == aeroviaId)
                .toList();
    }
}
