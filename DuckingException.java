public class DuckingException {
    public static void main(String[] args) {
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // try{
        //     obj.show();
        // }
        // catch(Exception e){
        //     System.out.println("Not able to find class "+e);   
        // }
    }
}

class A {
    public void show() throws ClassNotFoundException{
        // try{
        //     Class.forName("Doubt");
        // }
        // catch(Exception e){
        //     System.out.println("Not able to find class "+e);
        // }
        Class.forName("Anees"); 
    }
}
