class Layola{
    String branch;
    int room;
    public void studs(){
        System.out.println(this.branch);
        System.out.println(this.room);
    }
}
public class Oops{
    public static void main(String[] args) {
        Layola l1 = new Layola();
        l1.branch = "IT";
        l1.room = 2;

        l1.studs();
    }
}