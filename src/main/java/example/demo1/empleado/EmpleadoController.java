package example.demo1.empleado;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin({"*"})
public class EmpleadoController {

    @Autowired
    EmpleadoService service;

    @GetMapping("/{id}/")
    public Empleado findById( @PathVariable long id ){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Empleado> findAll() {
        return service.findAll();
    }

    @PostMapping("/")
    public Empleado save( @RequestBody Empleado entitiy ){
        return service.save(entitiy);
    }
    

}
