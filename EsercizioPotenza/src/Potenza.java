public class Potenza {
    private int base;
    private int esponente;

    Potenza(int base, int esponente){
        this.base = base;
        this.esponente = esponente;
    }


    // metodo elevazione alla potenza
    public int elavazionePotenza(){
       int result = (int) Math.pow(base, esponente);
       return result;
    }


    //metodo cambio base
    public void cambioBase(int a){
        base = a;

    }


    public int getBase() {
        return base;
    }

    public int getEsponente() {
        return esponente;
    }

    public String toString(){
        String s = "la potenza è: " + elavazionePotenza();
        return s;
    }
}
