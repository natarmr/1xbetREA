package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14239a;
    public final long b;
    public final boolean c;

    public i6h(long j, boolean z, long j2) {
        this.f14239a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6h)) {
            return false;
        }
        i6h i6hVar = (i6h) obj;
        return this.f14239a == i6hVar.f14239a && this.b == i6hVar.b && this.c == i6hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f14239a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14239a, "OnExpandMarketClick(subGameId=", ", marketGroupId=");
        hne.t(this.b, ", isExpanded=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
