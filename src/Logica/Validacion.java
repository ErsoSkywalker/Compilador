package Logica;
// C:\Users\conti\Desktop\Asesorias\Compilador\Codigos\CodigoACompilar.txt
import Acciones.Acciones;
import Entities.InstruccionEntity;
import java.util.ArrayList;
// Parches futuros= Validar que no hayan Start ni end entre los start y end del inicio
public class Validacion {

    public Validacion(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar) {
        int ValidacionErrores = Contrastar(InstruccionesBase, InstruccionesACompilar);

        if(ValidacionErrores == 0){
            
            Acciones ac = new Acciones(InstruccionesBase, InstruccionesACompilar);
            
        }else{
            System.out.println("Por favor revisa tu codigo");
        }
        
    }

    public int Contrastar(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar) {
        boolean Validador = false, Validador2 = false;
        int CantidadDeErrores = 0; 
        int CaracterErroneo = 0;
        for (int i = 0; i < InstruccionesACompilar.size(); i++) {
            //Desde acá checa end y start
            for (int j = 0; j < InstruccionesBase.size(); j++) {
                Validador = (InstruccionesACompilar.get(i).getInstruccion().equalsIgnoreCase(InstruccionesBase.get(j).getInstruccion())) ? true : Validador;
            }
            if(!Validador){
                
                CantidadDeErrores++;
                String LineaConError = InstruccionesACompilar.get(i).getInstruccion();
                for(int j = 1; j <= LineaConError.length(); j++){
                    Validador2 = false;
                    for(int k = 0; k < InstruccionesBase.size(); k++){
                        if(j <= InstruccionesBase.get(k).getInstruccion().length()){
                            if(LineaConError.substring(0,j).equalsIgnoreCase(InstruccionesBase.get(k).getInstruccion().substring(0, j))){
                                Validador2 = true;
                            }
                        }
                    }
                    if(!Validador2){
                        CaracterErroneo = j-1;
                        System.out.println("Linea " + i +" Caracter erroneo " + CaracterErroneo);
                        System.out.println("Posición Especifica marcada con asterisco: " + LineaConError.substring(0, CaracterErroneo) + "*" + LineaConError.substring(CaracterErroneo+1, LineaConError.length()));
                        break;
                    }
                }
                
            }
            Validador = false;
        }
        return CantidadDeErrores;
    }

}
