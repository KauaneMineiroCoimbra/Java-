// classe filha 

public class Pessoa extends Localiza{
    private String nome;
private String cpf;
private String rg;


    Pessoa() { super(); }

    public void setNome(String nome) {this.nome = nome;}
      public void setcpf(String cpf) {this.cpf = cpf;}
        public void setrg(String rg) {this.rg = rg ;}

        public String getnome() {return this.nome;}
         public String getcpf() {return this.cpf;}
          public String getrg() {return this.rg;}