package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14030a;
    public final long b;
    public final String c;
    public final boolean d;

    public i230(boolean z, String str, long j, long j2) {
        this.f14030a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i230)) {
            return false;
        }
        i230 i230Var = (i230) obj;
        return this.f14030a == i230Var.f14030a && this.b == i230Var.b && this.c.equals(i230Var.c) && this.d == i230Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(rw2.b(Long.hashCode(this.f14030a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f14030a, "OnPinMarketClick(subGameId=", ", marketGroupId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        return f140.n(sbQ, ", isPinned=", this.d, Separators.RPAREN);
    }
}
