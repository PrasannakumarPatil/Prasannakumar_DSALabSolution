package Com.gl.question1.Driver;
import Com.gl.question1.Services.Balanced;

public class Main {
    public static void main(String args[]) {

        Balanced balanced  = new Balanced();
        System.out.println(balanced.balancing("([[{}]])"));
    }
}
