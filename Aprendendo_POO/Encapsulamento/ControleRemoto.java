package Encapsulamento;

public class ControleRemoto implements Controlador {
    private int Volume;
    private Boolean Ligado;
    private Boolean Tocando;

    public ControleRemoto() {
        this.Volume = 50;
        this.Ligado = false;
        this.Tocando = false;
    }

    private int getVolume() {
        return this.Volume;
    }

    private void setVolume(int volume) {
        this.Volume = volume;
    }

    private Boolean getLigado() {
        return this.Ligado;
    }

    private void setLigado(Boolean ligado) {
        this.Ligado = ligado;
    }

    private Boolean getTocando() {
        return this.Tocando;
    }

    private void setTocando(Boolean tocando) {
        this.Tocando = tocando;
    }

    public void Ligar() {
        setLigado(true);
    };

    public void Desligar() {
        setLigado(false);
    };

    public void abrirMenu() {
        int i;
        System.out.println("Ligado: " + getLigado());
        System.out.print("Volume: " + getVolume());
        for (i = 0; i <= getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("\nTocando: " + getTocando());
    };

    public void fecharMenu() {

    };

    public void maisVolume() {
        if (getLigado() == true) {
            setVolume(getVolume() + 1);
        }
    };

    public void menosVolume() {
        if (getLigado() == true) {
            setVolume(getVolume() - 1);
        }
    };

    public void ligarMudo() {
        if (getLigado() == true && getVolume() > 0) {
            setVolume(0);
        }
    };

    public void desligarMudo() {
        if (getLigado() == true && getVolume() == 0) {
            setVolume(50);
        }
    };

    public void Play() {
        if (getLigado() == true && getTocando() == false) {
            setTocando(true);
        }
    };

    public void Pause() {
        if (getLigado() == true && getTocando() == true) {
            setTocando(false);
        }
    };
}
