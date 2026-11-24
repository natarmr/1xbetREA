package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s7p implements t7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xte f31760a;

    public s7p(xte xteVar) {
        xteVar.getClass();
        this.f31760a = xteVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7p) && this.f31760a == ((s7p) obj).f31760a;
    }

    public final int hashCode() {
        return this.f31760a.hashCode();
    }

    public final String toString() {
        return "Shimmer(couponCardStyleType=" + this.f31760a + Separators.RPAREN;
    }
}
