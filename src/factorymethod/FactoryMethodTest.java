package factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMethodTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input type packset: ");
        String input = bufferedReader.readLine();
        Packset packset = PacksetFactory.createPacket(input);
        System.out.println(packset);
        System.out.println();
    }
}
