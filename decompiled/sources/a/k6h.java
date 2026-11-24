package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17769a;
    public final long b;
    public final String c;
    public final boolean d;

    public k6h(boolean z, String str, long j, long j2) {
        this.f17769a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6h)) {
            return false;
        }
        k6h k6hVar = (k6h) obj;
        return this.f17769a == k6hVar.f17769a && this.b == k6hVar.b && this.c.equals(k6hVar.c) && this.d == k6hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(rw2.b(Long.hashCode(this.f17769a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f17769a, "OnPinMarketClick(subGameId=", ", marketGroupId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        return f140.n(sbQ, ", isPinned=", this.d, Separators.RPAREN);
    }
}
