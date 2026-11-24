package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class udh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35478a;

    public final boolean equals(Object obj) {
        if (obj instanceof udh0) {
            return Float.compare(this.f35478a, ((udh0) obj).f35478a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35478a);
    }

    public final String toString() {
        return rw2.j(this.f35478a, "PlayerOneFieldOpacity(value=", Separators.RPAREN);
    }
}
