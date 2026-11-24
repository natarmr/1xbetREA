package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i3i0 implements l3i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f14098a;

    public i3i0(ygq0 ygq0Var) {
        this.f14098a = ygq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3i0) && this.f14098a == ((i3i0) obj).f14098a;
    }

    public final int hashCode() {
        return this.f14098a.hashCode();
    }

    public final String toString() {
        return "SetTimeFilterAndExit(timeFilter=" + this.f14098a + Separators.RPAREN;
    }
}
