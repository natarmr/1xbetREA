package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f17233a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    public jw30(int i, iz30 iz30Var, r040 r040Var, String str, String str2, String str3, boolean z) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f17233a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw30)) {
            return false;
        }
        jw30 jw30Var = (jw30) obj;
        return this.f17233a == jw30Var.f17233a && this.b == jw30Var.b && this.c == jw30Var.c && this.d == jw30Var.d && Intrinsics.d(this.e, jw30Var.e) && Intrinsics.d(this.f, jw30Var.f) && Intrinsics.d(this.g, jw30Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f17233a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f17233a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("UfcEndIconMenuUiItem(menuItemModel=", this.f17233a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", endIconUrl=");
        return axq.n(sbS, this.g, Separators.RPAREN);
    }
}
