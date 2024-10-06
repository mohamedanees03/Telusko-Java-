public class Main
{
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("Anees");
        sb.append("Shifa");
        sb.insert(2, " Java");
        sb.deleteCharAt(2);
        sb.setLength(5);
        sb.ensureCapacity(100);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
