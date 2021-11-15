package com.springframework.pets;


public class PetServiceFactory {

    public  PetService getPetService(String petType){
        // to jest typ PetService bo metoda zwraca obiekt typu PetService!!!!
        // bierzemy za argument Stringa dog/cat dzięki któremu program przekieruje nas na odpowiedni serwis
        // znaczy użyje odpowiedniego serwisu do stworzenia obiektu??
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
