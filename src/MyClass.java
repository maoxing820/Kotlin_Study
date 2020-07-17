public class MyClass {
    public static void main(String[] args) {
        Test ts = new Test();
    }

    public static String look(){
        return null;
    }
}

class Test extends Object{
    String name;

    public Test(){

    }

    public Test(String name){
        this.name = name.toUpperCase();
    }

    public void tt(String ... names){

    }
}

class User1{
    private String name;
    private String password;
    private int id;

    public User1(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}