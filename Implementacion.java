
import java.util.Scanner;

public class Implementacion implements Radio {
    private boolean encendido = false;
    private boolean esAM = true;
    private int emisoraAM = 530;
    private double emisoraFM = 87.9;
    
    // 12 botones para cada banda
    private int[] botonesAM = new int[12];
    private double[] botonesFM = new double[12];
    private Scanner teclado = new Scanner(System.in);

    @Override
    public void prenderRadio() {
        this.encendido = true;
        System.out.println("Radio: ON");
    }

    @Override
    public void apagarRadio() {
        this.encendido = false;
        System.out.println("Radio: OFF");
    }

    @Override
    public void avanzarEstacion() {
        if (!encendido) return;
        if (esAM) {
            emisoraAM += 10;
            if (emisoraAM > 1610) emisoraAM = 530;
            System.out.println("Sintonizando AM: " + emisoraAM);
        } else {
            // Incremento de 0.2 con redondeo para evitar errores de punto flotante
            emisoraFM = Math.round((emisoraFM + 0.2) * 10.0) / 10.0;
            if (emisoraFM > 107.9) emisoraFM = 87.9;
            System.out.println("Sintonizando FM: " + emisoraFM);
        }
    }

    @Override
    public void cambiarFM() {
        if (encendido) {
            this.esAM = false;
            System.out.println("Banda actual: FM");
        }
    }

    @Override
    public void cambiarAM() {
        if (encendido) {
            this.esAM = true;
            System.out.println("Banda actual: AM");
        }
    }

    @Override
    public void guardarEstacion() {
        if (!encendido) return;
        System.out.print("Guardar en boton (1-12): ");
        int num = teclado.nextInt() - 1;
        if (num >= 0 && num < 12) {
            if (esAM) botonesAM[num] = emisoraAM;
            else botonesFM[num] = emisoraFM;
            System.out.println("Estacion guardada en boton " + (num + 1));
        }
    }

    @Override
    public void cargarEstacion() {
        if (!encendido) return;
        System.out.print("Cargar boton (1-12): ");
        int num = teclado.nextInt() - 1;
        if (num >= 0 && num < 12) {
            if (esAM && botonesAM[num] != 0) {
                emisoraAM = botonesAM[num];
                System.out.println("Cargada AM: " + emisoraAM);
            } else if (!esAM && botonesFM[num] != 0.0) {
                emisoraFM = botonesFM[num];
                System.out.println("Cargada FM: " + emisoraFM);
            } else {
                System.out.println("Boton vacio.");
            }
        }
    }
}

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

