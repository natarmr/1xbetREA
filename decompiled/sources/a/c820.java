package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c820 {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my6 f3892a;
    public final go7 b;
    public final bn5 c;
    public final svj0 d;
    public final jfc0 e;
    public final xtb0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ua20 l;
    public final jg7 m;

    static {
        jg7 jg7Var = jg7.i;
    }

    public c820(my6 my6Var, go7 go7Var, bn5 bn5Var, svj0 svj0Var, jfc0 jfc0Var, xtb0 xtb0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ua20 ua20Var, jg7 jg7Var) {
        jg7Var.getClass();
        this.f3892a = my6Var;
        this.b = go7Var;
        this.c = bn5Var;
        this.d = svj0Var;
        this.e = jfc0Var;
        this.f = xtb0Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = ua20Var;
        this.m = jg7Var;
    }

    public static c820 a(c820 c820Var, my6 my6Var, go7 go7Var, bn5 bn5Var, svj0 svj0Var, jfc0 jfc0Var, xtb0 xtb0Var, boolean z, boolean z2, boolean z3, boolean z4, jg7 jg7Var, int i) {
        my6 my6Var2 = (i & 1) != 0 ? c820Var.f3892a : my6Var;
        go7 go7Var2 = (i & 2) != 0 ? c820Var.b : go7Var;
        bn5 bn5Var2 = (i & 4) != 0 ? c820Var.c : bn5Var;
        svj0 svj0Var2 = (i & 8) != 0 ? c820Var.d : svj0Var;
        jfc0 jfc0Var2 = (i & 16) != 0 ? c820Var.e : jfc0Var;
        xtb0 xtb0Var2 = (i & 32) != 0 ? c820Var.f : xtb0Var;
        boolean z5 = c820Var.g;
        boolean z6 = (i & 128) != 0 ? c820Var.h : z;
        boolean z7 = (i & 256) != 0 ? c820Var.i : z2;
        boolean z8 = (i & 512) != 0 ? c820Var.j : z3;
        boolean z9 = (i & 1024) != 0 ? c820Var.k : z4;
        ua20 ua20Var = c820Var.l;
        jg7 jg7Var2 = (i & 4096) != 0 ? c820Var.m : jg7Var;
        c820Var.getClass();
        jg7Var2.getClass();
        return new c820(my6Var2, go7Var2, bn5Var2, svj0Var2, jfc0Var2, xtb0Var2, z5, z6, z7, z8, z9, ua20Var, jg7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c820)) {
            return false;
        }
        c820 c820Var = (c820) obj;
        return this.f3892a.equals(c820Var.f3892a) && this.b.equals(c820Var.b) && this.c.equals(c820Var.c) && this.d.equals(c820Var.d) && Intrinsics.d(this.e, c820Var.e) && Intrinsics.d(this.f, c820Var.f) && this.g == c820Var.g && this.h == c820Var.h && this.i == c820Var.i && this.j == c820Var.j && this.k == c820Var.k && this.l == c820Var.l && Intrinsics.d(this.m, c820Var.m);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3892a.hashCode() * 31)) * 31)) * 31)) * 31;
        jfc0 jfc0Var = this.e;
        int iHashCode2 = (iHashCode + (jfc0Var == null ? 0 : jfc0Var.hashCode())) * 31;
        xtb0 xtb0Var = this.f;
        return this.m.hashCode() + ((this.l.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e((iHashCode2 + (xtb0Var != null ? xtb0Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetContentState(betGameInfo=");
        sb.append(this.f3892a);
        sb.append(", betTypeStateModel=");
        sb.append(this.b);
        sb.append(", balanceState=");
        sb.append(this.c);
        sb.append(", simpleBetState=");
        sb.append(this.d);
        sb.append(", promoCodeState=");
        sb.append(this.e);
        sb.append(", prepareMakeBetStateModel=");
        sb.append(this.f);
        sb.append(", isAuthorized=");
        ua80.u(", isSetDefaultBetSumEnabled=", ", isTaxStatusInitialized=", sb, this.g, this.h);
        ua80.u(", isTaxLoaded=", ", forceLoading=", sb, this.i, this.j);
        sb.append(this.k);
        sb.append(", styleType=");
        sb.append(this.l);
        sb.append(", betModel=");
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
