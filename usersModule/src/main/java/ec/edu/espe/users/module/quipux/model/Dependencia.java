/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.users.module.quipux.model;

/**
 *
 * @author marlo
 */
public class Dependencia {
    private int codigo;
    private String nombre_departamento;
    private int codigo_padre_departamento;

    public Dependencia() {
    }

    public Dependencia(int codigo, String nombre_departamento, int codigo_padre_departamento) {
        this.codigo = codigo;
        this.nombre_departamento = nombre_departamento;
        this.codigo_padre_departamento = codigo_padre_departamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public int getCodigo_padre_departamento() {
        return codigo_padre_departamento;
    }

    public void setCodigo_padre_departamento(int codigo_padre_departamento) {
        this.codigo_padre_departamento = codigo_padre_departamento;
    }

    @Override
    public String toString() {
        return "dependencia{" + "codigo=" + codigo + ", nombre_departamento=" + nombre_departamento + ", codigo_padre_departamento=" + codigo_padre_departamento + '}';
    }

    
}
