public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); // ordinal gives indexes

        Status[] ss=Status.values();
        for(Status i:ss){
            System.out.println(i+":"+i.ordinal());
        }

        switch(s){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Something went wrong");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
        }
    }
}

enum Status {
    Running, Failed, Pending, Success;
}
