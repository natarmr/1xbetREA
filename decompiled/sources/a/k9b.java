package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k9b implements m9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17907a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final int g;
    public final int h;
    public final int i;

    public k9b(int i, List list, int i2, int i3, int i4, List list2, int i5, int i6, int i7) {
        list.getClass();
        list2.getClass();
        this.f17907a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = list2;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    @Override // a.m9b
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9b)) {
            return false;
        }
        k9b k9bVar = (k9b) obj;
        return this.f17907a == k9bVar.f17907a && Intrinsics.d(this.b, k9bVar.b) && this.c == k9bVar.c && this.d == k9bVar.d && this.e == k9bVar.e && Intrinsics.d(this.f, k9bVar.f) && this.g == k9bVar.g && this.h == k9bVar.h && this.i == k9bVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, twn.a(this.g, dw9.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, dw9.a(Integer.hashCode(this.f17907a) * 31, 31, this.b), 31), 31), 31), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DividerMainContainer(outsideMarginTop=");
        sb.append(this.f17907a);
        sb.append(", childUiItems=");
        sb.append(this.b);
        sb.append(", outsideMarginHorizontal=");
        axq.r(this.c, this.d, ", expandOutsideMarginTop=", ", insideMarginBottom=", sb);
        ohs0.v(this.e, ", specifyLastMarginBottom=", ", lastMarginBottom=", sb, this.f);
        axq.r(this.g, this.h, ", backgroundColor=", ", accordionBottomRoundCorners=", sb);
        return rz4.j(this.i, Separators.RPAREN, sb);
    }
}
