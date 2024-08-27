import java.util.ArrayList;

public class Principal {

    //a) Método que retorna quantas ocorrências de um elemento estão na lista
    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int contador = 0;
        for (Integer num : l) {
            if (num.equals(el)) {
                contador++;
            }
        }
        return contador;
    }

    //c) Método que retorna o número de elementos repetidos em l
    public int nroRepeat(ArrayList<Integer> l) {
        int[] vistos = new int[l.size()]; // Assume que os elementos são não-negativos e menores que l.size()
        int contador = 0;
        for (int i = 0; i < l.size(); i++) {
            int num = l.get(i);
            if (vistos[num] == 0) {
                vistos[num] = 1;
            } else {
                contador++;
            }
        }
        return contador;
    }

    //e) Método que retorna a união de l1 e l2
    public ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> uniao = new ArrayList<>(l1);
        for (Integer num : l2) {
            if (!uniao.contains(num)) {
                uniao.add(num);
            }
        }
        return uniao;
    }
    
}