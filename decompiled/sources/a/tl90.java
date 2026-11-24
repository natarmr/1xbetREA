package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tl90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34132a;

    public final boolean equals(Object obj) {
        if (obj instanceof tl90) {
            return this.f34132a.equals(((tl90) obj).f34132a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34132a.hashCode();
    }

    public final String toString() {
        return kng0.l("Placeholder(value=", this.f34132a, Separators.RPAREN);
    }
}
