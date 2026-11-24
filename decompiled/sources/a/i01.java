package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw80 f13929a;
    public final m7m0 b;
    public final int c;
    public final String d;

    public i01(nw80 nw80Var, m7m0 m7m0Var, int i, String str) {
        str.getClass();
        this.f13929a = nw80Var;
        this.b = m7m0Var;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i01)) {
            return false;
        }
        i01 i01Var = (i01) obj;
        return this.f13929a == i01Var.f13929a && this.b == i01Var.b && this.c == i01Var.c && Intrinsics.d(this.d, i01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f13929a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnGamesClick(partitionType=");
        sb.append(this.f13929a);
        sb.append(", stateBonus=");
        sb.append(this.b);
        sb.append(", gameId=");
        return rw2.k(this.c, ", gameName=", this.d, Separators.RPAREN, sb);
    }
}
