package oslomet.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class motorvognController {

    //Oppretter array:
    public final List<Motorvogn> motorvognRegister = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreMotorvogn(Motorvogn innMotorvogn){
        motorvognRegister.add(innMotorvogn);
    }

    @GetMapping("/hentData")
    public List<Motorvogn>hentData(){
        return motorvognRegister;
    }
}
