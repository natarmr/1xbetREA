package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f1768a;
    public final long b;
    public final boolean c;

    public b0k(n3w n3wVar, long j, boolean z) {
        this.f1768a = n3wVar;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0k)) {
            return false;
        }
        b0k b0kVar = (b0k) obj;
        return this.f1768a.equals(b0kVar.f1768a) && this.b == b0kVar.b && this.c == b0kVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f1768a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnAutoSaleClickedOld(historyItemModel=");
        sb.append(this.f1768a);
        sb.append(", balanceId=");
        sb.append(this.b);
        return f140.n(sb, ", updateHistoryOnExit=", this.c, Separators.RPAREN);
    }
}
