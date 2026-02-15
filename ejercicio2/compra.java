package ejercicio2;

public class compra {

    private int consecutivoCompra;
    private int fechaCompra;
    private int valorTotalIva;
    private int totalCompra;

    public compra(int consecutivoCompra, int fechaCompra, int valorTotalIva, int totalCompra) {
        this.consecutivoCompra = consecutivoCompra;
        this.fechaCompra = fechaCompra;
        this.valorTotalIva = valorTotalIva;
        this.totalCompra = totalCompra;
    }

    public int getConsecutivoCompra() {
        return consecutivoCompra;
    }

    public void setConsecutivoCompra(int consecutivoCompra) {
        this.consecutivoCompra = consecutivoCompra;
    }

    public int getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getValorTotalIva() {
        return valorTotalIva;
    }

    public void setValorTotalIva(int valorTotalIva) {
        this.valorTotalIva = valorTotalIva;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
}