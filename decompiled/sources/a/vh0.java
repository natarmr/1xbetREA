package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37408a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final List l;
    public final List m;
    public final boolean n;

    public vh0(long j, String str, String str2, String str3, int i, long j2, long j3, long j4, boolean z, boolean z2, String str4, List list, List list2, boolean z3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f37408a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = z;
        this.j = z2;
        this.k = str4;
        this.l = list;
        this.m = list2;
        this.n = z3;
    }

    public static vh0 a(vh0 vh0Var) {
        long j = vh0Var.f37408a;
        String str = vh0Var.b;
        String str2 = vh0Var.c;
        String str3 = vh0Var.d;
        int i = vh0Var.e;
        long j2 = vh0Var.f;
        long j3 = vh0Var.h;
        boolean z = vh0Var.i;
        boolean z2 = vh0Var.j;
        String str4 = vh0Var.k;
        List list = vh0Var.l;
        List list2 = vh0Var.m;
        boolean z3 = vh0Var.n;
        str.getClass();
        list.getClass();
        list2.getClass();
        return new vh0(j, str, str2, str3, i, j2, 96838L, j3, z, z2, str4, list, list2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0)) {
            return false;
        }
        vh0 vh0Var = (vh0) obj;
        return this.f37408a == vh0Var.f37408a && Intrinsics.d(this.b, vh0Var.b) && this.c.equals(vh0Var.c) && this.d.equals(vh0Var.d) && this.e == vh0Var.e && this.f == vh0Var.f && this.g == vh0Var.g && this.h == vh0Var.h && this.i == vh0Var.i && this.j == vh0Var.j && this.k.equals(vh0Var.k) && Intrinsics.d(this.l, vh0Var.l) && Intrinsics.d(this.m, vh0Var.m) && this.n == vh0Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + dw9.a(dw9.a(ua80.b(brm0.e(brm0.e(rw2.b(rw2.b(rw2.b(twn.a(this.e, ua80.b(ua80.b(ua80.b(Long.hashCode(this.f37408a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37408a, "AggregatorCategoryModel(id=", ", title=", this.b);
        f140.v(sbO, ", imageUrl=", this.c, ", imageBannerUrl=", this.d);
        rw2.x(sbO, ", sort=", this.e, ", partType=");
        sbO.append(this.f);
        kng0.A(sbO, ", gameId=", this.g, ", productId=");
        hne.t(this.h, ", needTransfer=", sbO, this.i);
        hne.u(", noLoyalty=", ", description=", this.k, sbO, this.j);
        hne.v(", games=", ", favorites=", sbO, this.l, this.m);
        return f140.n(sbO, ", authorized=", this.n, Separators.RPAREN);
    }
}
