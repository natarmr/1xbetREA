package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a820 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd5 f404a;
    public final txe b;
    public final ko7 c;
    public final xm5 d;
    public final pvj0 e;
    public final dzc0 f;
    public final hx4 g;
    public final vtb0 h;
    public final boolean i;
    public final q4f j;
    public final float k;
    public final boolean l;
    public final vf7 m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ua20 r;

    public a820(jd5 jd5Var, txe txeVar, ko7 ko7Var, xm5 xm5Var, pvj0 pvj0Var, dzc0 dzc0Var, hx4 hx4Var, vtb0 vtb0Var, boolean z, q4f q4fVar, float f, boolean z2, vf7 vf7Var, int i, boolean z3, boolean z4, boolean z5, ua20 ua20Var) {
        q4fVar.getClass();
        this.f404a = jd5Var;
        this.b = txeVar;
        this.c = ko7Var;
        this.d = xm5Var;
        this.e = pvj0Var;
        this.f = dzc0Var;
        this.g = hx4Var;
        this.h = vtb0Var;
        this.i = z;
        this.j = q4fVar;
        this.k = f;
        this.l = z2;
        this.m = vf7Var;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = ua20Var;
    }

    public static a820 a(a820 a820Var, txe txeVar, ko7 ko7Var, xm5 xm5Var, pvj0 pvj0Var, dzc0 dzc0Var, hx4 hx4Var, vtb0 vtb0Var, boolean z, q4f q4fVar, float f, boolean z2, vf7 vf7Var, int i, boolean z3, boolean z4, boolean z5, int i2) {
        jd5 jd5Var = a820Var.f404a;
        txe txeVar2 = (i2 & 2) != 0 ? a820Var.b : txeVar;
        ko7 ko7Var2 = (i2 & 4) != 0 ? a820Var.c : ko7Var;
        xm5 xm5Var2 = (i2 & 8) != 0 ? a820Var.d : xm5Var;
        pvj0 pvj0Var2 = (i2 & 16) != 0 ? a820Var.e : pvj0Var;
        dzc0 dzc0Var2 = (i2 & 32) != 0 ? a820Var.f : dzc0Var;
        hx4 hx4Var2 = (i2 & 64) != 0 ? a820Var.g : hx4Var;
        vtb0 vtb0Var2 = (i2 & 128) != 0 ? a820Var.h : vtb0Var;
        boolean z6 = (i2 & 256) != 0 ? a820Var.i : z;
        q4f q4fVar2 = (i2 & 512) != 0 ? a820Var.j : q4fVar;
        float f2 = (i2 & 1024) != 0 ? a820Var.k : f;
        boolean z7 = (i2 & 2048) != 0 ? a820Var.l : z2;
        vf7 vf7Var2 = (i2 & 4096) != 0 ? a820Var.m : vf7Var;
        int i3 = (i2 & 8192) != 0 ? a820Var.n : i;
        boolean z8 = (i2 & 16384) != 0 ? a820Var.o : z3;
        boolean z9 = (i2 & 32768) != 0 ? a820Var.p : z4;
        boolean z10 = (i2 & 65536) != 0 ? a820Var.q : z5;
        ua20 ua20Var = a820Var.r;
        a820Var.getClass();
        ko7Var2.getClass();
        q4fVar2.getClass();
        return new a820(jd5Var, txeVar2, ko7Var2, xm5Var2, pvj0Var2, dzc0Var2, hx4Var2, vtb0Var2, z6, q4fVar2, f2, z7, vf7Var2, i3, z8, z9, z10, ua20Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a820)) {
            return false;
        }
        a820 a820Var = (a820) obj;
        return this.f404a.equals(a820Var.f404a) && this.b.equals(a820Var.b) && this.c.equals(a820Var.c) && this.d.equals(a820Var.d) && this.e.equals(a820Var.e) && this.f.equals(a820Var.f) && this.g.equals(a820Var.g) && Intrinsics.d(this.h, a820Var.h) && this.i == a820Var.i && this.j == a820Var.j && Float.compare(this.k, a820Var.k) == 0 && this.l == a820Var.l && this.m.equals(a820Var.m) && this.n == a820Var.n && this.o == a820Var.o && this.p == a820Var.p && this.q == a820Var.q && this.r == a820Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f404a.f16314a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        vtb0 vtb0Var = this.h;
        return this.r.hashCode() + brm0.e(brm0.e(brm0.e(twn.a(this.n, (this.m.hashCode() + brm0.e(defpackage.c.a(vqd.b(this.j, brm0.e((iHashCode + (vtb0Var == null ? 0 : vtb0Var.hashCode())) * 31, 31, this.i), 31), this.k, 31), 31, this.l)) * 31, 31), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetContentState(backgroundStateModel=");
        sb.append(this.f404a);
        sb.append(", couponInfoStateModel=");
        sb.append(this.b);
        sb.append(", betTypeUiModel=");
        sb.append(this.c);
        sb.append(", balanceState=");
        sb.append(this.d);
        sb.append(", simpleBetState=");
        sb.append(this.e);
        sb.append(", promocodeState=");
        sb.append(this.f);
        sb.append(", autoBetState=");
        sb.append(this.g);
        sb.append(", prepareMakeBetStateModel=");
        sb.append(this.h);
        sb.append(", isAuthorized=");
        sb.append(this.i);
        sb.append(", couponTypeModel=");
        sb.append(this.j);
        sb.append(", bottomSheetOffset=");
        sb.append(this.k);
        sb.append(", isSetDefaultBetSumEnabled=");
        sb.append(this.l);
        sb.append(", currentBetLimits=");
        sb.append(this.m);
        sb.append(", tabsCount=");
        sb.append(this.n);
        sb.append(", isTaxStatusInitialized=");
        ua80.u(", isTaxLoaded=", ", forceLoading=", sb, this.o, this.p);
        sb.append(this.q);
        sb.append(", styleType=");
        sb.append(this.r);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
