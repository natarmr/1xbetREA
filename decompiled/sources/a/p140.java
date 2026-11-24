package a;

import android.gov.nist.core.Separators;
import android.graphics.ColorFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f26182a;
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
    public final ColorFilter m;

    public p140(iz30 iz30Var, boolean z, r040 r040Var, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6, int i7, ColorFilter colorFilter) {
        iz30Var.getClass();
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        this.f26182a = iz30Var;
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
        this.m = colorFilter;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p140)) {
            return false;
        }
        p140 p140Var = (p140) obj;
        return this.f26182a == p140Var.f26182a && this.b == p140Var.b && this.c == p140Var.c && this.d == p140Var.d && this.e == p140Var.e && this.f == p140Var.f && this.g == p140Var.g && this.h == p140Var.h && Intrinsics.d(this.i, p140Var.i) && Intrinsics.d(this.j, p140Var.j) && this.k == p140Var.k && this.l == p140Var.l && Intrinsics.d(this.m, p140Var.m);
    }

    public final int hashCode() {
        int iA = twn.a(this.l, twn.a(this.k, ua80.b(ua80.b(twn.a(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, twn.a(this.d, w6x.f(this.c, brm0.e(this.f26182a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31), 31);
        ColorFilter colorFilter = this.m;
        return iA + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f26182a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("IndividualDecoratedMenuUiItem(menuItemModel=", this.f26182a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", badgeBackground=", this.d, ", badgeBackgroundTint=");
        axq.r(this.e, this.f, ", icon=", ", iconTint=", sbS);
        axq.r(this.g, this.h, ", iconBackgroundTint=", ", title=", sbS);
        f140.v(sbS, this.i, ", subtitle=", this.j, ", endIcon=");
        axq.r(this.k, this.l, ", background=", ", endIconColorFilter=", sbS);
        sbS.append(this.m);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
