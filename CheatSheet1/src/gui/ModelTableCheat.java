/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cheat;

/**
 *
 * @author Smart
 */
public class ModelTableCheat extends DefaultTableModel{
    private List<Cheat>cheatList;
    
    public ModelTableCheat() {
        addColumn("Comando");
        addColumn("Parametro");
        addColumn("Descripcion");
        cheatList = new LinkedList<>();
        
    }
    public void agregarCheat(Cheat cheat){
        cheatList.add(cheat);
        addRow(new Object[]{
            cheat.getComando(),
            cheat.getParametro(),
            cheat.getDescripcion()
        });
    }
    public void removerTodos(){
        for (int i = 0; i < cheatList.size(); i++) {
            Cheat get = cheatList.get(i);
            removeRow(i);
        }
        cheatList.removeAll(cheatList);
    }
    public void agregarTodos(List<Cheat>cheats){
        for (Cheat cheat : cheats) {
            agregarCheat(cheat);
        }
    }
    public void eliminarFila(int fila){
        removeRow(fila);
        cheatList.remove(fila);
    }

    public List<Cheat> getCheatList() {
        return cheatList;
    }
    
}
