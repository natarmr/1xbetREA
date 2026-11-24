package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ukf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35824a;

    public final boolean equals(Object obj) {
        if (obj instanceof ukf) {
            return this.f35824a.equals(((ukf) obj).f35824a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35824a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapBackground(value=", this.f35824a, Separators.RPAREN);
    }
}
