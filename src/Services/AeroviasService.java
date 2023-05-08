package Services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import Repositories.AeroviasRepository;
import Repositories.OcupacoesRepository;
import Entities.*;

public class AeroviasService {
    private OcupacoesRepository _repositorioOcupacao;
    private AeroviasRepository _aeroviaRepository;

    public AeroviasService(OcupacoesRepository repositorioOcupacao, AeroviasRepository aeroviaRepository) {
        this._repositorioOcupacao = repositorioOcupacao;
        this._aeroviaRepository = aeroviaRepository;
    }

    public HashMap<Integer, List<Integer>> GetLivres(Date data, String aeroviaId) {
        var ocupacoes = this._repositorioOcupacao.getOcupacoes(data, aeroviaId);

        Aerovia aerovia = this._aeroviaRepository.getAerovia(aeroviaId);

        HashMap<Integer, List<Integer>> livres = aerovia.getSlots();

        for (Ocupacao ocupacao : ocupacoes) {
            livres.get(ocupacao.getHorario())
                    .removeIf(x -> x == ocupacao.getAltitude());
        }

        return livres;
    }

    public List<Aerovia> getAerovias(String aeroviaId) {
        return this._aeroviaRepository.getAerovias();
    }
}
