package model;

import java.util.UUID;

public class Cliente {
  private String nome;
  private String telefone;
  private String cpf;
  //private Veiculo veiculo;
  private final String id;



  // private Agendamento horarioMarcado;

  public Cliente(){ this.id = UUID.randomUUID().toString();}

  public Cliente(String n, String t, String c) {
    this.nome = n;
    this.id= UUID.randomUUID().toString();
    setCpf(c);
    setTelefone(t);

    

    //this.veiculo = v;
  }

  // Setters
  public void setNome(String n) {
    this.nome = n;
  }

  public void setTelefone(String t) {

    try {
      
      validarTelefone(t);
        this.telefone = t;

    } catch (IllegalArgumentException e) {

        System.err.println("Erro ao cadastrar o Telefone, Erro:" +e.getMessage());

    }
  }

  public void setCpf(String c) {
    try {

      validarCPF(c);
        this.cpf = c;

    } catch (IllegalArgumentException e) {

        System.err.println("Erro ao cadastrar o CPF: " + e.getMessage());

    }
  }

  /*public void setVeiculo(Veiculo v) {
    this.veiculo = v;
  }*/

  // Getters

  public String getNome() {
    return this.nome;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public String getCpf() {
    return this.cpf;
  }

  /*public Veiculo getVeiculo() {
    return this.veiculo;
  }*/


/* 
  public boolean verificaCPF(String c1) {
    if (c1 == null) {
      return false;
    }

    String cpfLIMPO = c1.replaceAll("[^0-9]", "");

    if (cpfLIMPO.length() != 11) {

      return false;
    }

    return true;

  }

  public boolean verificarTelefone(String t) {
    if (t == null) {
      return false;
    }

    String telefoneLIMPO = t.replaceAll("[^0-9]", "");

    if (telefoneLIMPO.length() != 9) {
      return false;
    }

    return true;
  }
*/

// METODOS para verificar CPF e TELEFONE 

private void validarCPF(String cpf){

  if(cpf==null){
    throw  new IllegalArgumentException("CPF não foi preenchido ");
  }

  String cpfLimpo = cpf.replaceAll("[^0-9]", "");

  if (cpfLimpo.length() != 11) {

    throw  new IllegalArgumentException("CPF não foi preenchido da forma correta");
    
  }
}

private void validarTelefone(String t){
if (t == null) {
     throw  new IllegalArgumentException("Telefone não foi preenchido");
    }

    String telefoneLIMPO = t.replaceAll("[^0-9]", "");

    if (telefoneLIMPO.length() != 11) {
     throw  new IllegalArgumentException("Telefone não foi preenchido corretamente");
    }
  }




  public String toString() {
    return "ID:"+id+
           "\nNome: " + this.nome +
           "\nCPF: " + this.cpf +
           "\nTelefone: " + this.telefone ;
  }

  public static void main(String[] args) {

    // Veiculo chev = new Carro("CHevrolet", "Chevette", "GWO-5557", 2);
    Cliente c1 = new Cliente("Jorge", "31 9 9877-6704", "149.899.356-75");
    System.out.println(c1.toString());

  }

}
