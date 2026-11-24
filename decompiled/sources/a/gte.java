package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class gte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11876a;

    public final boolean equals(Object obj) {
        if (obj instanceof gte) {
            return this.f11876a.equals(((gte) obj).f11876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11876a.hashCode();
    }

    public final String toString() {
        return kng0.l("EachWayText(value=", this.f11876a, Separators.RPAREN);
    }
}
