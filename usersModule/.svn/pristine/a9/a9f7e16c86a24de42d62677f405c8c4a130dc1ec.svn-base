/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.users.module.quipux.service;

import java.sql.*;
import ec.edu.espe.users.module.quipux.model.Dependencia;
import ec.edu.espe.users.module.quipux.model.Usuario;
import ec.edu.espe.users.module.quipux.util.conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class DependenciaService {

    // sentencia SQL
    private PreparedStatement consultaDependencia = null;
    // objeto de la clase conexion  
    Connection cn = new conexion().getConexion();
    // sirve para leer los resultados de la consulta
    ResultSet rs = null;
    // constructor de la clase que inicializa la sentencia SQL

    public List FindByCodigo(int codigo) {
        List resultado = null;
        try {
            consultaDependencia = cn.prepareStatement("select depe_codi, depe_nomb, depe_codi_padre\n"
                    + "from dependencia  "
                    + "  where depe_codi=" + codigo);
            rs = consultaDependencia.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Dependencia(
                        rs.getInt("depe_codi"),
                        rs.getString("depe_nomb"),
                        rs.getInt("depe_codi_padre")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
