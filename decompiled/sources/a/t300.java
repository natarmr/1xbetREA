package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t300 implements x300 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f33243a;

    public final boolean equals(Object obj) {
        if (obj instanceof t300) {
            return this.f33243a.equals(((t300) obj).f33243a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33243a.hashCode();
    }

    public final String toString() {
        return "OnLimitClick(limitType=" + this.f33243a + Separators.RPAREN;
    }
}
