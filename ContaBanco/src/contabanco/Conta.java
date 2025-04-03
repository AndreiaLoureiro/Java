package contabanco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void Conta(){
        this.saldo=0;
        this.status=false;
    }
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
       System.out.println("Conta" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos especificos 
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50); 
        }else if("CP".equals(t)){
            this.setSaldo(150); 
        }
        System.out.println("Conta aberta com sucesso");
    }
     public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.println("Conta não pode se fechada ainda tem dinheiro");
        }
        else if(this.getSaldo()>0){
            System.out.println("(conta não pode ser fechada, está com dívida");
        }else{
            this.setStatus(false);
            System.out.println("Conta pode ser encerrada com sucesso!");
        }
 
    }
    public void depositar(float v){
      if (this.getStatus()){
          this.setSaldo(this.getSaldo() + v);
          System.out.println("Depósito reaizado com sucesso na conta" + this.dono);
      }else {
          System.out.println("Impossível depositar conta encerrada!");
      }
        
    }
   public void levantar(float v){
   if(this.getStatus()){
       if(this.getSaldo()>=v){
           this.setSaldo(this.getSaldo()- v);
           System.out.println("Levamento realizado na conta" + this.getDono());
       }else{
           System.out.println("Saldo insuficiente para levantar");
       }
   }else{
         System.out.println("Impossivel levantar de uma conr encerrada");     
        }
   }
   public void Mensalidade(){
   int v = 0;
       if ("CC".equals(this.getTipo())) {
           v=12;
       } else if ("CP".equals(this.getTipo())) {
           v=20;
       }
          if(this.getStatus()){
              this.setSaldo(this.getSaldo()-v);
              System.out.println("Mensalidade paga com sucesso" + this.getDono());
              
          }else{
                System.out.println("Impossível pagar mensalidade");
   }
   }
        
    }
   

