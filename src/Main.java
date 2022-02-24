import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Stu stu1 =new Stu("Nam","HN",20);
        Stu stu2 =new Stu("Hung","HN",30);
        Stu stu3 =new Stu("Ha","HN",60);

        Map<Integer,Stu> stuMap = new HashMap<>();
        stuMap.put(1,stu1);
        stuMap.put(2,stu2);
        stuMap.put(3,stu3);
        stuMap.put(4,stu1);

        for (Map.Entry<Integer,Stu> stu:stuMap.entrySet()
             ) {
            System.out.println(stu);
            //clone object vào hashMap
        }

        System.out.println("\n");
        Set<Stu> stuSet = new HashSet<>();
        stuSet.add(stu1);
        stuSet.add(stu2);
        stuSet.add(stu3);
        stuSet.add(stu1);

        for (Stu stu:stuSet
             ) {
            System.out.println(stu);
            //tham chiếu obj vào hashSet
        }

    }
}
