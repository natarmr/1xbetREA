package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class cse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4883a;

    public final boolean equals(Object obj) {
        if (obj instanceof cse) {
            return this.f4883a.equals(((cse) obj).f4883a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4883a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketDescriptionText(value=", this.f4883a, Separators.RPAREN);
    }
}
