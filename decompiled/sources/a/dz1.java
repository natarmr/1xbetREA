package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6918a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ql5 f;
    public final boolean g;
    public final kg h;
    public final myr0 i;
    public final Long j;
    public final boolean k;
    public final bie l;

    public dz1(String str, boolean z, boolean z2, boolean z3, boolean z4, ql5 ql5Var, boolean z5, kg kgVar, myr0 myr0Var, Long l, boolean z6, bie bieVar) {
        str.getClass();
        kgVar.getClass();
        this.f6918a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = ql5Var;
        this.g = z5;
        this.h = kgVar;
        this.i = myr0Var;
        this.j = l;
        this.k = z6;
        this.l = bieVar;
    }

    public static dz1 a(dz1 dz1Var, boolean z, boolean z2, boolean z3, ql5 ql5Var, boolean z4, myr0 myr0Var, Long l, boolean z5, bie bieVar, int i) {
        String str = dz1Var.f6918a;
        boolean z6 = dz1Var.b;
        if ((i & 4) != 0) {
            z = dz1Var.c;
        }
        boolean z7 = z;
        boolean z8 = (i & 8) != 0 ? dz1Var.d : z2;
        boolean z9 = (i & 16) != 0 ? dz1Var.e : z3;
        ql5 ql5Var2 = (i & 32) != 0 ? dz1Var.f : ql5Var;
        boolean z10 = (i & 64) != 0 ? dz1Var.g : z4;
        kg kgVar = dz1Var.h;
        myr0 myr0Var2 = (i & 256) != 0 ? dz1Var.i : myr0Var;
        Long l2 = (i & 512) != 0 ? dz1Var.j : l;
        boolean z11 = (i & 1024) != 0 ? dz1Var.k : z5;
        bie bieVar2 = (i & 2048) != 0 ? dz1Var.l : bieVar;
        dz1Var.getClass();
        str.getClass();
        kgVar.getClass();
        return new dz1(str, z6, z7, z8, z9, ql5Var2, z10, kgVar, myr0Var2, l2, z11, bieVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz1)) {
            return false;
        }
        dz1 dz1Var = (dz1) obj;
        return Intrinsics.d(this.f6918a, dz1Var.f6918a) && this.b == dz1Var.b && this.c == dz1Var.c && this.d == dz1Var.d && this.e == dz1Var.e && Intrinsics.d(this.f, dz1Var.f) && this.g == dz1Var.g && this.h == dz1Var.h && Intrinsics.d(this.i, dz1Var.i) && Intrinsics.d(this.j, dz1Var.j) && this.k == dz1Var.k && this.l.equals(dz1Var.l);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e(this.f6918a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        ql5 ql5Var = this.f;
        int iHashCode = (this.h.hashCode() + brm0.e((iE + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.g)) * 31;
        myr0 myr0Var = this.i;
        int iHashCode2 = (iHashCode + (myr0Var == null ? 0 : myr0Var.hashCode())) * 31;
        Long l = this.j;
        return this.l.hashCode() + brm0.e((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("AggregatorTournamentsState(title=", this.f6918a, ", hasSocial=", this.b, ", showLoader=");
        ua80.u(", tipsShownForCurrentAuth=", ", isAuth=", sbU, this.c, this.d);
        sbU.append(this.e);
        sbU.append(", balance=");
        sbU.append(this.f);
        sbU.append(", lastConnection=");
        sbU.append(this.g);
        sbU.append(", accountSelectionStyle=");
        sbU.append(this.h);
        sbU.append(", enrollingModel=");
        sbU.append(this.i);
        sbU.append(", pendingTournamentId=");
        sbU.append(this.j);
        sbU.append(", doActionAfterLogin=");
        sbU.append(this.k);
        sbU.append(", content=");
        sbU.append(this.l);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
