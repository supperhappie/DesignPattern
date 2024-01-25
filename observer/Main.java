package mysample.observer;
public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();
        Manager manager = new ConcreteManager();        
        Employee ace = new ConcreteEmployee("Ace");
        Employee loopie = new ConcreteEmployee("Loopie");
        Employee buggie = new ConcreteEmployee("Buggie");

        boss.setManager(manager);

        manager.printMemberNum();
        manager.setEmployee(ace);
        manager.setEmployee(loopie);
        manager.setEmployee(buggie);
        manager.printMemberNum();

        manager.plusPoint(ace, 55);
        manager.plusPoint(loopie, 10);
        manager.minusPoint(buggie, 20);

        boss.getPromoteMembers();
        boss.getFireMembers();
        
        manager.printMemberNum();

        ace.printStatus();
        loopie.printStatus();
        buggie.printStatus();
    }
}
