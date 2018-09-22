import javax.swing.*;

public class Anketgrafic {
    String name;
    String surname;
    int age;
    String color;
    String pet;
    static class Grafic {
        public static void main(String[] args) {
            Anketgrafic obj = new Anketgrafic();
            obj.name = "Nikolay";
            obj.surname = "Nasibulin";
            obj.age = 31;
            obj.color = "Green";
            obj.pet = "Cat";
            String text="Name: " +obj.name+ "Surname: " +obj.surname+ "Age: " +obj.age+ "Color: " +obj.color+ "Pet: " +obj.pet+"\n";



            JOptionPane.showMessageDialog(null,text);

        }
    }
}