package model;

public class Pagamento {
    private int formaDePagamento; // 1- pix, 2 - credito, 3 - debito, 4 - dinheiro
    private double valorTotal;
    
    public Pagamento(int tipoDePagamento, double valorTotal){
        this.formaDePagamento = tipoDePagamento;
        this.valorTotal = valorTotal;
    }

    public boolean pago(){
        return false;
    }
}
