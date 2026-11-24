package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34580a;
    public final r040 b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final long i;

    public tv30(boolean z, r040 r040Var, int i, long j, long j2, String str, String str2, int i2, long j3) {
        htz htzVar = iz30.f15618a;
        w6x.y(r040Var, str, str2);
        this.f34580a = z;
        this.b = r040Var;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i2;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv30)) {
            return false;
        }
        tv30 tv30Var = (tv30) obj;
        htz htzVar = iz30.f15618a;
        if (this.f34580a != tv30Var.f34580a || this.b != tv30Var.b || this.c != tv30Var.c) {
            return false;
        }
        long j = tv30Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, tv30Var.e) && Intrinsics.d(this.f, tv30Var.f) && Intrinsics.d(this.g, tv30Var.g) && this.h == tv30Var.h && h2t0.a(this.i, tv30Var.i);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, w6x.f(this.b, brm0.e(iz30.t.hashCode() * 31, 31, this.f34580a), 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.i) + twn.a(this.h, ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    @Override // a.nw30
    public final iz30 m() {
        return iz30.t;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.b;
    }

    public final String toString() {
        iz30 iz30Var = iz30.t;
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        String strI3 = y3d.i(this.i);
        StringBuilder sbS = w6x.s("DecoratedVirtualTintMenuUiItem(menuItemModel=", iz30Var, ", isBadgeVisible=", this.f34580a, ", menuSectionType=");
        f140.t(sbS, this.b, ", iconResId=", this.c, ", iconTint=");
        f140.v(sbS, strI, ", iconBackgroundTint=", strI2, ", title=");
        f140.v(sbS, this.f, ", subtitle=", this.g, ", endIcon=");
        return rw2.k(this.h, ", backgroundTint=", strI3, Separators.RPAREN, sbS);
    }
}
