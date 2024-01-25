package mysample.animalAbstractFactory;

/*
 * Action
 * @param 
 * type : "speak", "attack", ""
 */
abstract class Action {
    String type;
    abstract public void action();
    public boolean checkType(String type){
        if(this.type.equals(type))
            return true;
        return false;
    }
}