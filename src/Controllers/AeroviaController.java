package Controllers;

import java.util.List;

import Entities.*;
import Services.AeronavesService;
import Services.AeroviasService;
import Services.PlanosService;

import java.util.Date;
import java.util.HashMap;

public class AeroviaController {
    private AeroviasService _aeroviasService;
    private PlanosService _planosService;
    private AeronavesService _aeronavesService;

    public AeroviaController(AeroviasService aeroviasService, PlanosService planosService,
            AeronavesService aeronavesService) {
        this._aeroviasService = aeroviasService;
        this._planosService = planosService;
        this._aeronavesService = aeronavesService;
    }

    public List<Aerovia> listarAerovias() {
        try {
            return this._aeroviasService.getAerovias();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public HashMap<Integer, List<Integer>> getSlotsLivres(Date data, String aeroviaId) {
        try {
            return this._aeroviasService.GetLivres(data, aeroviaId);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public List<String> getTiposAeronaves() {
        try {
            throw new Exception("Not implemented");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public Aeronave getAeronave(String tipo) {
        try {
            return this._aeronavesService.createAeronave(tipo);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public void aprovarPlanoDeVoo(String planoId) {
        try {
            this._planosService.aprovarPlano(planoId);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public List<PlanoDeVoo> listarPlanos() {
        try {
            return this._planosService.getPlanos();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    public void cancelarPlano(String planoId) {
        try {
            this._planosService.cancelarPlano(planoId);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void consultarPlano(String planoId) {
        try {
            this._planosService.getPlano(planoId);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
