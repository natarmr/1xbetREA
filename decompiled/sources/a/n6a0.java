package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n6a0 implements q6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22987a;
    public final String b;
    public final boolean c;

    public n6a0(String str, long j, boolean z) {
        this.f22987a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a0)) {
            return false;
        }
        n6a0 n6a0Var = (n6a0) obj;
        return this.f22987a == n6a0Var.f22987a && this.b.equals(n6a0Var.b) && this.c == n6a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f22987a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f22987a, "OnPinClick(marketGroupId=", ", title=", this.b), ", pinned=", this.c, Separators.RPAREN);
    }
}
