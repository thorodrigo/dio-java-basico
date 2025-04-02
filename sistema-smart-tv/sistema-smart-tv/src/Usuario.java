public class Usuario {
    public static void main(String[] args) {
        SmartTv SmartTv = new SmartTv();

        System.out.println("TV Ligada? " + SmartTv.ligada);  
        
        if (SmartTv.ligada == true) {
            System.out.println("Canal atual: " + SmartTv.canal);
        } else {
            System.out.println("TV está desligada!");
        }

        if (SmartTv.ligada == true) {
            System.out.println("Volume atual: " + SmartTv.volume);
        } else {
            System.out.println("TV está desligada!");
        }

        SmartTv.ligar();

        if (SmartTv.ligada == true) {
            System.out.println("Canal atual: " + SmartTv.canal);
        } else {
            System.out.println("TV está desligada!");
        }

        if (SmartTv.ligada == true) {
            System.out.println("Volume atual: " + SmartTv.volume);
        } else {
            System.out.println("TV está desligada!");
        }        

    }
}
