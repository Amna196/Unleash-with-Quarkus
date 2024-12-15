package service;

/**
 * @author Amna Hatem
 */
import io.getunleash.Unleash;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FeatureToggleService {

    @Inject
    Unleash unleash;

    public boolean isNewFeatureEnabled() {
        return unleash.isEnabled("NEW_CHECKOUT");
    }
}
