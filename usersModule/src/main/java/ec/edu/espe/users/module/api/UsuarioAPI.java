/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.users.module.api;

import com.google.gson.Gson;
import ec.edu.espe.users.module.quipux.model.Usuario;
import ec.edu.espe.users.module.quipux.service.UsuarioService;
import ec.edu.espe.users.module.quipux.model.Dependencia;
import ec.edu.espe.users.module.quipux.service.DependenciaService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author luis
 */
@Path("/us/")
public class UsuarioAPI {
    
   
    
////busqueda por cedula    
    @GET
    @Path("/usuario/cedula/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findCi(@PathParam("search") String search) {
        String result = "";
        String  patter = search;
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
        Gson json = new Gson();
        List re=service.FindByCedula(search);
       if (re.size() != 0) {
           try {
               result = json.toJson(re);
           } catch (Exception e) {
               e.printStackTrace();
           }
           
        } else {
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity("hola "+result).build();
    }
// busqueda por ID ////////////
    
        @GET
    @Path("/usuario/id/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findID(@PathParam("search") String search) {
        String result = "";
        String  patter = search;
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
        Gson json = new Gson();
        List re=service.FindById(search);
       if (re.size() != 0) {
           try {
               result = json.toJson(re);
           } catch (Exception e) {
               e.printStackTrace();
           }
           
        } else {
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity("hola "+result).build();
    }
////////////////////////////    
// busqueda por codigo de departamento
    @GET
    @Path("/usuario/code/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findcode(@PathParam("search") int search) {
        String result = "";
        int  patter = search;
        Dependencia dependencia = new Dependencia();
        DependenciaService service = new DependenciaService();
        Gson json = new Gson();
        List re=service.FindByCodigo(search);
       if (re.size() != 0) {
           try {
               result = json.toJson(re);
           } catch (Exception e) {
               e.printStackTrace();
           }
           
        } else {
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity("hola "+result).build();
    }

///////////////////////////////////////    
// jefes del departamento
    @GET
    @Path("/usuario/jefes/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findBoss() {
        String result = "";
        int search = 1;
        int  patter = search;
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
        Gson json = new Gson();
        List re=service.FindByBoss(search);
       if (re.size() != 0) {
           try {
               result = json.toJson(re);
           } catch (Exception e) {
               e.printStackTrace();
           }
           
        } else {
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity("hola "+result).build();
    }
///////////////////////////////////////
/// Empleados
    @GET
    @Path("/usuario/empleados/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findemplo(@PathParam("search") String search) {
        String result = "";
        
        String  patter = search;
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
        Gson json = new Gson();
        List re=service.FindByemplo(search);
       if (re.size() != 0) {
           try {
               result = json.toJson(re);
           } catch (Exception e) {
               e.printStackTrace();
           }
           
        } else {
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity("hola "+result).build();
    }
/////////////////
}
