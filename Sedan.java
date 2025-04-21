public class Sedan extends Carro {

    private boolean temTetoSolar;

    public boolean isTemTetoSolar(){

        return temTetoSolar;

    }

    public void getTemTetoSolar(boolean temTetoSolar){

        this.temTetoSolar = temTetoSolar;

    }
    
    public Sedan(String marca, String modelo, int ano, double combustivel, int numeroPortas, boolean temTetoSolar){

        super(marca, modelo, ano, combustivel, numeroPortas);
        this.temTetoSolar = temTetoSolar;

    }

    @Override
    public void exibirInfo(){
        
        System.out.println("\n Marca:                " + getMarca()            + 
                           "\n Modelo:               " + getModelo()           +
                           "\n Ano:                  " + getAno()              +
                           "\n Velocidade Atual:     " + getVelocidadeAtual()  +
                           "\n Combustivel:          " + getCombustivel()      +
                           "\n Número de Portas      " + getNumeroPortas()          
        );

        if(this.temTetoSolar){
            System.out.println("\n Possui teto solar?: " + "Sim!");
        }
        if(!this.temTetoSolar){
            System.out.println("\n Possui teto solar?: " + "Não!");
        }

        if(isMotorLigado()){
            System.out.println("\n Estado do Motor: " + "Ligado");
        }
        else{
            System.out.println("\n Estado do Motor: " + "Desligado");

        }

    }
    
}
