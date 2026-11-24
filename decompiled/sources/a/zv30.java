package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f45037a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;

    public zv30(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2, int i2) {
        w6x.y(r040Var, str, str2);
        this.f45037a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv30)) {
            return false;
        }
        zv30 zv30Var = (zv30) obj;
        return this.f45037a == zv30Var.f45037a && this.b == zv30Var.b && this.c == zv30Var.c && this.d == zv30Var.d && Intrinsics.d(this.e, zv30Var.e) && Intrinsics.d(this.f, zv30Var.f) && this.g == zv30Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f45037a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f45037a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("IndividualEndIconMenuUiItem(menuItemModel=", this.f45037a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", endIcon=");
        return rz4.j(this.g, Separators.RPAREN, sbS);
    }
}
