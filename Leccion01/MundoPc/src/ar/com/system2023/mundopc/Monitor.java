package ar.com.system2023.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private static int ContadorMonitores;
    private double tamanio;
    
    private Monitor(){
        this.idMonitor = ++Monitor.ContadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this(); //llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    //ingresamos manualmente el getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
}
