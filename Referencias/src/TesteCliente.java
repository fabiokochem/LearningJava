public class TesteCliente {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 456);
        Cliente pedro = new Cliente();

        conta.setTitular(pedro);
        pedro.setNome("Pedro Moraes");
        System.out.println(pedro.getNome());

        conta.getTitular().setNome("Claudinho Bochecha");
        
        System.out.println(conta.getTitular().getNome());
        System.out.println(Conta.getTotal());

        Conta conta2 = new Conta(321, 654);
        Cliente fabio = new Cliente();
        fabio.setNome("Fabio Kochem");
        conta2.setTitular(fabio);

        System.out.println(conta2.getTitular().getNome());
        System.out.println(Conta.getTotal());
    }
}
