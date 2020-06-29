import databases.ClientBase;

public interface Sale {
    void sale(ClientBase clientBase, int number) throws Exception;
}
