package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class l6e0 extends v8b {
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final e6e0 h;
    public final ufp0 i;
    public final b9a0 j;
    public final c9e0 k;
    public final hee l;
    public final IntRange m;
    public final boolean n;
    public final boolean o;
    public final hnh0 p;
    public final ArrayList q;
    public final int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6e0(int i, int i2, String str, String str2, e6e0 e6e0Var, ufp0 ufp0Var, b9a0 b9a0Var, c9e0 c9e0Var, hee heeVar, IntRange intRange, boolean z, boolean z2, hnh0 hnh0Var, ArrayList arrayList, int i3) {
        super(22, Integer.valueOf(i3), null, arrayList);
        str.getClass();
        b9a0Var.getClass();
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = e6e0Var;
        this.i = ufp0Var;
        this.j = b9a0Var;
        this.k = c9e0Var;
        this.l = heeVar;
        this.m = intRange;
        this.n = z;
        this.o = z2;
        this.p = hnh0Var;
        this.q = arrayList;
        this.r = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6e0)) {
            return false;
        }
        l6e0 l6e0Var = (l6e0) obj;
        return this.d == l6e0Var.d && this.e == l6e0Var.e && Intrinsics.d(this.f, l6e0Var.f) && this.g.equals(l6e0Var.g) && this.h == l6e0Var.h && this.i.equals(l6e0Var.i) && Intrinsics.d(this.j, l6e0Var.j) && this.k.equals(l6e0Var.k) && this.l == l6e0Var.l && Intrinsics.d(this.m, l6e0Var.m) && this.n == l6e0Var.n && this.o == l6e0Var.o && this.p == l6e0Var.p && this.q.equals(l6e0Var.q) && this.r == l6e0Var.r;
    }

    public final int hashCode() {
        int iHashCode = (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + twn.f(this.i, (this.h.hashCode() + ua80.b(ua80.b(twn.a(this.e, Integer.hashCode(this.d) * 31, 31), 31, this.f), 31, this.g)) * 31, 31)) * 31)) * 31)) * 31;
        IntRange intRange = this.m;
        return Integer.hashCode(this.r) + twn.g(this.q, (this.p.hashCode() + brm0.e(brm0.e((iHashCode + (intRange == null ? 0 : intRange.hashCode())) * 31, 31, this.n), 31, this.o)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("RatingRowHeaderUiModel(rowId=", this.d, ", notInnerRowId=", ", dataValue=", this.e);
        f140.v(sbT, this.f, ", positionValue=", this.g, ", ratingPositionChange=");
        sbT.append(this.h);
        sbT.append(", teamModel=");
        sbT.append(this.i);
        sbT.append(", playerModel=");
        sbT.append(this.j);
        sbT.append(", ratingTournamentModel=");
        sbT.append(this.k);
        sbT.append(", iconType=");
        sbT.append(this.l);
        sbT.append(", expandableRange=");
        sbT.append(this.m);
        sbT.append(", isExpanded=");
        ua80.u(", isInnerRow=", ", sectionType=", sbT, this.n, this.o);
        sbT.append(this.p);
        sbT.append(", cellContentList=");
        sbT.append(this.q);
        sbT.append(", widthMax=");
        return rz4.j(this.r, Separators.RPAREN, sbT);
    }
}
