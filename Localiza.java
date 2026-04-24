/*criar minha superclase ou classe_mãe*/

public class Localiza{
private String Email;
private String telefone;
private String rua;
private String numero;
private String bairro;
private String cidade;
private String sigla;
private String cep;

//metodos
public void setEmail(String Email){this.Email = Email;}
public void settelefone(String telefone){this.telefone = telefone;}
public void setrua (String rua){this.rua = rua;}
public void setnumero(String numero){this.numero = numero;}
public void setbairro(String bairro){this.bairro = bairro;}
public void setcidade(String cidade){this.cidade = cidade;}
public void setsigla(String uf){this.sigla = uf;}
public void setcep(String cep){this.cep = cep;}

public String getEmail() {return this.email;}
public String gettelefone() {return this.telefone;}
public String getrua() {return this.rua;}
public String getnumero() {return this.numero;}
public String getbairro() {return this.bairro;}
public String getcidade(){return this.cidade;}
public String getsigla(){return this.sigla;}
public String getcep(){return this.cep;}
}