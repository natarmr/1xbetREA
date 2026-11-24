package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t5j implements v5j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sba0 f33371a;
    public final long b;
    public final int c;

    public t5j(sba0 sba0Var, long j, int i) {
        this.f33371a = sba0Var;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5j)) {
            return false;
        }
        t5j t5jVar = (t5j) obj;
        return this.f33371a == t5jVar.f33371a && this.b == t5jVar.b && this.c == t5jVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(this.f33371a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowInfoDialog(playerTaskKind=");
        sb.append(this.f33371a);
        sb.append(", productId=");
        sb.append(this.b);
        return vqd.p(sb, ", progress=", this.c, Separators.RPAREN);
    }
}
