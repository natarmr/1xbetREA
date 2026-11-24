package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw80 f19176a;
    public final m7m0 b;
    public final long c;
    public final int d;
    public final String e;

    public l01(int i, long j, nw80 nw80Var, m7m0 m7m0Var, String str) {
        str.getClass();
        this.f19176a = nw80Var;
        this.b = m7m0Var;
        this.c = j;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l01)) {
            return false;
        }
        l01 l01Var = (l01) obj;
        return this.f19176a == l01Var.f19176a && this.b == l01Var.b && this.c == l01Var.c && this.d == l01Var.d && Intrinsics.d(this.e, l01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, rw2.b((this.b.hashCode() + (this.f19176a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSecondButtonClick(partitionType=");
        sb.append(this.f19176a);
        sb.append(", stateBonus=");
        sb.append(this.b);
        sb.append(", giftId=");
        ua80.v(sb, this.c, ", gameId=", this.d);
        return rw2.o(sb, ", gameName=", this.e, Separators.RPAREN);
    }
}
