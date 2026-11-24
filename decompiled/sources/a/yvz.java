package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class yvz implements cwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f43344a;

    public final boolean equals(Object obj) {
        if (obj instanceof yvz) {
            return this.f43344a.equals(((yvz) obj).f43344a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43344a.hashCode();
    }

    public final String toString() {
        return "OnLimitClick(limitType=" + this.f43344a + Separators.RPAREN;
    }
}
