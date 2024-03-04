public class Main {
    public static void main(String[] args){
        Kucing kucing = new Kucing();
        kucing.speak();
    }
}

class Kucing {
    String name;
    String gender;
    void speak(){
        System.out.println("miauw");
    }
    void drink(){
        System.out.println("slurp");
    }
}