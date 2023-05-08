package Services;

import java.util.List;

import Entities.PlanoDeVoo;
import Entities.StatusPlanoEnum;
import Repositories.PlanosRepository;

public class PlanosService {
    private PlanosRepository _planosRepository;

    public PlanosService(PlanosRepository planosRepository) {
        this._planosRepository = planosRepository;
    }

    public PlanoDeVoo getPlano(String planoId) throws Exception {
        return this._planosRepository.getPlano(planoId);
    }

    public void cancelarPlano(String planoId) throws Exception {
        var plano = this._planosRepository.getPlano(planoId);
        plano.setStatus(StatusPlanoEnum.CANCELADO);
    }

    public boolean consistePlano(PlanoDeVoo plano) throws Exception {
        return this._planosRepository.addPlano(plano);
    }

    public void aprovarPlano(String planoId) throws Exception {
        var plano = this._planosRepository.getPlano(planoId);
        plano.setStatus(StatusPlanoEnum.APROVADO);
    }

    public List<PlanoDeVoo> getPlanos() throws Exception {
        return this._planosRepository.getPlanos();
    }
}
