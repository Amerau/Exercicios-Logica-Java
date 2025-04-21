public class Moto extends Veiculo {

    private boolean temPartidaEletrica;

    public boolean isTemPartidaEletrica(){

        return temPartidaEletrica;

    }

    public void getTemPartidaEletrica(boolean temPartidaEletrica){

        this.temPartidaEletrica = temPartidaEletrica;

    }
    
    public Moto(String marca, String modelo, int ano, double combustivel, boolean temPartidaEletrica){

        super(marca, modelo, ano, combustivel);
        this.temPartidaEletrica = temPartidaEletrica;

    }

    public void buzinar(){

        System.out.println("BIBI!!!!");
        
    }

    @Override
    public void exibirInfo(){

        System.out.println("\n Marca:                  " + getMarca()              + 
                           "\n Modelo:                 " + getModelo()             +
                           "\n Ano:                    " + getAno()                +
                           "\n Velocidade Atual:       " + getVelocidadeAtual()    +
                           "\n Combustivel:            " + getCombustivel()        +
                           "\n Tem Partida Elétrica?:  " + this.temPartidaEletrica
        );
        if(isMotorLigado()){
            System.out.println("\n Estado do Motor: " + "Ligado");
        }
        else{
            System.out.println("\n Estado do Motor: " + "Desligado");
        }
    }

}
