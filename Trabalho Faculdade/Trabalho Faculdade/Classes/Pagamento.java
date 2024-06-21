package Classes;

public class Pagamento {
    
    private double credito;
    private double debito;
    private double pix;

     

      
    public Pagamento() {
    }

    public Pagamento(double credito, double debito, double pix) {
        this.credito = credito;
        this.debito = debito;
        this.pix = pix;
    }


    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    
    public double getPix() {
        return pix;
    }

    public void setPix(double pix) {
        this.pix = pix;
    }
}
