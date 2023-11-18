package example.demo1.empleado;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface EmpleadoRepository extends CrudRepository<Empleado, Long>{
    List<Empleado> findAll();
}