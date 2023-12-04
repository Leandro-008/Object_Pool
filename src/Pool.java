// Interface que vai para padronizar as outras classe e conter alguns métodos pro object pool
public interface Pool <T> { 
    T acquire (); //Serve para adquirir novos objetos
    void release (T t); //Devolver os objetos para o pool
}
