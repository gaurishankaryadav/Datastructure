package SingleDimensionArray;
public class MainClass {
    public static void main(String[] args) {
        SingleDimensionArray sde = new SingleDimensionArray(1);
        sde.insertion(0, 34);
        sde.insertion(1, 24);
        sde.insertion(2, 44);
        sde.traversal();
        sde.searching(24);
        sde.deletion(1);
        sde.traversal();
    }
}
