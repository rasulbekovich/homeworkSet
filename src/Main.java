import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1=new LinkedHashSet<>(List.of(1,2,3));
        Set<Integer>set2=new LinkedHashSet<>(List.of(0,1,2));
        System.out.println(set1+"\n"+set2);
        System.out.println(symmetricDifference(set1,set2));
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer>contain=new TreeSet<>(set1);
        contain.addAll(set2);
        Set<Integer>sorted=new TreeSet<>(set1);
        sorted.retainAll(set2);
        contain.removeAll(sorted);
        return contain;
    }
}
