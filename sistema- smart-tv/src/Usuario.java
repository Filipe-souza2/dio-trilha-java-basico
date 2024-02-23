public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligado);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status : TV Ligada ? " + smartTv.ligado);
        
        smartTv.desligar();
        System.out.println("Novo Status : TV Ligada ? " + smartTv.ligado);
        
        smartTv.aumentarVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.canalAMais();
        System.out.println("Canal Atual ? " + smartTv.canal);
        smartTv.canalAMais();
        System.out.println("Canal Atual ? " + smartTv.canal);

        smartTv.canalAMenos();
        System.out.println("Canal Atual ? " + smartTv.canal);

        double somatorio = smartTv.somar(10, 15);
        System.out.println(somatorio);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " + smartTv.canal);






    }
}
