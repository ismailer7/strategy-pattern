class OrcKiller {

    OrcKillerStrategy hobbitStrategy;

    public OrcKiller(OrcKillerStrategy hobbitStrategy) {
        this.hobbitStrategy = hobbitStrategy;
    }

    public void changeStrategy(OrcKillerStrategy hobbitNewStrategy) {
        this.hobbitStrategy = hobbitNewStrategy;
    }

    public void killTheOrc() {
        this.hobbitStrategy.execute();
    }



}