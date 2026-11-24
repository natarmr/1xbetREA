package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mb2 implements tb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jtl f21485a;

    public final boolean equals(Object obj) {
        if (obj instanceof mb2) {
            return this.f21485a.equals(((mb2) obj).f21485a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21485a.hashCode();
    }

    public final String toString() {
        return "OnBottomBarClick(values=" + this.f21485a + Separators.RPAREN;
    }
}
