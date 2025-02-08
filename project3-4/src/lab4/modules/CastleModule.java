package lab4.modules;

import com.google.inject.AbstractModule;
import lab4.models.places.CastleGate;

/**
 * Module for castle-related bindings.
 */
public class CastleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).toInstance(CastleGate.DEFAULT_NAME);
    }
}