public class This_Keyword_In_Java {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(50);
        obj.setName("navin");

        System.out.println(obj.getAge()+" "+obj.getName());
    }
}

class Human{
    int age;
    String name;

    public void setAge(int age){
        this.age=age; // this -> represents the current value in the object
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
