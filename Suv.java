public class Suv extends Carro {

    private double portaMalasVolume;

    public double getPortaMalasVolume(){

        return portaMalasVolume;
    }

    public void setPortaMalasVolume(double portaMalasVolume){

        this.portaMalasVolume = portaMalasVolume;

    }

    public Suv(String marca, String modelo, int ano, double combustivel, int numeroPortas, double portaMalasVolume){

        super(marca, modelo, ano, combustivel, numeroPortas);
        this.portaMalasVolume = portaMalasVolume;

    }

    @Override
    public void exibirInfo(){
        
        System.out.println("\n Marca:                " + getMarca()            + 
                           "\n Modelo:               " + getModelo()           +
                           "\n Ano:                  " + getAno()              +
                           "\n Velocidade Atual:     " + getVelocidadeAtual()  +
                           "\n Combustivel:          " + getCombustivel()      +
                           "\n Número de Portas      " + getNumeroPortas()     +
                           "\n Volume do Porta-Malas " + this.portaMalasVolume 
        );
        if(isMotorLigado()){
            System.out.println("\n Estado do Motor: " + "Ligado");
        }
        else{
            System.out.println("\n Estado do Motor: " + "Desligado");
        }
    }
    
}
