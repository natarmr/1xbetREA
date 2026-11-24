package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fn00 implements pn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f9811a;

    public fn00(Throwable th) {
        this.f9811a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn00) && this.f9811a.equals(((fn00) obj).f9811a);
    }

    public final int hashCode() {
        return this.f9811a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f9811a);
    }
}
