interface Playable {
    void play();
}

// Football class implementing Playable interface
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball and scoring goals!");
    }
}

// Volleyball class implementing Playable interface
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball: Bumping, setting, and spiking the ball!");
    }
}

// Basketball class implementing Playable interface
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling, shooting, and scoring points!");
    }
}

// Main class to test the implementation
public class Question25 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
