package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw80 f12210a;
    public final m7m0 b;
    public final long c;
    public final int d;
    public final String e;

    public h01(int i, long j, nw80 nw80Var, m7m0 m7m0Var, String str) {
        str.getClass();
        this.f12210a = nw80Var;
        this.b = m7m0Var;
        this.c = j;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h01)) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return this.f12210a == h01Var.f12210a && this.b == h01Var.b && this.c == h01Var.c && this.d == h01Var.d && Intrinsics.d(this.e, h01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, rw2.b((this.b.hashCode() + (this.f12210a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnFirstButtonClick(partitionType=");
        sb.append(this.f12210a);
        sb.append(", stateBonus=");
        sb.append(this.b);
        sb.append(", giftId=");
        ua80.v(sb, this.c, ", gameId=", this.d);
        return rw2.o(sb, ", gameName=", this.e, Separators.RPAREN);
    }
}
