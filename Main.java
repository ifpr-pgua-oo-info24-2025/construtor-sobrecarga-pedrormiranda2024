public class Main {
    public static void main (String[] args) {
        Condutor condutor1 = new Condutor("Jorge",  123456); 
        Condutor condutor2 = new Condutor("Pedro", 654321); 
        Motor motor1 = new Motor ("Gasolina", "760cv");
        Motor motor2 = new Motor ("Diesel", "160cv");
        Carro carro1 = new Carro ("Renault", "Kwid", "ABD43D", motor1, condutor1);
        Carro carro2 = new Carro ("Fiat", "Uno", "DHNF34", motor2);
        Carro carro3 = new Carro ("Lamborghini", "Urus", "P3DR0", motor1);

        carro2.setCondutor(condutor2);
        
        carro1.trocarCondutor(condutor2);

        carro2.trocarMotor(motor1);

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString(1));
    }
}
