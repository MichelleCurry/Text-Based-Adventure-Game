package objectAdventure.item.itemImpl;
import objectAdventure.common.Observable;
import objectAdventure.common.Observer;
import objectAdventure.item.*;
import java.util.List;

import java.util.*;

/**
 * A sample item for demonstration purposes.
 *
 * @author Michelle Curry, COSC436/COSC716
 */
public class lantern_mlc implements Item, Observable<String> {

    private String description;
    private final String displayName;
    LightState currentLightState;
    HoldState currentHoldState;

    List<Observer<String>> observers = new LinkedList<>();

    /**
     * Constructor
     */
    public lantern_mlc() {
        this.displayName = "lantern";
        this.description = "The lantern is quite dusty but still has fuel.";
        this.observers = new LinkedList<>();
        this.currentLightState = new OffState();
        this.currentHoldState = new DroppedState();
    }

    @Override
    public String getItemFullDescription() {
        return this.description;
    }

    @Override
    public String getItemDisplayName() {
        return this.displayName;
    }

    @Override
    public List<String> getItemAliases() {
        return List.of("lantern", "light");
    }

    @Override
    public void addObserver(Observer<String> theObserver) {
        this.observers.add(theObserver);
    }

    @Override
    public void removeObserver(Observer<String> theObserver) {
       this.observers.remove(theObserver);
    }

    @Override
    public void notifyObservers(String notificationObject) {
        for(var observer: this.observers){
            observer.update(notificationObject);
        }
    }

    public interface LightState {

        void TurnOn();


        void TurnOff();


        void Inspect();
    }

    public interface HoldState {

        void Take();

        void Drop();
    }

    public class OnState implements LightState {

        @Override
        public void TurnOn() {
            System.out.println("""
                The light is already on
                """);
        }

        @Override
        public void TurnOff() {
            System.out.println("""
                                You you turn the light off its very dark
                                """);
            currentLightState = new OffState();
            notifyObservers("Light turned off");
        }

        @Override
        public void Inspect() {
           System.out.println("""
                                The lantern is quite bright
                                """);
        }
    }

    public class OffState implements LightState {

        @Override
        public void TurnOff() {
            System.out.println("""
                                The lantern is already on.
                                """);
        }

        @Override
        public void TurnOn() {
            System.out.println("""
                                You you turn the lantern off. Its very dark.
                                """);
            currentLightState = new OnState();
            notifyObservers("Light turned on");
        }

        @Override
        public void Inspect() {
            System.out.println("""
                                The lantern is off
                                """);
        }
    }

    public class HeldState implements HoldState {


        @Override
        public void Take() {
            System.out.println("""
                                You are already holding the lantern.
                                """);
        }

        @Override
        public void Drop() {
            System.out.println("""
                                You let go of the lantern.
                                """);
            currentHoldState = new DroppedState();
            notifyObservers("Lantern dropped");
        }
    }


    public class DroppedState implements HoldState {

        @Override
        public void Take() {
            System.out.println("""
                                You you remove the lantern from the ceiling.
                                """);
            currentHoldState = new HeldState();
            notifyObservers("Lantern taken");
        }

        @Override
        public void Drop() {
            System.out.println("""
                                You put the lantern back.
                                """);
        }
    }


    /**
     * Item Interaction Example
     *
     * @see objectAdventure.item.ItemInteractionEvent
     **/
    @Override
    public InteractionResult itemInteractionHandler(ItemInteractionEvent ie) {
        return switch (ie) {
            case TAKE:
                this.currentHoldState.Take();
            case ACTIVATE:
                this.currentLightState.TurnOn();
            case DEACTIVATE:
                this.currentLightState.TurnOff();
            case INSPECT:
                this.currentLightState.Inspect();
            case DROP:
                this.currentHoldState.Drop();
            default:
                // Interactions not handled by this item should be handled by the game core.
                yield InteractionResult.success("The lantern does not respond to that action.");
        };
    }
}
