package vn.edu.iuh.fit.dhktpm17a.observerdesignpattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);

}
