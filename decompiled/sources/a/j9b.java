package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j9b implements m9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16130a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final List j;

    public j9b(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List list2) {
        cl5 cl5Var = sw5.b;
        list.getClass();
        list2.getClass();
        this.f16130a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = list2;
    }

    @Override // a.m9b
    public final List a() {
        return this.f16130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9b)) {
            return false;
        }
        j9b j9bVar = (j9b) obj;
        if (!Intrinsics.d(this.f16130a, j9bVar.f16130a) || this.b != j9bVar.b || this.c != j9bVar.c || this.d != j9bVar.d || this.e != j9bVar.e || this.f != j9bVar.f || this.g != j9bVar.g || this.h != j9bVar.h || this.i != j9bVar.i || !Intrinsics.d(this.j, j9bVar.j)) {
            return false;
        }
        cl5 cl5Var = sw5.b;
        return true;
    }

    public final int hashCode() {
        return sw5.ROUND_12.hashCode() + dw9.a(twn.a(this.i, twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, this.f16130a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.j);
    }

    public final String toString() {
        sw5 sw5Var = sw5.ROUND_12;
        StringBuilder sb = new StringBuilder("Default(childUiItems=");
        sb.append(this.f16130a);
        sb.append(", outsideMarginTop=");
        sb.append(this.b);
        sb.append(", outsideMarginHorizontal=");
        axq.r(this.c, this.d, ", insideMarginBottom=", ", insideMarginLeft=", sb);
        axq.r(this.e, this.f, ", insideMarginRight=", ", backgroundColor=", sb);
        axq.r(this.g, this.h, ", insideItemBackground=", ", accordionBottomRoundCorners=", sb);
        ohs0.v(this.i, ", skipItemsInsideBackground=", ", insideItemRoundCornersType=", sb, this.j);
        sb.append(sw5Var);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
