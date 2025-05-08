public class Trem extends Veiculo{

    private int numeroVagoes;

    public int getNumeroVagoes(){

        return numeroVagoes;

    }

    public void setNumeroVagoes(int numeroVagoes){

        this.numeroVagoes = numeroVagoes;

    }

    public Trem(String marca, String modelo, int ano, double combustivel, int numeroVagoes){

        super(marca, modelo, ano, combustivel);
        this.numeroVagoes = numeroVagoes;

    }

    public void acoplarVagao(){

        this.numeroVagoes = numeroVagoes + 1;

    }

    public void desacoplarVagao(){
        
        if(this.numeroVagoes == 0 || this.numeroVagoes < 0){
            System.out.println("Não há mais vagões no trem");
        }
        else{
        this.numeroVagoes = numeroVagoes - 1;
        }

    }
}
