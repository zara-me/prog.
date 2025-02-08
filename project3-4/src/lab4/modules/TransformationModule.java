package lab4.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module for transformation settings (e.g., brothers turning into swans).
 */
public class TransformationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class)
                .annotatedWith(Names.named("Transformation"))
                .toInstance("дикие лебеди");
    }
}