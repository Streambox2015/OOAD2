package ooadStreamboxIteration3;

/**
 * Created by Colin on 12/12/2015.
 */
public class AccountType {
    private boolean fullAccessToAllFeatures;
    private boolean restrictedAccessToAllFeatures;
    private boolean partialAccessToAllFeatures;

    public boolean getFullAccessToAllFeatures() {
        return fullAccessToAllFeatures;
    }

    public void setFullAccessToAllFeatures(boolean fullAccessToAllFeatures) {
        this.fullAccessToAllFeatures = fullAccessToAllFeatures;
    }

    public boolean getRestrictedAccessToAllFeatures() {
        return restrictedAccessToAllFeatures;
    }

    public void setRestrictedAccessToAllFeatures(boolean restrictedAccessToAllFeatures) {
        this.restrictedAccessToAllFeatures = restrictedAccessToAllFeatures;
    }

    public boolean getPartialAccessToAllFeatures() {
        return partialAccessToAllFeatures;
    }

    public void setPartialAccessToAllFeatures(boolean partialAccessToAllFeatures) {
        this.partialAccessToAllFeatures = partialAccessToAllFeatures;
    }

    public AccountType(boolean fullAccessToAllFeatures, boolean restrictedAccessToAllFeatures, boolean partialAccessToAllFeatures) {
        this.fullAccessToAllFeatures = fullAccessToAllFeatures;
        this.restrictedAccessToAllFeatures = restrictedAccessToAllFeatures;

        this.partialAccessToAllFeatures = partialAccessToAllFeatures;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "fullAccessToAllFeatures='" + fullAccessToAllFeatures + '\'' +
                ", restrictedAccessToAllFeatures='" + restrictedAccessToAllFeatures + '\'' +
                ", partialAccessToAllFeatures='" + partialAccessToAllFeatures + '\'' +
                '}';
    }
}
