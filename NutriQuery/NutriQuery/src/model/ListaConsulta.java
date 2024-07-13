package model;

import java.util.ArrayList;
import java.util.List;

public class ListaConsulta {
    
    private static final List<Consulta> consultas = new ArrayList<>();
    
    public List<Consulta> listar() {
        return consultas;
    }
    
    public void inserirConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
    
    public void excluirConsulta(int i) {
        consultas.remove(i);
    }
    
    public boolean atualizarConsulta(int i) {
        boolean sucesso = true;
        if(i >= 0 && i < consultas.size()) {
            Consulta consulta = consultas.get(i);
            if(consulta.getFinalizada().equals("Sim")) {
                sucesso = false;
            } else {
                consulta.setFinalizada("Sim");
            }
        } 
        return sucesso;
    }
}
