public class Animal implements Habito{
    boolean latindo;
    boolean acordado;
    boolean fome;
    int chorando;
    @Override
    public void VerStatus() {
        System.out.println("***ANIMAL***");
        System.out.println("esta acordado? "+isAcordado());
        System.out.println("esta latindo? "+isLatindo());
        System.out.println("esta com fome? "+isFome());
        System.out.println("chorou quantas lagrimas? "+getChorando());
    }
    public Animal() {
        this.latindo = false;
        this.acordado =true;
        this.chorando = 50;
        this.fome = false;
    }

    public boolean isFome() {return fome;}
    public boolean isLatindo() {
        return latindo;
    }

    public boolean isAcordado() {
        return acordado;
    }
    public int getChorando() {
        return chorando;
    }
    public void setLatindo(boolean latindo) {
        this.latindo = latindo;
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }
    public void setChorando(int chorando) {
        this.chorando = chorando;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    @Override
    public void latir() {
        if (isAcordado()&&isFome()){
            setLatindo(true);
        }
    }

    @Override
    public void EngolirChoro() {
        setChorando(0);
    }

    @Override
    public void ToComfome() {
        setFome(true);
    }

    @Override
    public void ToSemFome() {
        setFome(false);
    }

    @Override
    public void ToNemAi() {
        setFome(false);
        setLatindo(false);
        setAcordado(false);
        setChorando(0);

    }
}
