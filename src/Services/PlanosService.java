package Services;

import java.util.List;

import Entities.PlanoDeVoo;
import Repositories.AeroviasRepository;
import Repositories.OcupacoesRepository;
import Repositories.PlanosRepository;

public class PlanosService {
    private PlanosRepository _planosRepository;
    private AeroviasRepository _aeroviaRepository;
    private OcupacoesRepository _ocupacaoRepository;

    public PlanosService(PlanosRepository _planosRepository, AeroviasRepository _aeroviaRepository,
            OcupacoesRepository _ocupacaoRepository) {
        this._planosRepository = _planosRepository;
        this._aeroviaRepository = _aeroviaRepository;
        this._ocupacaoRepository = _ocupacaoRepository;
    }

    public PlanoDeVoo getPlano(String planoId) throws Exception {
        throw new Exception("Not Implemented");
    }

    public void cancelarPlano(String planoId) {

    }

    public void consistePlano(PlanoDeVoo plano) {

    }

    public void aprovaPlano(String planoId) {

    }

    public List<PlanoDeVoo> getPlanos() throws Exception {
        throw new Exception("Not Implemented");
    }
}
