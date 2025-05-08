public class Aviao extends Veiculo {
    
    private double altitude;
    private boolean tremDePousoBaixado;

    public double getAltitude(){

        return altitude;

    }

    public void setAltitude(double altitude){

        this.altitude = altitude;

    }

    public boolean isTremDePousoBaixado(){

        return tremDePousoBaixado;

    }

    public void setTremDePousoBaixado(boolean tremDePousoBaixado){

        this.tremDePousoBaixado = tremDePousoBaixado;

    }

    public Aviao(String marca, String modelo, int ano, double combustivel, double altitude, boolean tremDePousoBaixado){

        super(marca, modelo, ano, combustivel);
        this.altitude = altitude;
        this.tremDePousoBaixado = tremDePousoBaixado;

    }
    
    public void decolar(){

        if(this.altitude > 0){

            System.out.println("Não é possível decolar, você já está voando!");
        }

        else{

            System.out.println("Decolando...");
            this.altitude = 1000;
            System.out.println("Recolhendo trem de pouso...");
            this.tremDePousoBaixado = true;
            this.altitude = 10000;

        }
    }

    public void subir(){
        if(this.altitude <= 0){

            System.out.println("Por favor decole o avião antes de subir!");

        }

        else{

            System.out.println("Subindo...");
            this.altitude = altitude + 1000;
            System.out.println("A altitude atual é: " + this.altitude);

        }
    }

    public void descer(){

        if(this.altitude > 0){

            System.out.println("Descendo...");
            this.altitude = altitude - 1000;
            System.out.println("A altitude atual é: " + this.altitude);
        }

        if(this.altitude < 0){

            System.out.println("Avião muito próximo ao chão...");
            this.altitude = 0;
            System.out.println("Boom!");

        }
    }

    public void aterrissar(){
        if(this.altitude > 0){
            for(;this.altitude > 0 ; this.altitude -= 1000){
                if(this.altitude <= 1000){
                    this.tremDePousoBaixado = true;
                    System.out.println("Trem de pouso baixado!");
                    for(double aterrissagem = this.altitude; aterrissagem >= 0; aterrissagem = aterrissagem - 500){
                        System.out.println(aterrissagem + "m de altura.");
                        System.out.println("Avião no chão, preparando freios...");
                    }
                }
            }
        }
        else{
            System.out.println("O avião já está no solo!");
        }
    }

    
}

