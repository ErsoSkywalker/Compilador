package Logica;

import Entities.InstruccionEntity;
import java.util.ArrayList;

public class Validacion {

    public Validacion(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar) {
        Contrastar(InstruccionesBase, InstruccionesACompilar);

    }

    public void Contrastar(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar) {
        boolean Validador = false;
        for (int i = 0; i < InstruccionesACompilar.size(); i++) {
            for (int j = 0; j < InstruccionesBase.size(); j++) {
                Validador = (InstruccionesACompilar.get(i).getInstruccion().equalsIgnoreCase(InstruccionesBase.get(j).getInstruccion())) ? true : Validador;
            }
            if(!Validador){
                //Aqui identificar donde la cagó
                System.out.println("Tu Linea uno está mal >:c");
            }else{
                System.out.println("Lo lograste compa, linea uno correcta");
            }
            Validador = false;
        }

    }

}
