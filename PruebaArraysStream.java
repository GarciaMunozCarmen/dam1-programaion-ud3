import java.util.Arrays;

public class PruebaArraysStream {

    static class Person {
        public String firstname;

        public int age;

        public Person(String firstname,int age){
            this.firstname = firstname;
            this.age = age;
        }

        public int getAget(){
            return age;
        }
    }
    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 20),
            new Person("Jane", 30),
        };
        
        System.out.println(Arrays.stream(people).mapToInt(Person::getAget).average().getAsDouble());

        //double totalPrecio = Arrays.stream(carrito).mapToDouble(Producto::getPrecio).sum();
    }
}
