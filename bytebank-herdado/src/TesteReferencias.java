public class TesteReferencias {
    public static void main(String[] args) {
        Pedreiro pedreiro = new Pedreiro();
        Designer designer = new Designer();

        pedreiro.setNome("Fabio");
        pedreiro.setSalario(1500);
        
        designer.setNome("Carlos");
        designer.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(pedreiro);
        controle.registra(designer);    

        System.out.println(controle.getSoma());
    }
}
