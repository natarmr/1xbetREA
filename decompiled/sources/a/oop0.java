package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f25606a;
    public final hdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final i5p0 g;

    public oop0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, i5p0 i5p0Var) {
        this.f25606a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i5p0Var;
    }

    public static oop0 a(oop0 oop0Var, eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, i5p0 i5p0Var, int i) {
        if ((i & 1) != 0) {
            emeVar = oop0Var.f25606a;
        }
        eme emeVar2 = emeVar;
        if ((i & 2) != 0) {
            hdm0Var = oop0Var.b;
        }
        hdm0 hdm0Var2 = hdm0Var;
        if ((i & 4) != 0) {
            nc5Var = oop0Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 8) != 0) {
            z = oop0Var.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = oop0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = oop0Var.f;
        }
        boolean z6 = z3;
        if ((i & 64) != 0) {
            i5p0Var = oop0Var.g;
        }
        oop0Var.getClass();
        hdm0Var2.getClass();
        return new oop0(emeVar2, hdm0Var2, nc5Var2, z4, z5, z6, i5p0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oop0)) {
            return false;
        }
        oop0 oop0Var = (oop0) obj;
        return this.f25606a == oop0Var.f25606a && this.b.equals(oop0Var.b) && this.c.equals(oop0Var.c) && this.d == oop0Var.d && this.e == oop0Var.e && this.f == oop0Var.f && Intrinsics.d(this.g, oop0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f25606a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        i5p0 i5p0Var = this.g;
        return iE + (i5p0Var == null ? 0 : i5p0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamsChampStatisticState(coreHeaderModel=");
        sb.append(this.f25606a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", isError=");
        ua80.u(", isLive=", ", teamsChampStatisticModel=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
