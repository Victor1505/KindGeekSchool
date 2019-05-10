package lesson3;


public class AnimalsExample {

        String name;
        int waight;

        public AnimalsExample(){}

        public AnimalsExample(String nameAnimals, int waightAnimals){
            name = nameAnimals;
            waight = waightAnimals;
        }

        public void run(int speed){
            System.out.println(name + " run "+speed+" km/h");
        }

    }

