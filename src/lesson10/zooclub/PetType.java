package lesson10.zooclub;

public enum PetType {
    DOG,CAT,SNAKE;

    public static PetType getPetType(String type){
        switch (type){
            case "CAT":{
                return CAT;
            }
            case "DOG":{
                return DOG;
            }
            case "SNAKE":{
                return SNAKE;
            }
            default:{
                throw new RuntimeException("Missmath type of pet");
            }
        }
    }
}
