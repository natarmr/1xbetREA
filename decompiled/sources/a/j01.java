package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j01 implements b11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw80 f15661a;
    public final m7m0 b;
    public final int c;
    public final String d;

    public j01(nw80 nw80Var, m7m0 m7m0Var, int i, String str) {
        str.getClass();
        this.f15661a = nw80Var;
        this.b = m7m0Var;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j01)) {
            return false;
        }
        j01 j01Var = (j01) obj;
        return this.f15661a == j01Var.f15661a && this.b == j01Var.b && this.c == j01Var.c && Intrinsics.d(this.d, j01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f15661a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnProvidersClick(partitionType=");
        sb.append(this.f15661a);
        sb.append(", stateBonus=");
        sb.append(this.b);
        sb.append(", gameId=");
        return rw2.k(this.c, ", gameName=", this.d, Separators.RPAREN, sb);
    }
}
