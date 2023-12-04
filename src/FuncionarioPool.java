import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool < Funcionario > { //Vai implementar os métodos da classe pool
    private List< Funcionario > funcionarios; //Vamos precisar de uma lista dos objetos que serão uilizados

    public FuncionarioPool () { //Criando um construtor pra inserir os funcionários na lista
        this.funcionarios = new ArrayList< Funcionario >();
        this.funcionarios .add(new Funcionario ("Leandro Lemes")); 
        this.funcionarios .add(new Funcionario ("Yuri Eduardo")); 
        this. funcionarios .add(new Funcionario ("Felipe"));
    }

    public Funcionario acquire () { //Método para adquirir os funcionários do pool
        if(this.funcionarios.size () > 0) { //Se tiver algum funcionario no pool
        return this.funcionarios.remove(0); //Retorna o funcionário e remove ele do pool
    }else { //O pool está vazio
        return null;
        } 
    }
    
    public void release (Funcionario funcionario ) { //Método para devolver o funcionário devolta para o pool
        this.funcionarios.add( funcionario );
    }
}