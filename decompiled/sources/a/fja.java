package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fja implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9629a;
    public final qhj b;
    public final nfa c;

    public fja(long j, qhj qhjVar, nfa nfaVar) {
        this.f9629a = j;
        this.b = qhjVar;
        this.c = nfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fja)) {
            return false;
        }
        fja fjaVar = (fja) obj;
        return this.f9629a == fjaVar.f9629a && this.b.equals(fjaVar.b) && this.c.equals(fjaVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        qhj qhjVar = this.b;
        return qhjVar.r + qhjVar.p + qhjVar.c + qhjVar.C + this.f9629a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f9629a) * 31)) * 31);
    }

    public final String toString() {
        return "CardItemUiItem(couponId=" + this.f9629a + ", item=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
