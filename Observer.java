import java.util.ArrayList;

// subscribers interface
interface Subscriber {
    void update(String item);
}

// Concrete subscriber class (user)
class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String item) {
        System.out.println("Aviso para " + name + ": " + item + " está de volta em estoque!");
    }
}

// Subject interface
interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String item);
}

// Concrete subject class (stock)
class Stock implements Publisher {
    private ArrayList<Subscriber> subscribers;

    public Stock() {
        subscribers = new ArrayList<Subscriber>();
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String item) {
        for (Subscriber subscriber: subscribers) {
            subscriber.update(item);
        }
    }
}