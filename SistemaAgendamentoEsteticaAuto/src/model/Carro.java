package model;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo, String placa){
        super(marca, modelo, placa);
    }

    public boolean pronto(){
        return true;
    }


    @Override
    public String toString(){
       return super.toString() + " (Carro)";
    }
    //varios codigos
}
