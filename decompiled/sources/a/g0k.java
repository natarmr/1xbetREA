package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f10463a;
    public final long b;
    public final sys0 c;

    public g0k(n3w n3wVar, long j, sys0 sys0Var) {
        this.f10463a = n3wVar;
        this.b = j;
        this.c = sys0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0k)) {
            return false;
        }
        g0k g0kVar = (g0k) obj;
        return this.f10463a.equals(g0kVar.f10463a) && this.b == g0kVar.b && this.c == g0kVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f10463a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "OnHistoryItemClickOld(historyItemModel=" + this.f10463a + ", balanceId=" + this.b + ", typeHistoryScreen=" + this.c + Separators.RPAREN;
    }
}
