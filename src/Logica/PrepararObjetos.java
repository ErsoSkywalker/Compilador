
package Logica;

import Entities.InstruccionEntity;
import java.util.ArrayList;


public class PrepararObjetos {
    int Validacion = 0;
    ArrayList<InstruccionEntity> SerieInstrucciones = new ArrayList<>();
    public PrepararObjetos(ArrayList<String> SerieDeCadenas){
        
        for(int i = 0; i < SerieDeCadenas.size(); i++){
            Validacion = Analisis(SerieDeCadenas.get(i));
            if(Validacion == 1)
                break;
        }
        if(Validacion == 1){
            System.out.println("Tu archivo está mal, corrigelo :c");
        }
        
    }
    
    
    
    public int Analisis(String Cadena){
        String Instruccion = "", Definicion = "";
        int ContadorDePipes = 0, VariableTemporalI = 0;
        if(Cadena.charAt(0) == '%'){
           
            for(int i = 0; i < Cadena.length(); i++){
                if(Cadena.charAt(i) == '|'){
                    ContadorDePipes++;
                }else{
                    Instruccion += Cadena.charAt(i);
                }
                if(ContadorDePipes == 2){
                    VariableTemporalI = i;
                    break;
                }
            }
            for(int i = VariableTemporalI+1; i<Cadena.length(); i++){
                Definicion+= Cadena.charAt(i);
            }
            
            SerieInstrucciones.add(new InstruccionEntity(Instruccion, Definicion));
            
        }else{
           return 1; 
        }
        return 0;
    }
    
    
}
