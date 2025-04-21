public class Carro extends Veiculo {

    private int numeroPortas;

    public int getNumeroPortas(){

        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }

    public Carro (String marca, String modelo, int ano, double combustivel, int numeroPortas){

        super(marca, modelo, ano, combustivel);
        this.numeroPortas = numeroPortas;
    }
    
    public void buzinar(){

        System.out.println("FONFON!!!");
    }

    @Override
    public void exibirInfo(){

        System.out.println("\n Marca:            " + getMarca()           + 
                           "\n Modelo:           " + getModelo()          +
                           "\n Ano:              " + getAno()             +
                           "\n Velocidade Atual: " + getVelocidadeAtual() +
                           "\n Combustivel:      " + getCombustivel()     +
                           "\n Número de Portas  " + this.numeroPortas
        );
        if(isMotorLigado()){
            System.out.println("\n Estado do Motor: " + "Ligado");
        }
        else{
            System.out.println("\n Estado do Motor: " + "Desligado");
        }
    }
     
}