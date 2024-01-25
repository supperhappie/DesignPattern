package mysample.observer;

public interface Subject {
    public void registerObjserver(Observer o);
    public void removeObjserver(Observer o);
    public void notifyObjservers();
}
