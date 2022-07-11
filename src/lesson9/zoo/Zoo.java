package lesson9.zoo;

public class Zoo {

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        // задача - поместить всех животных в один массив

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger2;
        animals[2] = monkey1;
        animals[3] = monkey2;


        tiger1.voice(); // чей вызовится???



        for(Animal animal:animals){
            animal.voice(); // полиморфизм - это свойсво джава работать с назными типа
            // как с одним и тем же, !!!! но в то же самое время
            // выполнение программы будет РАЗНОЕ как будно вы работает с РАЗНЫМИ типами
        }

    }
}
