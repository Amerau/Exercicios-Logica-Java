public class Aviao extends Veiculo{

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

        if(altitude > 0){
            System.out.println("Não é possível decolar um avião que já está no ar!");
        }
        else{
            this.altitude = 10000;
            this.tremDePousoBaixado = false;
            System.out.println("Levantando voo e levantando trem de pouso..." +
                               "\n Altitude atual: " + this.altitude
            );
        }
    }

    public void subir(){

        if(this.altitude > 0){
            this.altitude = altitude + 1000;
            System.out.println("Altitude atual: " + this.altitude + " m.");
        }
        else{
            System.out.println("Avião no chão, não é possível subir antes de decolar.");
        }

    }

    public void descer(){

        if(this.altitude > 0){
            this.altitude = altitude - 1000;
            if(this.altitude < 0){
                this.altitude = 0;
            }
            if(this.altitude == 0){
                System.out.println("Avião no chão!");
            }
        }

    }

    public void aterrissar(){

        if (this.altitude > 0){
            if(this.altitude <= 1000){
                this.tremDePousoBaixado = true;
                this.altitude = 0;
            }
        else{
        System.out.println("Abaixe para uma altitude segura para aterrissar antes de pousar.");
        }
        }
    }

    
}
