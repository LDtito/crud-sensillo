package example.demo1.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;
    
    public Cliente save( Cliente entity ){
        return repository.save(entity);
    }
    
    public void deleteById( Long id ){
        repository.deleteById(id);
    }
    
    public Cliente findById(Long id){
        return repository.findById(id).orElse(null);
    }
    
    public List<Cliente> findAll(){
        return repository.findAll();
    }
    
}
