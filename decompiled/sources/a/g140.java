package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f10492a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;

    public g140(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2, int i2, boolean z2) {
        w6x.y(r040Var, str, str2);
        this.f10492a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = z2;
    }

    @Override // a.f240
    public final boolean K() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g140)) {
            return false;
        }
        g140 g140Var = (g140) obj;
        return this.f10492a == g140Var.f10492a && this.b == g140Var.b && this.c == g140Var.c && this.d == g140Var.d && Intrinsics.d(this.e, g140Var.e) && Intrinsics.d(this.f, g140Var.f) && this.g == g140Var.g && this.h == g140Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + twn.a(this.g, ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f10492a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.f10492a;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("AuthenticationMenuUiItem(menuItemModel=", this.f10492a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", icon=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", subtitleIcon=");
        return ohs0.k(this.g, ", subtitleIconVisible=", Separators.RPAREN, sbS, this.h);
    }
}
