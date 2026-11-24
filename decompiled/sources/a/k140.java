package a;

import android.gov.nist.core.Separators;
import android.graphics.ColorFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f17501a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final List m;
    public final ColorFilter n;

    public k140(iz30 iz30Var, boolean z, r040 r040Var, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6, int i7, List list, ColorFilter colorFilter) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f17501a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = i6;
        this.l = i7;
        this.m = list;
        this.n = colorFilter;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k140)) {
            return false;
        }
        k140 k140Var = (k140) obj;
        return this.f17501a == k140Var.f17501a && this.b == k140Var.b && this.c == k140Var.c && this.d == k140Var.d && this.e == k140Var.e && this.f == k140Var.f && this.g == k140Var.g && this.h == k140Var.h && Intrinsics.d(this.i, k140Var.i) && Intrinsics.d(this.j, k140Var.j) && this.k == k140Var.k && this.l == k140Var.l && Intrinsics.d(this.m, k140Var.m) && Intrinsics.d(this.n, k140Var.n);
    }

    public final int hashCode() {
        int iA = dw9.a(twn.a(this.l, twn.a(this.k, ua80.b(ua80.b(twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, w6x.f(this.c, brm0.e(this.f17501a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31), 31), 31, this.m);
        ColorFilter colorFilter = this.n;
        return iA + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f17501a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("DecoratedMenuUiItem(menuItemModel=", this.f17501a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", badgeBackground=", this.d, ", badgeBackgroundTint=");
        axq.r(this.e, this.f, ", icon=", ", iconTint=", sbS);
        axq.r(this.g, this.h, ", iconBackgroundTint=", ", title=", sbS);
        f140.v(sbS, this.i, ", subtitle=", this.j, ", endIcon=");
        axq.r(this.k, this.l, ", background=", ", backgroundGradientColors=", sbS);
        sbS.append(this.m);
        sbS.append(", endIconColorFilter=");
        sbS.append(this.n);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
