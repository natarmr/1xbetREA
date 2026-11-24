package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ly6 f2138a;
    public final fo7 b;
    public final an5 c;
    public final rvj0 d;
    public final czc0 e;
    public final gx4 f;
    public final wtb0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ua20 m;

    public b820(ly6 ly6Var, fo7 fo7Var, an5 an5Var, rvj0 rvj0Var, czc0 czc0Var, gx4 gx4Var, wtb0 wtb0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ua20 ua20Var) {
        this.f2138a = ly6Var;
        this.b = fo7Var;
        this.c = an5Var;
        this.d = rvj0Var;
        this.e = czc0Var;
        this.f = gx4Var;
        this.g = wtb0Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = ua20Var;
    }

    public static b820 a(b820 b820Var, ly6 ly6Var, fo7 fo7Var, an5 an5Var, rvj0 rvj0Var, czc0 czc0Var, gx4 gx4Var, wtb0 wtb0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            ly6Var = b820Var.f2138a;
        }
        ly6 ly6Var2 = ly6Var;
        fo7 fo7Var2 = (i & 2) != 0 ? b820Var.b : fo7Var;
        an5 an5Var2 = (i & 4) != 0 ? b820Var.c : an5Var;
        rvj0 rvj0Var2 = (i & 8) != 0 ? b820Var.d : rvj0Var;
        czc0 czc0Var2 = (i & 16) != 0 ? b820Var.e : czc0Var;
        gx4 gx4Var2 = (i & 32) != 0 ? b820Var.f : gx4Var;
        wtb0 wtb0Var2 = (i & 64) != 0 ? b820Var.g : wtb0Var;
        boolean z6 = (i & 128) != 0 ? b820Var.h : z;
        boolean z7 = (i & 256) != 0 ? b820Var.i : z2;
        boolean z8 = (i & 512) != 0 ? b820Var.j : z3;
        boolean z9 = (i & 1024) != 0 ? b820Var.k : z4;
        boolean z10 = (i & 2048) != 0 ? b820Var.l : z5;
        ua20 ua20Var = b820Var.m;
        b820Var.getClass();
        return new b820(ly6Var2, fo7Var2, an5Var2, rvj0Var2, czc0Var2, gx4Var2, wtb0Var2, z6, z7, z8, z9, z10, ua20Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b820)) {
            return false;
        }
        b820 b820Var = (b820) obj;
        return this.f2138a.equals(b820Var.f2138a) && this.b.equals(b820Var.b) && this.c.equals(b820Var.c) && this.d.equals(b820Var.d) && Intrinsics.d(this.e, b820Var.e) && Intrinsics.d(this.f, b820Var.f) && Intrinsics.d(this.g, b820Var.g) && this.h == b820Var.h && this.i == b820Var.i && this.j == b820Var.j && this.k == b820Var.k && this.l == b820Var.l && this.m == b820Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f2138a.hashCode() * 31)) * 31)) * 31)) * 31;
        czc0 czc0Var = this.e;
        int iHashCode2 = (iHashCode + (czc0Var == null ? 0 : czc0Var.hashCode())) * 31;
        gx4 gx4Var = this.f;
        int iHashCode3 = (iHashCode2 + (gx4Var == null ? 0 : gx4Var.hashCode())) * 31;
        wtb0 wtb0Var = this.g;
        return this.m.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode3 + (wtb0Var != null ? wtb0Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetContentState(betGameInfo=");
        sb.append(this.f2138a);
        sb.append(", betTypeStateModel=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", simpleBetState=");
        sb.append(this.d);
        sb.append(", promocodeState=");
        sb.append(this.e);
        sb.append(", autoBetState=");
        sb.append(this.f);
        sb.append(", prepareMakeBetStateModel=");
        sb.append(this.g);
        sb.append(", isAuthorized=");
        sb.append(this.h);
        sb.append(", isSetDefaultBetSumEnabled=");
        ua80.u(", isTaxStatusInitialized=", ", isTaxLoaded=", sb, this.i, this.j);
        ua80.u(", forceLoading=", ", styleType=", sb, this.k, this.l);
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
