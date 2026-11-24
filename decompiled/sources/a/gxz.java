package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class gxz implements mxz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrz f12101a;

    public final boolean equals(Object obj) {
        if (obj instanceof gxz) {
            return this.f12101a.equals(((gxz) obj).f12101a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12101a.hashCode();
    }

    public final String toString() {
        return "OnMoneyLimitClick(limitType=" + this.f12101a + Separators.RPAREN;
    }
}
