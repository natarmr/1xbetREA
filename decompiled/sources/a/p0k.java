package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f26155a;
    public final long b;

    public p0k(n3w n3wVar, long j) {
        this.f26155a = n3wVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0k)) {
            return false;
        }
        p0k p0kVar = (p0k) obj;
        return this.f26155a.equals(p0kVar.f26155a) && this.b == p0kVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f26155a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSaleClickedOld(historyItemModel=" + this.f26155a + ", balanceId=" + this.b + Separators.RPAREN;
    }
}
