public class Cachorro extends Animal {
    public void VerStatus() {
        System.out.println("***CACHORRO***");
        System.out.println("esta acordado? "+isAcordado());
        System.out.println("esta latindo? "+isLatindo());
        System.out.println("esta com fome? "+isFome());
        System.out.println("chorou quantas lagrimas? "+getChorando());
    }
    @Override
    public void setAcordado(boolean acordado) {
        super.setAcordado(acordado);
    }

    @Override
    public boolean isAcordado() {
        return super.isAcordado();
    }

    @Override
    public boolean isFome() {
        return super.isFome();
    }

    @Override
    public boolean isLatindo() {
        return super.isLatindo();
    }

    @Override
    public int getChorando() {
        return super.getChorando();
    }

    @Override
    public void EngolirChoro() {
        super.EngolirChoro();
    }

    @Override
    public void setChorando(int chorando) {
        super.setChorando(chorando);
    }

    @Override
    public void setFome(boolean fome) {
        super.setFome(fome);
    }

    @Override
    public void setLatindo(boolean latindo) {
        super.setLatindo(latindo);
    }

    @Override
    public void ToComfome() {
        super.ToComfome();
    }

    @Override
    public void ToNemAi() {
        super.ToNemAi();
    }

    @Override
    public void ToSemFome() {
        super.ToSemFome();
    }

    @Override
    public void VerStatus() {
        super.VerStatus();
    }

    @Override
    public void latir() {
        super.latir();
    }
}
