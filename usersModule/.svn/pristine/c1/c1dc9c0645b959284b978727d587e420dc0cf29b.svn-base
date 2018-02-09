/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.users.module.api;

import com.google.gson.Gson;
import ec.edu.espe.users.module.quipux.model.Usuario;
import ec.edu.espe.users.module.quipux.service.UsuarioService;
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
    
    @POST
    @Path("/usuario")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response transaction(String json) {
        String result = "";
        Gson object = new Gson();
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
        Boolean exito = Boolean.FALSE;
        try {
//            usuario = object.fromJson(json, Usuario.class);
//            if (usuario.getCode().equals("INSERT")) {
//                exito = service.insert(usuario);
//            } else if (usuario.getCode().equals("DELETE")) {
//                exito = service.delete(usuario);
//            } else {
//                exito = service.update(usuario);
//            }
//            if (exito) {
//                result = "{\"state\" : \"1\"}";
//            } else {
//                result = "{\"state\" : \"0\"}";
//            }
        } catch (Exception e) {
            System.out.println(">> post usuario : " + e.getMessage());
            result = "{\"state\" : \"0\"}";
        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/usuario/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response query(@PathParam("search") String search) {
        String result = "";
        String[] patter = search.split("=");
        Usuario usuario = new Usuario();
        UsuarioService service = new UsuarioService();
//        Gson json = new Gson();
//        if (patter.length == 2) {
//            if (patter[0].equals("username")) {
//                usuario = service.findByUsername(patter[1]);
//            } else if (patter[0].equals("code")) {
//                usuario = service.findByCode(patter[1]);
//            }
//        }
//        if (usuario.getCode() != null) {
//            result = json.toJson(usuario, Usuario.class);
//        } else {
//            result = "{\"state\" : \"0\"}";
//        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity(result).build();
    }

    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        String result = "{\"state\" : \"0\"}";
        UsuarioService service = new UsuarioService();
//        List<Usuario> usuarios = service.list();
//        Gson objectList = new Gson();
//        if (!usuarios.isEmpty()) {
//            result = objectList.toJson(usuarios);
//        }
        // return HTTP response 200 in case of success
        return Response.status(200).entity(result).build();
    }
}
