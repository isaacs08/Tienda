package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import com.tienda.domain.Categoria;
import lombok.Data;

@Data // Generar los getter y setter
@Entity
@Table(name = "producto")
public class Producto  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;
    //private Long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
        //this.idProducto = idProducto;
        //this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    public Producto ()
    {
    }
}
