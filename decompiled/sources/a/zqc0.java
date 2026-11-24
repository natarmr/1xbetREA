package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44802a;
    public final boolean b;
    public final mdm c;
    public final List d;
    public final vrc0 e;
    public final src0 f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final long m;
    public final double n;
    public final esr o;
    public final boolean p;

    public zqc0(boolean z, boolean z2, mdm mdmVar, List list, vrc0 vrc0Var, src0 src0Var, String str, int i, int i2, int i3, String str2, boolean z3, long j, double d, esr esrVar, boolean z4) {
        list.getClass();
        str2.getClass();
        this.f44802a = z;
        this.b = z2;
        this.c = mdmVar;
        this.d = list;
        this.e = vrc0Var;
        this.f = src0Var;
        this.g = str;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = str2;
        this.l = z3;
        this.m = j;
        this.n = d;
        this.o = esrVar;
        this.p = z4;
    }

    public static zqc0 a(zqc0 zqc0Var, boolean z, boolean z2, List list, String str, int i, int i2, int i3, long j, double d, esr esrVar, boolean z3, int i4) {
        boolean z4 = (i4 & 1) != 0 ? zqc0Var.f44802a : z;
        boolean z5 = (i4 & 2) != 0 ? zqc0Var.b : z2;
        mdm mdmVar = zqc0Var.c;
        List list2 = (i4 & 8) != 0 ? zqc0Var.d : list;
        vrc0 vrc0Var = zqc0Var.e;
        src0 src0Var = zqc0Var.f;
        String str2 = (i4 & 64) != 0 ? zqc0Var.g : str;
        int i5 = (i4 & 128) != 0 ? zqc0Var.h : i;
        int i6 = (i4 & 256) != 0 ? zqc0Var.i : i2;
        int i7 = (i4 & 512) != 0 ? zqc0Var.j : i3;
        String str3 = zqc0Var.k;
        boolean z6 = zqc0Var.l;
        long j2 = (i4 & 4096) != 0 ? zqc0Var.m : j;
        double d2 = (i4 & 8192) != 0 ? zqc0Var.n : d;
        esr esrVar2 = (i4 & 16384) != 0 ? zqc0Var.o : esrVar;
        boolean z7 = (i4 & 32768) != 0 ? zqc0Var.p : z3;
        zqc0Var.getClass();
        list2.getClass();
        str3.getClass();
        return new zqc0(z4, z5, mdmVar, list2, vrc0Var, src0Var, str2, i5, i6, i7, str3, z6, j2, d2, esrVar2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqc0)) {
            return false;
        }
        zqc0 zqc0Var = (zqc0) obj;
        return this.f44802a == zqc0Var.f44802a && this.b == zqc0Var.b && this.c.equals(zqc0Var.c) && Intrinsics.d(this.d, zqc0Var.d) && this.e.equals(zqc0Var.e) && this.f == zqc0Var.f && this.g.equals(zqc0Var.g) && this.h == zqc0Var.h && this.i == zqc0Var.i && this.j == zqc0Var.j && Intrinsics.d(this.k, zqc0Var.k) && this.l == zqc0Var.l && this.m == zqc0Var.m && Double.compare(this.n, zqc0Var.n) == 0 && this.o == zqc0Var.o && this.p == zqc0Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + ((this.o.hashCode() + brm0.d(this.n, rw2.b(brm0.e(ua80.b(twn.a(this.j, twn.a(this.i, twn.a(this.h, ua80.b((this.f.hashCode() + ((this.e.hashCode() + dw9.a(f140.d(this.c, brm0.e(Boolean.hashCode(this.f44802a) * 31, 31, this.b), 31), 31, this.d)) * 31)) * 31, 31, this.g), 31), 31), 31), 31, this.k), 31, this.l), 31, this.m), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PromoShopDetailState(showLoading=", ", showError=", ", errorConfig=", this.f44802a, this.b);
        sbQ.append(this.c);
        sbQ.append(", relatedPromoItems=");
        sbQ.append(this.d);
        sbQ.append(", promoItem=");
        sbQ.append(this.e);
        sbQ.append(", promoCategory=");
        sbQ.append(this.f);
        sbQ.append(", categoryName=");
        twn.w(this.h, this.g, ", promoPrice=", ", gamesCount=", sbQ);
        axq.r(this.i, this.j, ", promoBalance=", ", analyticsParamName=", sbQ);
        brm0.C(this.k, ", newPromoShopServiceEnabled=", ", gameId=", sbQ, this.l);
        sbQ.append(this.m);
        ohs0.A(sbQ, this.n, ", freeBetSumEur=", ", gameBonusType=");
        sbQ.append(this.o);
        sbQ.append(", forceIFrame=");
        sbQ.append(this.p);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
