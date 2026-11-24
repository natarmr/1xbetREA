package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f1554a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;

    public aw30(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2) {
        w6x.y(r040Var, str, str2);
        this.f1554a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw30)) {
            return false;
        }
        aw30 aw30Var = (aw30) obj;
        return this.f1554a == aw30Var.f1554a && this.b == aw30Var.b && this.c == aw30Var.c && this.d == aw30Var.d && Intrinsics.d(this.e, aw30Var.e) && Intrinsics.d(this.f, aw30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f1554a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f1554a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("IndividualSimpleMenuUiItem(menuItemModel=", this.f1554a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", title=");
        return ua80.m(sbS, this.e, ", subtitle=", this.f, Separators.RPAREN);
    }
}
