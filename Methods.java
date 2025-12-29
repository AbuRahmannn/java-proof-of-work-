public class Methods {
    public static void main(String[] args){
        Methods m = new Methods();
        m.hello();
        m.add(10,20);
    }
    void hello(){
        System.out.println("Hello World");
    }
    void add(int x,int y){
        System.out.println(x+y);
    }
}
