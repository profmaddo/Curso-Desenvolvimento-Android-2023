package devandroid.maddo.appgaseta.controller;

import android.content.SharedPreferences;

import devandroid.maddo.appgaseta.model.Combustivel;
import devandroid.maddo.appgaseta.view.GasEtaActivity;

public class CombustivelController {

    SharedPreferences preferences;

    SharedPreferences.Editor dadosPreferences;

    // psfs
    public static final String NOME_PREFERENCES = "pref_gaseta";

    public CombustivelController(GasEtaActivity activity){

        preferences =
                activity.getSharedPreferences(NOME_PREFERENCES, 0);

        dadosPreferences = preferences.edit();


    }

    public void salvar(Combustivel combustivel){

        dadosPreferences.putString("combustivel", combustivel.getNomeDoCombustivel());
        dadosPreferences.putFloat("precoDoCombustivel", (float) combustivel.getPrecoDoCombustivel());
        dadosPreferences.putString("recomendacao",combustivel.getRecomendacao());
        dadosPreferences.apply();

    }

    public void limpar(){

        dadosPreferences.clear();
        dadosPreferences.apply();
    }

}
