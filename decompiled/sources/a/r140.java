package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f29659a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;

    public r140(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2, int i2) {
        w6x.y(r040Var, str, str2);
        this.f29659a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = i2;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r140)) {
            return false;
        }
        r140 r140Var = (r140) obj;
        return this.f29659a == r140Var.f29659a && this.b == r140Var.b && this.c == r140Var.c && this.d == r140Var.d && Intrinsics.d(this.e, r140Var.e) && Intrinsics.d(this.f, r140Var.f) && this.g == r140Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f29659a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f29659a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("IndividualEndIconMenuUiItem(menuItemModel=", this.f29659a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", endIcon=");
        return rz4.j(this.g, Separators.RPAREN, sbS);
    }
}
