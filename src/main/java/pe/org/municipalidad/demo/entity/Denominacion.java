/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "denominacion")
@Entity

public class Denominacion implements Serializable {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iddenominacion")
    private int id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_tipos")

    private Tipo_os  tipo_os_id_tipoos;
   
    
    
    
    
}
