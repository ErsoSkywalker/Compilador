package Logica;
// C:\\Users\\conti\\Desktop\\Important Things\\Asesorias\\Compilador\\Codigos\\CodigoACompilar.txt

import Acciones.Acciones;
import Entities.InstruccionEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;
// Parches futuros= Validar que no hayan Start ni end entre los start y end del inicio

public class Validacion {

    javax.swing.JTextArea TextAreaOmg;
    public Validacion(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar, javax.swing.JTextArea TextAreaOmg) {
        this.TextAreaOmg = TextAreaOmg;
        int ValidacionErrores = Contrastar(InstruccionesBase, InstruccionesACompilar);

        if (ValidacionErrores == 0) {

            Acciones ac = new Acciones(InstruccionesBase, InstruccionesACompilar, TextAreaOmg);

        } else {
            JOptionPane.showMessageDialog(null, "¡Por favor revisa tu código!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    public int Contrastar(ArrayList<InstruccionEntity> InstruccionesBase, ArrayList<InstruccionEntity> InstruccionesACompilar) {
        boolean Validador = false, Validador2 = false;
        int CantidadDeErrores = 0;
        int CaracterErroneo = 0;
        for (int i = 0; i < InstruccionesACompilar.size(); i++) {
            if (!InstruccionesACompilar.get(i).getInstruccion().equalsIgnoreCase("%END") && !InstruccionesACompilar.get(i).getInstruccion().equalsIgnoreCase("%START")) {

                for (int j = 0; j < InstruccionesBase.size(); j++) {
                    Validador = (InstruccionesACompilar.get(i).getInstruccion().equalsIgnoreCase(InstruccionesBase.get(j).getInstruccion())) ? true : Validador;
                }
                if (!Validador) {

                    CantidadDeErrores++;
                    String LineaConError = InstruccionesACompilar.get(i).getInstruccion();
                    for (int j = 1; j <= LineaConError.length(); j++) {
                        Validador2 = false;
                        for (int k = 0; k < InstruccionesBase.size(); k++) {
                            if (j <= InstruccionesBase.get(k).getInstruccion().length()) {
                                if (LineaConError.substring(0, j).equalsIgnoreCase(InstruccionesBase.get(k).getInstruccion().substring(0, j))) {
                                    Validador2 = true;
                                }
                            }
                        }
                        if (!Validador2) {
                            CaracterErroneo = j - 1;
                            TextAreaOmg.setText(TextAreaOmg.getText()+"\nLinea "+ i + " Caracter erroneo " + CaracterErroneo);
                            TextAreaOmg.setText(TextAreaOmg.getText()+"\nPosición Especifica marcada con asterisco: " + LineaConError.substring(0, CaracterErroneo) + "*" + LineaConError.substring(CaracterErroneo + 1, LineaConError.length()));
                     
                            break;
                        }
                    }

                }
                Validador = false;
            } else {
                JOptionPane.showMessageDialog(null, "¡No puedes escribir ni Start ni end entre un Start y un End, ya que estos definen el inicio y el final de un archivo!", "Aviso", JOptionPane.ERROR_MESSAGE);
                CantidadDeErrores++;
            }
        }
        return CantidadDeErrores;
    }

}
