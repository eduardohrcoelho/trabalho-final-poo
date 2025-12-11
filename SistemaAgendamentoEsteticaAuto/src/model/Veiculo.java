package model;

public abstract class Veiculo {
<<<<<<< HEAD
  protected String marca;
  protected String modelo;
  protected String placa;
=======
    protected String marca;
    protected String modelo;
    protected String placa;
    protected int id;

    public Veiculo(){}
>>>>>>> 1bcfe8cc3e5cc6826c237058796498c91c04e9bd

  public Veiculo(String marca, String modelo, String placa) {
    this.marca = marca;
    this.modelo = modelo;
    this.placa = placa;
  }

<<<<<<< HEAD
  public abstract boolean pronto();

  public abstract double getTaxaAdicional();
=======
    public abstract double getTaxaAdicional();
>>>>>>> 1bcfe8cc3e5cc6826c237058796498c91c04e9bd

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

<<<<<<< HEAD
  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return this.placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  @Override
  public String toString() {
    return "--- Veículo ---\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPlaca: " + getPlaca();
  }
=======
    public String getPlaca(){return this.placa;}
    public void setPlaca(String placa){this.placa = placa.toUpperCase();}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}    

    @Override
    public String toString(){
        return "--- Veículo ---\nID: "+ id + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPlaca: " + getPlaca();
    }

    
>>>>>>> 1bcfe8cc3e5cc6826c237058796498c91c04e9bd
}
