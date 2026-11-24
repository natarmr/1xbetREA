package a;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16078a;
    public final long b;
    public final String c;
    public final boolean d;
    public final int e;
    public final rj1 f;
    public final boolean g;
    public final e8d0 h;
    public final Set i;
    public final sff0 j;
    public final fk80 k;

    public j8d0(long j, long j2, String str, boolean z, int i, rj1 rj1Var, boolean z2, e8d0 e8d0Var, Set set, sff0 sff0Var, fk80 fk80Var) {
        str.getClass();
        e8d0Var.getClass();
        set.getClass();
        this.f16078a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = rj1Var;
        this.g = z2;
        this.h = e8d0Var;
        this.i = set;
        this.j = sff0Var;
        this.k = fk80Var;
    }

    public static j8d0 a(j8d0 j8d0Var, boolean z, e8d0 e8d0Var, Set set, fk80 fk80Var, int i) {
        long j = j8d0Var.f16078a;
        long j2 = j8d0Var.b;
        String str = j8d0Var.c;
        boolean z2 = (i & 8) != 0 ? j8d0Var.d : z;
        int i2 = j8d0Var.e;
        rj1 rj1Var = j8d0Var.f;
        boolean z3 = j8d0Var.g;
        j8d0Var.getClass();
        e8d0 e8d0Var2 = (i & 256) != 0 ? j8d0Var.h : e8d0Var;
        Set set2 = (i & 512) != 0 ? j8d0Var.i : set;
        sff0 sff0Var = j8d0Var.j;
        fk80 fk80Var2 = (i & 2048) != 0 ? j8d0Var.k : fk80Var;
        j8d0Var.getClass();
        str.getClass();
        e8d0Var2.getClass();
        set2.getClass();
        return new j8d0(j, j2, str, z2, i2, rj1Var, z3, e8d0Var2, set2, sff0Var, fk80Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8d0)) {
            return false;
        }
        j8d0 j8d0Var = (j8d0) obj;
        return this.f16078a == j8d0Var.f16078a && this.b == j8d0Var.b && Intrinsics.d(this.c, j8d0Var.c) && this.d == j8d0Var.d && this.e == j8d0Var.e && this.f == j8d0Var.f && this.g == j8d0Var.g && Intrinsics.d(this.h, j8d0Var.h) && Intrinsics.d(this.i, j8d0Var.i) && this.j.equals(j8d0Var.j) && Intrinsics.d(this.k, j8d0Var.k);
    }

    public final int hashCode() {
        int iC = cs0.c(this.j, ohs0.g(this.i, (this.h.hashCode() + twn.a(0, brm0.e((this.f.hashCode() + twn.a(this.e, brm0.e(ua80.b(rw2.b(Long.hashCode(this.f16078a) * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g), 31)) * 31, 31), 31);
        fk80 fk80Var = this.k;
        return iC + (fk80Var != null ? fk80Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16078a, "PublisherGamesState(partitionId=", ", productId=");
        kng0.z(sbQ, this.b, ", title=", this.c);
        cs0.v(this.e, ", isAuth=", ", subCategoryId=", sbQ, this.d);
        sbQ.append(", openedFromType=");
        sbQ.append(this.f);
        sbQ.append(", showNavBar=");
        sbQ.append(this.g);
        sbQ.append(", lottieTypeId=0, contentState=");
        sbQ.append(this.h);
        sbQ.append(", favoriteGameIds=");
        sbQ.append(this.i);
        sbQ.append(", remoteConfig=");
        sbQ.append(this.j);
        sbQ.append(", gamesPager=");
        sbQ.append(this.k);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
