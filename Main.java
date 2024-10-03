public class Main
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("anees");
        sb.append("Shifa");
        sb.insert(2, " Java");
        sb.deleteCharAt(2);
        sb.setLength(5);
        sb.ensureCapacity(100);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}


/*
22:16:15	UPDATE employee SET hourly_pay=15.36 WHERE employee_id=6	
Error Code: 1175. You are using safe update mode and you tried to update a table without
 a WHERE that uses a KEY column. 
  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.	
  0.015 sec


 */