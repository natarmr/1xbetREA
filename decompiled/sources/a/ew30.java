package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ew30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f8501a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;

    public ew30(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2) {
        w6x.y(r040Var, str, str2);
        this.f8501a = iz30Var;
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
        if (!(obj instanceof ew30)) {
            return false;
        }
        ew30 ew30Var = (ew30) obj;
        return this.f8501a == ew30Var.f8501a && this.b == ew30Var.b && this.c == ew30Var.c && this.d == ew30Var.d && Intrinsics.d(this.e, ew30Var.e) && Intrinsics.d(this.f, ew30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f8501a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f8501a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("SimpleMenuUiItem(menuItemModel=", this.f8501a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", title=");
        return ua80.m(sbS, this.e, ", subtitle=", this.f, Separators.RPAREN);
    }
}
