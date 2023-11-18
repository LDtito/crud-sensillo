package example.demo1.empleado;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
        
@Data
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombre;
    private String correo;
    private Integer edad;
}