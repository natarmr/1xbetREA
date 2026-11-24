package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eme f11077a;
    public final hdm0 b;
    public final nc5 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final rar0 h;

    public gcr0(eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, rar0 rar0Var) {
        this.f11077a = emeVar;
        this.b = hdm0Var;
        this.c = nc5Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = rar0Var;
    }

    public static gcr0 a(gcr0 gcr0Var, eme emeVar, hdm0 hdm0Var, nc5 nc5Var, boolean z, boolean z2, boolean z3, boolean z4, rar0 rar0Var, int i) {
        if ((i & 1) != 0) {
            emeVar = gcr0Var.f11077a;
        }
        eme emeVar2 = emeVar;
        if ((i & 2) != 0) {
            hdm0Var = gcr0Var.b;
        }
        hdm0 hdm0Var2 = hdm0Var;
        if ((i & 4) != 0) {
            nc5Var = gcr0Var.c;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i & 8) != 0) {
            z = gcr0Var.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = gcr0Var.e;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = gcr0Var.f;
        }
        boolean z7 = z3;
        boolean z8 = (i & 64) != 0 ? gcr0Var.g : z4;
        rar0 rar0Var2 = (i & 128) != 0 ? gcr0Var.h : rar0Var;
        gcr0Var.getClass();
        hdm0Var2.getClass();
        return new gcr0(emeVar2, hdm0Var2, nc5Var2, z5, z6, z7, z8, rar0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcr0)) {
            return false;
        }
        gcr0 gcr0Var = (gcr0) obj;
        return this.f11077a == gcr0Var.f11077a && this.b.equals(gcr0Var.b) && this.c.equals(gcr0Var.c) && this.d == gcr0Var.d && this.e == gcr0Var.e && this.f == gcr0Var.f && this.g == gcr0Var.g && Intrinsics.d(this.h, gcr0Var.h);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f11077a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        rar0 rar0Var = this.h;
        return iE + (rar0Var == null ? 0 : rar0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayersStatisticState(coreHeaderModel=");
        sb.append(this.f11077a);
        sb.append(", statisticHeaderModel=");
        sb.append(this.b);
        sb.append(", backgroundHeaderModel=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", isError=");
        ua80.u(", isEmpty=", ", isLive=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", topPlayersModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
