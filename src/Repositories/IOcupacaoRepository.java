package Repositories;

import java.util.Date;
import java.util.List;

import Entities.Ocupacao;

public interface IOcupacaoRepository {
    public List<Ocupacao> getOcupacoes(Date data, String aeroviaId);
}
