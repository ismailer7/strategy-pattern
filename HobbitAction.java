public class HobbitAction {

    OrcKillerStrategy hobbitStrategy;

    public HobbitAction(OrcKillerStrategy hobbitStrategy) {
        this.hobbitStrategy = hobbitStrategy;
    }

    public void changeStrategy(OrcKillerStrategy hobbitNewStrategy) {
        this.hobbitStrategy = hobbitNewStrategy;
    }

    public void hobbitFacesOrcMaster() {
        System.out.println("Hobbit thinking for a strategy and he find out one that he will use against the Evil Orc.");
        this.hobbitStrategy.execute();
    }


}
