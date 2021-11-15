package guru.springframework.sfgdi.services;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorPetService implements PetService {

    @Override
    public String getPetType() {
        return "dog";
    }
}
