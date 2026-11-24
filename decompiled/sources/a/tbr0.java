package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f33680a;
    public final hdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final jjy g;

    public tbr0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, jjy jjyVar) {
        this.f33680a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = jjyVar;
    }

    public static tbr0 a(tbr0 tbr0Var, eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, jjy jjyVar, int i) {
        if ((i & 1) != 0) {
            emeVar = tbr0Var.f33680a;
        }
        eme emeVar2 = emeVar;
        if ((i & 2) != 0) {
            hdm0Var = tbr0Var.b;
        }
        hdm0 hdm0Var2 = hdm0Var;
        if ((i & 4) != 0) {
            nc5Var = tbr0Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 8) != 0) {
            z = tbr0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = tbr0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = tbr0Var.f;
        }
        boolean z6 = z3;
        if ((i & 64) != 0) {
            jjyVar = tbr0Var.g;
        }
        tbr0Var.getClass();
        hdm0Var2.getClass();
        return new tbr0(emeVar2, hdm0Var2, nc5Var2, z4, z5, z6, jjyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbr0)) {
            return false;
        }
        tbr0 tbr0Var = (tbr0) obj;
        return this.f33680a == tbr0Var.f33680a && this.b.equals(tbr0Var.b) && this.c.equals(tbr0Var.c) && this.d == tbr0Var.d && this.e == tbr0Var.e && this.f == tbr0Var.f && Intrinsics.d(this.g, tbr0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f33680a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        jjy jjyVar = this.g;
        return iE + (jjyVar == null ? 0 : jjyVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayersStatisticKabaddiState(coreHeaderModel=");
        sb.append(this.f33680a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", isError=");
        ua80.u(", isLive=", ", kabaddiTopPlayersModel=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
