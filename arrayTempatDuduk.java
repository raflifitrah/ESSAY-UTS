
import java.util.ArrayList;


public class arrayTempatDuduk {
    public static void main(String[] args) {
        String tempat_duduk [][] = {
            {"Rafli", "", "Fazri", "Tresna"},
            {"", "Hawa", "", "Aldi"},
            {"Messi", "Nunez", "Alvarez"}
        };
        ArrayList <String> waiting_list = new ArrayList<>();
        waiting_list.add("Pedri");
        waiting_list.add("Beckham");
        waiting_list.add("Degea");
        waiting_list.add("Maguire");
        waiting_list.add("Pele");
        waiting_list.add("Lewandowski");
        
        for(int i =0; i< tempat_duduk.length; i++){
            for(int j=0;j<tempat_duduk[i].length; j++) {
                if(tempat_duduk[i][j].equals("")){
                    tempat_duduk[i][j]=waiting_list.get(0);
                }
                System.out.print(tempat_duduk[i][j] + "-");
    }
            System.out.println("");
}
        if (waiting_list.size()>0) {
            System.out.println(waiting_list+ " Tidak kebagian tempat duduk");
        }
    }
}