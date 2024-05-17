public class SmartTV {

    boolean ligada = false;
    int canal = 1; // valores: de 1 até 10 (incluindo 1 e 10)
    int volume = 0; // valores: de 1 até 100 (incluindo 1 e 100)

    public SmartTV() {
    }

    public SmartTV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void ligar() {
        if (!this.ligada) {
            ligada  = true;
        }
    }

    public void desligar() {
        if (this.ligada) {
            ligada  = false;
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            (this.volume)++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            (this.volume)--;
        }
    }

    public void mudarDeCanal(String comando) {
        if (ligada) {
            if (comando.equals("Avançar")) {
                if (canal < 10) {
                    canal++;
                }
                else {
                    canal = 1;
                }
            } else if (comando.equals("Retroceder")) {
                if (canal > 1) {
                    canal--;
                }
                else {
                    canal = 10;
                }
            }
        }


    }

    public void mudarDeCanal(int numeroDoCanal) {
        if (ligada) {
            if (numeroDoCanal >= 1 && numeroDoCanal <= 100) {
                this.canal = numeroDoCanal;
            }
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

}