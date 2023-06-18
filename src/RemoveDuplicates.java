import java.util.LinkedList;
public class RemoveDuplicates{
    public static void main(String[] args) {
        LinkedList<Object>a1=new   LinkedList<Object>();
        a1.add("java");
        a1.add('a');
        a1.add('b');
        a1.add(10);
        a1.add(12.33);
        a1.add("java");
        a1.add("java");
        System.out.println("Before Remove Duplicates elements:"+a1);
        for(int i=0;i<a1.size();i++) {
            for (int j = i+1; j<a1.size(); j++) // j=i+1
            {
                if (a1.get(i).equals(a1.get(j))) {
                    a1.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicates element:"+a1);
    }
}
