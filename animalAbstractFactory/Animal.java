package mysample.animalAbstractFactory;

import java.util.Vector;

/*
 * Animal
 * @param
 */
abstract class Animal {    
     // hash map 으로 구현해도 괜찮을 듯 : "action이 많아지는 경우" 또는 "중복 고려"
    private Vector<Action> actions = new Vector<Action>();

    protected void setAction(Action action) {
        actions.add(action);
    }

    public void action(String type) {
        for (Action action : actions) {
            if(action.checkType(type))
            {
                action.action();
                return; 
            }                
        }
        System.out.println("err : invalid type action");
    }
}