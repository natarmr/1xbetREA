package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yd5 implements be5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42416a;

    public final boolean equals(Object obj) {
        if (obj instanceof yd5) {
            return this.f42416a.equals(((yd5) obj).f42416a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42416a.hashCode();
    }

    public final String toString() {
        return kng0.l("Large(urn=", this.f42416a, Separators.RPAREN);
    }
}
