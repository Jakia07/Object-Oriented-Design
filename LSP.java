

package Solid_Principle;

/**
 * Base class for all birds.
 */
public abstract class Bird {
    /**
     * Make the bird sound.
     */
    public abstract void makeSound();
}

/**
 * Abstract class for birds that can fly.
 */
public abstract class FlyingBird extends Bird {
    /**
     * Enable the flying bird to fly.
     */
    public void fly() {
        System.out.println("This bird flies!");
    }
}

/**
 * Class for birds that cannot fly.
 */
public abstract class NonFlyingBird extends Bird {
    // Non-flying birds may have other specific behaviors here
}

public class Sparrow extends FlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }
}

public class Ostrich extends NonFlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Boom boom!");
    }
}

