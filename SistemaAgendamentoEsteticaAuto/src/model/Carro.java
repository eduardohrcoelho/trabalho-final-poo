package model;

public class Carro extends Veiculo{
    private int categoria; // 1 - Hatch, 2 - Sedan, 3 - SUV, 4 - Camionete
    
    public Carro(String marca, String modelo, String placa, Cliente dono, int categoria){
        super(marca, modelo, placa, dono);
        this.categoria = categoria;
    }

    public int getCategoria(){
        return this.categoria;
    }

    @Override
    public String toString(){
       return super.toString() + " (Carro)";
    }

    public boolean pronto(){
        return true;
    }

    // Metodo que calcula a taxa adicional de acordo com o tamanho do carro
    public double getTaxaAdicional(){ 
        if(this.getCategoria() == 1){
            return 10.00;
        }else if(this.getCategoria() == 2){
            return 15.00;
        }else if(this.getCategoria() == 3){
            return 20.00;
        }else if(this.getCategoria() == 4){
            return 25.00;
        }
        return 0.0;
    }
}
