package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zgv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44362a;

    public final boolean equals(Object obj) {
        if (obj instanceof zgv0) {
            return this.f44362a.equals(((zgv0) obj).f44362a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44362a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapName(value=", this.f44362a, Separators.RPAREN);
    }
}
