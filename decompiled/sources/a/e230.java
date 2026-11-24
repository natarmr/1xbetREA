package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7066a;
    public final long b;
    public final boolean c;

    public e230(long j, boolean z, long j2) {
        this.f7066a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e230)) {
            return false;
        }
        e230 e230Var = (e230) obj;
        return this.f7066a == e230Var.f7066a && this.b == e230Var.b && this.c == e230Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f7066a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f7066a, "OnExpandMarketClick(subGameId=", ", marketGroupId=");
        hne.t(this.b, ", isExpanded=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
