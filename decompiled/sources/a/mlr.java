package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mlr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22006a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final List p;
    public final boolean q;
    public final Long r;

    public mlr(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, boolean z8, Long l) {
        str2.getClass();
        str4.getClass();
        list.getClass();
        this.f22006a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = list;
        this.q = z8;
        this.r = l;
    }

    public static mlr a(mlr mlrVar, long j, long j2, long j3, String str, boolean z, boolean z2, boolean z3, int i) {
        long j4 = (i & 2) != 0 ? mlrVar.b : j2;
        long j5 = (i & 4) != 0 ? mlrVar.c : j3;
        long j6 = mlrVar.d;
        String str2 = mlrVar.e;
        String str3 = (i & 32) != 0 ? mlrVar.f : str;
        String str4 = mlrVar.g;
        String str5 = mlrVar.h;
        boolean z4 = mlrVar.i;
        boolean z5 = mlrVar.j;
        boolean z6 = mlrVar.k;
        boolean z7 = (i & 2048) != 0 ? mlrVar.l : z;
        boolean z8 = (i & 4096) != 0 ? mlrVar.m : z2;
        boolean z9 = (i & 8192) != 0 ? mlrVar.n : z3;
        boolean z10 = mlrVar.o;
        List list = mlrVar.p;
        boolean z11 = mlrVar.q;
        Long l = mlrVar.r;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        return new mlr(j, j4, j5, j6, str2, str3, str4, str5, z4, z5, z6, z7, z8, z9, z10, list, z11, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlr)) {
            return false;
        }
        mlr mlrVar = (mlr) obj;
        return this.f22006a == mlrVar.f22006a && this.b == mlrVar.b && this.c == mlrVar.c && this.d == mlrVar.d && Intrinsics.d(this.e, mlrVar.e) && Intrinsics.d(this.f, mlrVar.f) && Intrinsics.d(this.g, mlrVar.g) && Intrinsics.d(this.h, mlrVar.h) && this.i == mlrVar.i && this.j == mlrVar.j && this.k == mlrVar.k && this.l == mlrVar.l && this.m == mlrVar.m && this.n == mlrVar.n && this.o == mlrVar.o && Intrinsics.d(this.p, mlrVar.p) && this.q == mlrVar.q && Intrinsics.d(this.r, mlrVar.r);
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f22006a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
        Long l = this.r;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f22006a, "Game(id=", ", productId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", providerId=", this.c, ", brandId=");
        kng0.z(sbQ, this.d, ", productName=", this.e);
        f140.v(sbQ, ", name=", this.f, ", logoUrl=", this.g);
        w6x.z(", imgVerticalUrl=", this.h, ", popular=", sbQ, this.i);
        w6x.A(", newGame=", ", promo=", sbQ, this.j, this.k);
        w6x.A(", needTransfer=", ", noLoyalty=", sbQ, this.l, this.m);
        w6x.A(", hasDemo=", ", hot=", sbQ, this.n, this.o);
        esw0.k(sbQ, ", categories=", this.p, ", useSmartSearch=", this.q);
        sbQ.append(", lastPlayedAt=");
        sbQ.append(this.r);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public /* synthetic */ mlr(long j, long j2, long j3, long j4, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, List list, boolean z8, int i) {
        this(j, j2, j3, j4, str, str2, str3, (i & 128) != 0 ? "" : str4, z, z2, z3, z4, z5, z6, z7, list, z8, (Long) null);
    }
}
