package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw80 f37319a;
    public final m7m0 b;
    public final int c;
    public final String d;
    public final long e;

    public vf8(int i, long j, nw80 nw80Var, m7m0 m7m0Var, String str) {
        str.getClass();
        this.f37319a = nw80Var;
        this.b = m7m0Var;
        this.c = i;
        this.d = str;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf8)) {
            return false;
        }
        vf8 vf8Var = (vf8) obj;
        return this.f37319a == vf8Var.f37319a && this.b == vf8Var.b && this.c == vf8Var.c && Intrinsics.d(this.d, vf8Var.d) && this.e == vf8Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ua80.b(twn.a(this.c, (this.b.hashCode() + (this.f37319a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusParamsUiModel(partitionType=");
        sb.append(this.f37319a);
        sb.append(", stateBonus=");
        sb.append(this.b);
        sb.append(", gameId=");
        kng0.w(this.c, ", gameName=", this.d, ", giftId=", sb);
        return brm0.k(this.e, Separators.RPAREN, sb);
    }
}
