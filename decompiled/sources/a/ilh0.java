package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ilh0 implements llh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1o f14979a;

    public ilh0(z1o z1oVar) {
        this.f14979a = z1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilh0) && this.f14979a == ((ilh0) obj).f14979a;
    }

    public final int hashCode() {
        return this.f14979a.hashCode();
    }

    public final String toString() {
        return "Error(errorType=" + this.f14979a + Separators.RPAREN;
    }
}
