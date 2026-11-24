package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rvm0 f26240a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final boolean f;

    public p2a0(rvm0 rvm0Var, boolean z, boolean z2, List list, List list2, boolean z3) {
        list.getClass();
        list2.getClass();
        this.f26240a = rvm0Var;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = list2;
        this.f = z3;
    }

    public static p2a0 a(p2a0 p2a0Var, boolean z, List list, List list2, boolean z2, int i) {
        rvm0 rvm0Var = p2a0Var.f26240a;
        if ((i & 2) != 0) {
            z = p2a0Var.b;
        }
        boolean z3 = z;
        boolean z4 = p2a0Var.c;
        if ((i & 8) != 0) {
            list = p2a0Var.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = p2a0Var.e;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            z2 = p2a0Var.f;
        }
        p2a0Var.getClass();
        list3.getClass();
        list4.getClass();
        return new p2a0(rvm0Var, z3, z4, list3, list4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2a0)) {
            return false;
        }
        p2a0 p2a0Var = (p2a0) obj;
        return this.f26240a.equals(p2a0Var.f26240a) && this.b == p2a0Var.b && this.c == p2a0Var.c && Intrinsics.d(this.d, p2a0Var.d) && Intrinsics.d(this.e, p2a0Var.e) && this.f == p2a0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dw9.a(dw9.a(brm0.e(brm0.e(this.f26240a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerDuelState(currentSubGame=");
        sb.append(this.f26240a);
        sb.append(", quickBetEnabled=");
        sb.append(this.b);
        sb.append(", quickBetAvailable=");
        vqd.y(sb, ", firstTeam=", this.d, ", secondTeam=", this.c);
        sb.append(this.e);
        sb.append(", isError=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
