package model;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private Cliente dono;

    public Veiculo(String marca, String modelo, String placa, Cliente dono){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.dono = dono;
    }

    public abstract boolean pronto();

    public String getMarca(){
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getPlaca(){
        return this.placa;
    }

    public Cliente getDono(){
        return this.dono;
    }

    @Override
    public String toString(){
        return "--- Veículo ---\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nPlaca: " + getPlaca() + "\nDono: " + getDono();
    }
}
