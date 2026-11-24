package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l9b implements m9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19641a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final List j;
    public final int k;
    public final boolean l;

    public l9b(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list2, int i9, boolean z) {
        cl5 cl5Var = sw5.b;
        list.getClass();
        list2.getClass();
        this.f19641a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = list2;
        this.k = i9;
        this.l = z;
    }

    @Override // a.m9b
    public final List a() {
        return this.f19641a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9b)) {
            return false;
        }
        l9b l9bVar = (l9b) obj;
        if (!Intrinsics.d(this.f19641a, l9bVar.f19641a) || this.b != l9bVar.b || this.c != l9bVar.c || this.d != l9bVar.d || this.e != l9bVar.e || this.f != l9bVar.f || this.g != l9bVar.g || this.h != l9bVar.h || this.i != l9bVar.i || !Intrinsics.d(this.j, l9bVar.j) || this.k != l9bVar.k || this.l != l9bVar.l) {
            return false;
        }
        cl5 cl5Var = sw5.b;
        return true;
    }

    public final int hashCode() {
        return sw5.ROUND_12.hashCode() + brm0.e(twn.a(2, twn.a(this.k, dw9.a(twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f19641a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.j), 31), 31), 31, this.l);
    }

    public final String toString() {
        sw5 sw5Var = sw5.ROUND_12;
        StringBuilder sb = new StringBuilder("Grid(childUiItems=");
        sb.append(this.f19641a);
        sb.append(", outsideMarginTop=");
        sb.append(this.b);
        sb.append(", outsideMarginHorizontal=");
        axq.r(this.c, this.d, ", insideMarginBottom=", ", insideMarginLeft=", sb);
        axq.r(this.e, this.f, ", insideMarginRight=", ", insideMarginBetweenItems=", sb);
        axq.r(this.g, this.h, ", backgroundColor=", ", insideItemBackground=", sb);
        ohs0.v(this.i, ", skipItemsInsideBackground=", ", accordionBottomRoundCorners=", sb, this.j);
        brm0.w(this.k, ", spanSize=2, isRTL=", ", insideItemRoundCornersType=", sb, this.l);
        sb.append(sw5Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
