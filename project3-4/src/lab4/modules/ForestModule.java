package lab4.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module for forest-related bindings.
 */
public class ForestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class)
                .annotatedWith(Names.named("Forest"))
                .toInstance("Лесной пол");
    }
}