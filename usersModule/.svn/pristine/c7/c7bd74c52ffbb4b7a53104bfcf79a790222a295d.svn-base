/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.users.module.quipux.util;

import java.sql.*;


/**
 *
 * @author marlo
 */
public class conexion {
        //Ponemos  el Driver/seguido del nombre del servidor/Y Nombre de BD
    private  String url = "jdbc:postgresql://10.1.1.18/GI_QUIPUX";
    //El usuario y contraseña
    private String user = "postgre";
    private String pass = "postgre";
    private Connection cn;
     
    public Connection getConexion() {
        try {
            //Accediendo al Driver
            Class.forName("org.postgresql.Driver");
            //Aqui armamos la conexión
            cn = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            //Si hubiera errores imprimimos en pantalla
            e.printStackTrace();
        }
        //retornamos nuestra conexión para hacer uso en el proyecto.
        return cn;
    }
}
