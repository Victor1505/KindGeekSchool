package lesson8;

public class Pet implements Comparable<Pet>{

    private Type type;
    private String nick;

    public Pet(Type type, String nick) {
        this.type = type;
        this.nick = nick;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (type != pet.type) return false;
        return nick != null ? nick.equals(pet.nick) : pet.nick == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (nick != null ? nick.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type=" + type +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pet pet) {
        return this.nick.compareTo(pet.nick);
    }
}
