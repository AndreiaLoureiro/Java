
package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        // TODO code application logic here
         Conta p1=new Conta();
         p1.setNumConta(1111);
         p1.setDono("João");
         p1.abrirConta("CC");
         
         Conta p2 = new Conta();
         p2.setNumConta(222);
         p2.setDono("Maria");
         p2.abrirConta("CP");
         
         p1.depositar(100);
         p2.depositar(500);
         
         p2.levantar(100);
           
         p1.levantar(150);
         p1.fecharConta();
       
         
         p1.estadoAtual();
         p2.estadoAtual();
    }
    
}
