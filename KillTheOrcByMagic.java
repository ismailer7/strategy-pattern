public class KillTheOrcByMagic implements OrcKillerStrategy {
    // because orc are vunerable to magic we can kill them using it.
    @Override
    public void execute() {
        System.out.println("kill the orc by abra kadabra launch a magic shot.");
    }
}