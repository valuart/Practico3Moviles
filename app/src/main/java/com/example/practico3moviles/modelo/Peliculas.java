package com.example.practico3moviles.modelo;

public class Peliculas {
     private String nombre;
     private int foto;
     private String descripcion;
     private String actores;
     private String director;

     public Peliculas(String nombre, int foto, String descripcion, String actores, String director) {
          this.nombre = nombre;
          this.foto = foto;
          this.descripcion = descripcion;
          this.actores = actores;
          this.director = director;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public int getFoto() {
          return foto;
     }

     public void setFoto(int foto) {
          this.foto = foto;
     }

     public String getDescripcion() {
          return descripcion;
     }

     public void setDescripcion(String descripcion) {
          this.descripcion = descripcion;
     }

     public String getActores() {
          return actores;
     }

     public void setActores(String actores) {
          this.actores = actores;
     }

     public String getDirector() {
          return director;
     }

     public void setDirector(String director) {
          this.director = director;
     }
}
