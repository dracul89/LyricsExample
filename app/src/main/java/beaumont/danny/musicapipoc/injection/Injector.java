package beaumont.danny.musicapipoc.injection;

import beaumont.danny.musicapipoc.injection.interfaces.DaggerInjectionComponent;
import beaumont.danny.musicapipoc.injection.interfaces.InjectionComponent;
import beaumont.danny.musicapipoc.injection.modules.NetworkModule;

/**
 * Created by dracul89 on 9/9/17.
 */

public class Injector {

    private static InjectionComponent component;

    private Injector() {
    }
    public static InjectionComponent getComponent() {
        if (component == null) {
            component = DaggerInjectionComponent.builder()
                    .networkModule(new NetworkModule())
                    .build();
        }
        return component;
    }

}
