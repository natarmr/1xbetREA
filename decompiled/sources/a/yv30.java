package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f43300a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final int i;
    public final long j;

    public yv30(iz30 iz30Var, boolean z, r040 r040Var, int i, long j, long j2, String str, String str2, int i2, long j3) {
        w6x.y(r040Var, str, str2);
        this.f43300a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = str2;
        this.i = i2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv30)) {
            return false;
        }
        yv30 yv30Var = (yv30) obj;
        if (this.f43300a != yv30Var.f43300a || this.b != yv30Var.b || this.c != yv30Var.c || this.d != yv30Var.d) {
            return false;
        }
        long j = yv30Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, yv30Var.f) && Intrinsics.d(this.g, yv30Var.g) && Intrinsics.d(this.h, yv30Var.h) && this.i == yv30Var.i && h2t0.a(this.j, yv30Var.j);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, w6x.f(this.c, brm0.e(this.f43300a.hashCode() * 31, 31, this.b), 31), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.j) + twn.a(this.i, ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f43300a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        String strI3 = y3d.i(this.j);
        StringBuilder sbS = w6x.s("IndividualDecoratedTintMenuUiItem(menuItemModel=", this.f43300a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", iconTint=");
        f140.v(sbS, strI, ", iconBackgroundTint=", strI2, ", title=");
        f140.v(sbS, this.g, ", subtitle=", this.h, ", endIcon=");
        return rw2.k(this.i, ", backgroundTint=", strI3, Separators.RPAREN, sbS);
    }
}
