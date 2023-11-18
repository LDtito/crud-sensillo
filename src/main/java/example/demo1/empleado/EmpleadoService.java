package example.demo1.empleado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository repository;
    
    public Empleado save( Empleado entity ){
        return repository.save(entity);
    }
    
    public Empleado findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Empleado> findAll(){
        return repository.findAll();
    }
    
}
