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
    
    public UsuarioService(int cedula) {
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo,cargo_tipo,depe_codi\n"
                    + "from usuarios, dependencia\n"
                    + "where usua_cedula = '" + cedula + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List FindByCedula(int cedula) {
        List resultado = null;
        try {
            consultaEmpleado = cn.prepareStatement("select usua_login,usua_email,usua_cedula, usua_nomb, usua_apellido,usua_cargo,cargo_tipo,depe_codi\n"
                    + "from usuarios, dependencia\n"
                    + "where usua_cedula = '" + cedula + "'");
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("ID"),
                        rs.getString("email"),
                        rs.getInt("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("dependencias_codigo")
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
                    + "from usuarios, dependencia\n"
                    + "where usua_cedula = '" + ID + "'");
            rs = consultaEmpleado.executeQuery();
            resultado = new ArrayList();
            while (rs.next()) {
                resultado.add(new Usuario(
                        rs.getString("ID"),
                        rs.getString("email"),
                        rs.getInt("cedula"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("cargo"),
                        rs.getString("cargo_tipo"),
                        rs.getInt("dependencias_codigo")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

}
