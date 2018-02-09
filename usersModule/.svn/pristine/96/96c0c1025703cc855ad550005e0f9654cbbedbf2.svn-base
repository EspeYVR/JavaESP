/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.users.module.quipux.service;

import java.sql.*;
import ec.edu.espe.users.module.quipux.model.Usuario;
import ec.edu.espe.users.module.quipux.util.conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class UsuarioService {
    // sentencia SQL
    private PreparedStatement consultaEmpleado = null;
    // objeto de la clase conexion  
    Connection cn = new conexion().getConexion();
    // sirve para leer los resultados de la consulta
    ResultSet rs = null;

    // constructor de la clase que inicializa la sentencia SQL
    public UsuarioService() {
    }
    
    public List FindByCedula(String cedula) {
        List resultado = null;
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo,cargo_tipo,depe_codi\n"
                    + "from usuarios\n"
                    + "where usua_cedula = '" + cedula + "'");
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("usua_login"),
                        rs.getString("usua_email"),
                        rs.getString("usua_cedula"),
                        rs.getString("usua_nomb"),
                        rs.getString("usua_apellido"),
                        rs.getString("usua_cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("depe_codi")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public List FindById(String ID) {
        List resultado = null;
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo,cargo_tipo,depe_codi\n"
                    + "from usuarios\n"
                    + "where usua_login = '" + ID + "'");
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("usua_login"),
                        rs.getString("usua_email"),
                        rs.getString("usua_cedula"),
                        rs.getString("usua_nomb"),
                        rs.getString("usua_apellido"),
                        rs.getString("usua_cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("depe_codi")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

        public List FindByBoss(int jefe) {
        List resultado = null;
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo,cargo_tipo,depe_codi\n"
                    + "from usuarios\n"
                    + "where cargo_tipo =" + jefe);
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("usua_login"),
                        rs.getString("usua_email"),
                        rs.getString("usua_cedula"),
                        rs.getString("usua_nomb"),
                        rs.getString("usua_apellido"),
                        rs.getString("usua_cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("depe_codi")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
        
        public List FindByemplo(String Idjefe) {
        List resultado = null;
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo, depe_codi,cargo_tipo\n" +
                                                    "from usuarios\n" +
                                                    "where  depe_codi in(select depe_codi\n" +
                                                    "from usuarios\n" +
                                                    "where cargo_tipo = 1\n" +
                                                    "and usua_login ='"+Idjefe+"'\n" +
                                                    ") and cargo_tipo = 0;");
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("usua_login"),
                        rs.getString("usua_email"),
                        rs.getString("usua_cedula"),
                        rs.getString("usua_nomb"),
                        rs.getString("usua_apellido"),
                        rs.getString("usua_cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("depe_codi")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
