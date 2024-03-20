package com.springboot.backend.backendonlinestore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;
    private String nombre;
    private String marca;
    private Float volumen;
    private Long precio;
    private String familia_olfativa;
    private Integer existencia;
    private Integer stock_max;
    private Integer stock_min;

    public Integer getIdProducto() {
        return idproducto;
    }
    public void setIdProducto(Integer idProducto) {
        this.idproducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Float getVolumen() {
        return volumen;
    }
    public void setVolumen(Float volumen) {
        this.volumen = volumen;
    }
    public Long getPrecio() {
        return precio;
    }
    public void setPrecio(Long precio) {
        this.precio = precio;
    }
    public String getFamilia_olfativa() {
        return familia_olfativa;
    }
    public void setFamilia_olfativa(String familia_olfativa) {
        this.familia_olfativa = familia_olfativa;
    }
    public Integer getExistencia() {
        return existencia;
    }
    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
    public Integer getStock_max() {
        return stock_max;
    }
    public void setStock_max(Integer stock_max) {
        this.stock_max = stock_max;
    }
    public Integer getStock_min() {
        return stock_min;
    }
    public void setStock_min(Integer stock_min) {
        this.stock_min = stock_min;
    }

    
}
