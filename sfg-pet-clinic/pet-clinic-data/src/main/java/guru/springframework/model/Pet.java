package guru.springframework.model;

import java.time.LocalDate;
import java.util.Date;

public class Pet extends  BaseEntity{

    private Date date;


    private PetType petType;
    private Owner owner;
    private LocalDate bDay;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getbDay() {
        return bDay;
    }

    public void setbDay(LocalDate bDay) {
        this.bDay = bDay;
    }


}
