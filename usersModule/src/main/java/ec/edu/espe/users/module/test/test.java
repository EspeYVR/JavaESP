/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.users.module.test;

import ec.edu.espe.users.module.quipux.model.Usuario;
import ec.edu.espe.users.module.quipux.service.UsuarioService;
import ec.edu.espe.users.module.quipux.model.Dependencia;
import ec.edu.espe.users.module.quipux.service.DependenciaService;
import java.util.List;

/**
 *
 * @author luis
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario user = new Usuario();
        UsuarioService userver = new UsuarioService();
        
        Dependencia depen = new Dependencia();
        DependenciaService depenver = new DependenciaService();
        List resultado;
        
        int indi=0;
        int total=0;
        /*try {
        resultado = userver.FindByCedula("1703553097");
        //U1703553097
            total=resultado.size();
        
        
        while (total>indi) {
            user = (Usuario) resultado.get(indi);
            String id = user.getID();
            String email =user.getEmail();
            String cedula =user.getCedula();
            System.out.println(id+email+cedula);
            indi++;
        }    
        } catch (Exception e) {
        e.printStackTrace();
        }
        */
        //departamento
        try {
        resultado = depenver.FindByCodigo(78);
        //U1703553097
            total=resultado.size();
        
        
        while (total>indi) {
            depen = (Dependencia) resultado.get(indi);
            int code = depen.getCodigo();
            String depa_nombre =depen.getNombre_departamento();
            int depapadre =depen.getCodigo_padre_departamento();
            System.out.println(code+depa_nombre+depapadre);
            indi++;
        }    
        } catch (Exception e) {
        e.printStackTrace();
        }
        
    }
    
}
