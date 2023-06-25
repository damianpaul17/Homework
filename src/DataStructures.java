import sun.net.www.http.KeepAliveCache;

import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    public static void main(String[] args)    {
        ArrayList<String> listaCursuri = new ArrayList<>();
        listaCursuri.add("Testare manuala");
        listaCursuri.add("Testare automata ");
        listaCursuri.add("Front-End");
        listaCursuri.add("Java");

        System.out.println(listaCursuri.size());

        System.out.println(listaCursuri.get(1));

        for (String element:listaCursuri){
            System.out.println(element);
        }

        String numeStudent;
        Boolean treceExamenul = null;

        KeepAliveCache hashMapList;
        HashMap< String(numeStudent), Boolean(treceExamenul)> hashMapList = new HashMap<>();
        hashMapList.put("Paul",treceExamenul);
        hashMapList.put("Andrei",treceExamenul);

        System.out.println(hashMapList.get(2));
        System.out.println(hashMapList.keySet());
                System.out.println(hashMapList.values());
        System.out.println(hashMapList.entrySet());


    }
}