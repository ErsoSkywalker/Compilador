package Logica;

import Entities.InstruccionEntity;
import java.util.ArrayList;
import Logica.PrepararObjetos;

public class CompilarCodigo {

    ArrayList<InstruccionEntity> InstruccionesDesglosadas = new ArrayList<>();
    // Agregar La definicion para saber donde me equivoque, propuesta
    //Crear un metodo que reciba la cadena donde te equivocas y definir mediante el codigo base, la sintaxis donde 
    //la regaste uwu

    public CompilarCodigo(ArrayList<String> InstruccionesACompilar, PrepararObjetos Obj) {
        int Validar = 0;
        if (InstruccionesACompilar.get(0).equalsIgnoreCase("%START") && InstruccionesACompilar.get(InstruccionesACompilar.size() - 2).equalsIgnoreCase("%END")) {
            for (int i = 1; i < InstruccionesACompilar.size() - 2; i++) {
                Validar = Analisis(InstruccionesACompilar.get(i));
                if(Validar == 1){
                    System.out.println("Bro, tu codigo está mal, checa tu chingadera");
                    break;
                }
            }
        } else {
            System.out.println("Tu codigo carece de sentido");
        }
        
        Validacion val = new Validacion(Obj.SerieInstrucciones, InstruccionesDesglosadas);
        
    }

    public int Analisis(String CadenaCompilar) {
        String Instruccion = "", Definicion = "";
        int VarTemporalI = 0;
        if (CadenaCompilar.charAt(0) == '%') {
            for (int i = 0; i < CadenaCompilar.length(); i++) {
                if(CadenaCompilar.charAt(i)== ' ' ){
                    VarTemporalI = i+1; 
                    break;
                }else{
                    Instruccion+= CadenaCompilar.charAt(i);
                }
            }
            for(int i = VarTemporalI; i < CadenaCompilar.length(); i++){
                Definicion+=CadenaCompilar.charAt(i);
            }
            InstruccionesDesglosadas.add(new InstruccionEntity(Instruccion, Definicion));
        }else{
            return 1;
        }
        return 0;
    }

}
