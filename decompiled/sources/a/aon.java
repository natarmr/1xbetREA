package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aon implements gon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgl0 f1210a;

    public final boolean equals(Object obj) {
        if (obj instanceof aon) {
            return this.f1210a.equals(((aon) obj).f1210a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1210a.hashCode();
    }

    public final String toString() {
        return "OnMarketClick(sportMarketClickType=" + this.f1210a + Separators.RPAREN;
    }
}
