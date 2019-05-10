package lesson10.zooclub;

public class Pet {


    private String nick;

    private PetType petType;

    public Pet(PetType petType, String nick) {
        this.petType = petType;
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    @Override
    public String toString() {
        return "nick = '" + nick + '\'' + ", petType=" + petType;
    }
}
