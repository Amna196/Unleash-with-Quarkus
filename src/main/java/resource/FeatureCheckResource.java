package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import service.FeatureToggleService;

/**
 * @author Amna Hatem
 */
@Path("/feature-check")
public class FeatureCheckResource {

    @Inject
    FeatureToggleService featureToggleService;

    @GET
    public String checkFeature() {
        if (featureToggleService.isNewFeatureEnabled()) {
            return "New feature is enabled!";
        } else {
            return "New feature is disabled.";
        }
    }
}
