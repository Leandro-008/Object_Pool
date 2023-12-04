public class TestaFuncionarioPool {
    public static void main(String[] args) { //Classe para testar o pool
    Pool < Funcionario > funcionarioPool = new FuncionarioPool();
    Funcionario funcionario = funcionarioPool.acquire(); // Vai atribuir a variavel funcionário o primeiro 
    // objeto funcionário do pool
    while(funcionario != null) {// Vai realzar um loop até o pool ficar vazio
        System.out.println( funcionario.getNome()); //Vai mostrar o nome do funcionário atual
        funcionario = funcionarioPool.acquire(); //Vai srvir pra atualizar o objeto funcionário que está sendo utilizado
        //retirando ele do poll fazendo com que eventualmente o loop acabe
        }
    }
}