package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class j8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16079a;
    public final int b;
    public final String c;
    public final String d;
    public final e6e0 e;
    public final ufp0 f;
    public final b9a0 g;
    public final c9e0 h;
    public final hee i;
    public final IntRange j;
    public final boolean k;
    public final boolean l;
    public final hnh0 m;

    public j8e0(int i, int i2, String str, String str2, e6e0 e6e0Var, ufp0 ufp0Var, b9a0 b9a0Var, c9e0 c9e0Var, hee heeVar, IntRange intRange, boolean z, boolean z2, hnh0 hnh0Var) {
        str.getClass();
        b9a0Var.getClass();
        this.f16079a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = e6e0Var;
        this.f = ufp0Var;
        this.g = b9a0Var;
        this.h = c9e0Var;
        this.i = heeVar;
        this.j = intRange;
        this.k = z;
        this.l = z2;
        this.m = hnh0Var;
    }

    public static j8e0 a(j8e0 j8e0Var, int i, boolean z, int i2) {
        int i3 = j8e0Var.f16079a;
        int i4 = (i2 & 2) != 0 ? j8e0Var.b : i;
        String str = j8e0Var.c;
        String str2 = j8e0Var.d;
        e6e0 e6e0Var = j8e0Var.e;
        ufp0 ufp0Var = j8e0Var.f;
        b9a0 b9a0Var = j8e0Var.g;
        c9e0 c9e0Var = j8e0Var.h;
        hee heeVar = j8e0Var.i;
        IntRange intRange = j8e0Var.j;
        boolean z2 = (i2 & 1024) != 0 ? j8e0Var.k : z;
        boolean z3 = j8e0Var.l;
        hnh0 hnh0Var = j8e0Var.m;
        str.getClass();
        b9a0Var.getClass();
        return new j8e0(i3, i4, str, str2, e6e0Var, ufp0Var, b9a0Var, c9e0Var, heeVar, intRange, z2, z3, hnh0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8e0)) {
            return false;
        }
        j8e0 j8e0Var = (j8e0) obj;
        return this.f16079a == j8e0Var.f16079a && this.b == j8e0Var.b && Intrinsics.d(this.c, j8e0Var.c) && this.d.equals(j8e0Var.d) && this.e == j8e0Var.e && this.f.equals(j8e0Var.f) && Intrinsics.d(this.g, j8e0Var.g) && this.h.equals(j8e0Var.h) && this.i == j8e0Var.i && Intrinsics.d(this.j, j8e0Var.j) && this.k == j8e0Var.k && this.l == j8e0Var.l && this.m == j8e0Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + twn.f(this.f, (this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f16079a) * 31, 31), 31, this.c), 31, this.d)) * 31, 31)) * 31)) * 31)) * 31;
        IntRange intRange = this.j;
        return this.m.hashCode() + brm0.e(brm0.e((iHashCode + (intRange == null ? 0 : intRange.hashCode())) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("RatingTableRowHeaderModel(rowId=", this.f16079a, ", notInnerRowId=", ", dataValue=", this.b);
        f140.v(sbT, this.c, ", positionValue=", this.d, ", ratingPositionChange=");
        sbT.append(this.e);
        sbT.append(", teamModel=");
        sbT.append(this.f);
        sbT.append(", playerModel=");
        sbT.append(this.g);
        sbT.append(", ratingTournamentModel=");
        sbT.append(this.h);
        sbT.append(", iconType=");
        sbT.append(this.i);
        sbT.append(", expandableRange=");
        sbT.append(this.j);
        sbT.append(", isExpanded=");
        ua80.u(", isInnerRow=", ", sectionType=", sbT, this.k, this.l);
        sbT.append(this.m);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
