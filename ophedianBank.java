import java.util.LinkedList;
import java.util.Queue;

public class ophedianBank {

     private Queue <Integer> fila = new LinkedList<>();

    
    public void addcliente() {
        fila.offer(1);
    }



      public void Hall() {

        System.out.println("Bem vindo saguão do Banco Ophidian:");
        System.out.println(fila);
    }

    
    public void atendimento() {

        if (!fila.isEmpty()) {
            if (Math.random() < 0.25) {
                System.out.println("Sinto muito mas a papelada está incorreta. Volte para o final da fila, por favor!\n");
                fila.offer(fila.poll());
            } else {
                System.out.println("Atendimento concluido com sucesso! Próximo cliente.\n");
                fila.poll();
            }
        }
    }
    
}