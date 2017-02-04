
package boletin18;


public class Correo {
    private String mensaxe;
    private boolean lido=false;//false=non lido

    public String getMensaxe() {
        return mensaxe;
    }

    public void setMensaxe(String mensaxe) {
        this.mensaxe = mensaxe;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
        
    }

    public Correo() {
    }

    public Correo(String mensaxe, boolean lido) {
        this.mensaxe = mensaxe;
        this.lido = lido;
    }

    @Override
    public String toString() {
        return "Correo{" + "mensaxe=" + mensaxe + ", lido=" + lido + '}';
    }
    
    
    
}
