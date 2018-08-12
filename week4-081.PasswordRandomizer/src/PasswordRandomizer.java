import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    public PasswordRandomizer(int length) {
        this.length=length;
        this.random = new Random();
    }

    public String createPassword() {
        String password="";
        for (int i=0;i<this.length;i++)
        {
            password+=(char)(random.nextInt(26) + 'a');;
        }
        return password;
    }
}
