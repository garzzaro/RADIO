public class Implementacion {
    private public  boolean apagarRadio;
    private public  boolean guardarEstacion;
    private public boolean cargarEstacion;
    private public  boolean cambiarFM; 
    private public boolean cambiarAM;   
}

private Implementacion (boolean apagarRadio, boolean guardarEstacion, boolean cargarEstacion, boolean cambiarFM, boolean cambiarAM) {
    this.apagarRadio = apagarRadio;
    this.guardarEstacion = guardarEstacion;
    this.cargarEstacion = cargarEstacion;
    this.cambiarFM = cambiarFM;
    this.cambiarAM = cambiarAM;
}

public boolean ApagarRadio() {
    return apagarRadio;
}
public boolean GuardarEstacion() {
    return guardarEstacion;
}
public boolean CargarEstacion() {
    return cargarEstacion;
}
public boolean CambiarFM() {
    return cambiarFM;
}
public boolean CambiarAM() {            
    return cambiarAM;
}                                                                       