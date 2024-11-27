import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename with extension: ");

        String filename = scanner.next();
        File file = new File("public"+"/"+filename);
        if(file.exists()) {
            System.out.println("arquivo existe");
        } else {
            System.out.println("arquivo nao existe");
        }
    }
}