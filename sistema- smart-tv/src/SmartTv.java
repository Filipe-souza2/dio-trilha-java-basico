public class SmartTv {

    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void canalAMais() {
        canal++;
    }

    public void canalAMenos() {
        canal--;
    }
    
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public double somar(int num1, int num2) {
        double somando = num1 + num2;
        return somando;
    }
}