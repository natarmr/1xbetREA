package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pbv {
    public static final obv Companion = new obv();
    public static final a8z[] s = {null, maz.a(wez.f39042a, new tet(28)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26728a;
    public final List b;
    public final String c;
    public final hcs d;
    public final a570 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final hds n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public /* synthetic */ pbv(int i, long j, List list, String str, hcs hcsVar, a570 a570Var, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, hds hdsVar, boolean z8, boolean z9, boolean z10, boolean z11) {
        if (61439 != (i & 61439)) {
            m2x.I(i, 61439, nbv.f23260a.getDescriptor());
            throw null;
        }
        this.f26728a = j;
        this.b = list;
        this.c = str;
        this.d = hcsVar;
        this.e = a570Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z7;
        }
        this.n = hdsVar;
        this.o = z8;
        this.p = z9;
        this.q = (65536 & i) == 0 ? true : z10;
        if ((i & 131072) == 0) {
            this.r = false;
        } else {
            this.r = z11;
        }
    }

    public static pbv a(pbv pbvVar, hds hdsVar, boolean z, boolean z2, int i) {
        long j = pbvVar.f26728a;
        List list = pbvVar.b;
        String str = pbvVar.c;
        hcs hcsVar = pbvVar.d;
        a570 a570Var = pbvVar.e;
        String str2 = pbvVar.f;
        boolean z3 = pbvVar.g;
        boolean z4 = pbvVar.h;
        boolean z5 = pbvVar.i;
        boolean z6 = pbvVar.j;
        boolean z7 = pbvVar.k;
        boolean z8 = pbvVar.l;
        boolean z9 = pbvVar.m;
        hds hdsVar2 = (i & 8192) != 0 ? pbvVar.n : hdsVar;
        boolean z10 = pbvVar.o;
        boolean z11 = (i & 32768) != 0 ? pbvVar.p : z;
        boolean z12 = (i & 65536) != 0 ? pbvVar.q : z2;
        boolean z13 = pbvVar.r;
        pbvVar.getClass();
        list.getClass();
        str.getClass();
        hcsVar.getClass();
        a570Var.getClass();
        str2.getClass();
        hdsVar2.getClass();
        return new pbv(j, list, str, hcsVar, a570Var, str2, z3, z4, z5, z6, z7, z8, z9, hdsVar2, z10, z11, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbv)) {
            return false;
        }
        pbv pbvVar = (pbv) obj;
        return this.f26728a == pbvVar.f26728a && Intrinsics.d(this.b, pbvVar.b) && Intrinsics.d(this.c, pbvVar.c) && this.d == pbvVar.d && Intrinsics.d(this.e, pbvVar.e) && Intrinsics.d(this.f, pbvVar.f) && this.g == pbvVar.g && this.h == pbvVar.h && this.i == pbvVar.i && this.j == pbvVar.j && this.k == pbvVar.k && this.l == pbvVar.l && this.m == pbvVar.m && Intrinsics.d(this.n, pbvVar.n) && this.o == pbvVar.o && this.p == pbvVar.p && this.q == pbvVar.q && this.r == pbvVar.r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + brm0.e(brm0.e(brm0.e((this.n.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b((this.e.hashCode() + ((this.d.hashCode() + ua80.b(dw9.a(Long.hashCode(this.f26728a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f26728a, "GpResult(id=", ", applyCategories=", this.b);
        sbP.append(", gameName=");
        sbP.append(this.c);
        sbP.append(", gameFlag=");
        sbP.append(this.d);
        sbP.append(", gameType=");
        sbP.append(this.e);
        sbP.append(", maxCoef=");
        sbP.append(this.f);
        w6x.A(", isGameWithCashback=", ", isBonusAllowedFromSecondaryAccount=", sbP, this.g, this.h);
        w6x.A(", isBonusAccountAllowed=", ", availabilityGameFromBonusAcc=", sbP, this.i, this.j);
        w6x.A(", forceIFrame=", ", bonusAllowed=", sbP, this.k, this.l);
        sbP.append(", favoriteGame=");
        sbP.append(this.m);
        sbP.append(", imageInfo=");
        sbP.append(this.n);
        w6x.A(", demoModeAvailable=", ", underMaintenance=", sbP, this.o, this.p);
        w6x.A(", enable=", ", fullScreenEnable=", sbP, this.q, this.r);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }

    public pbv(long j, List list, String str, hcs hcsVar, a570 a570Var, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, hds hdsVar, boolean z8, boolean z9, boolean z10, boolean z11) {
        list.getClass();
        str.getClass();
        a570Var.getClass();
        hdsVar.getClass();
        this.f26728a = j;
        this.b = list;
        this.c = str;
        this.d = hcsVar;
        this.e = a570Var;
        this.f = str2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = hdsVar;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
    }

    public /* synthetic */ pbv(long j, List list, String str, hcs hcsVar, a570 a570Var, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, hds hdsVar, boolean z7, boolean z8, boolean z9, int i) {
        this(j, list, str, hcsVar, a570Var, str2, z, z2, z3, z4, z5, z6, false, hdsVar, z7, z8, true, (i & 131072) != 0 ? false : z9);
    }
}
