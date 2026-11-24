package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f38079a;
    public final boolean b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;

    public vv30(iz30 iz30Var, boolean z, r040 r040Var, int i, String str, String str2, boolean z2) {
        w6x.y(r040Var, str, str2);
        this.f38079a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv30)) {
            return false;
        }
        vv30 vv30Var = (vv30) obj;
        return this.f38079a == vv30Var.f38079a && this.b == vv30Var.b && this.c == vv30Var.c && this.d == vv30Var.d && Intrinsics.d(this.e, vv30Var.e) && Intrinsics.d(this.f, vv30Var.f) && this.g == vv30Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + twn.a(R.drawable.ic_status_green_check_circle, ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, brm0.e(this.f38079a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f38079a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbS = w6x.s("IndividualAuthenticationMenuUiItem(menuItemModel=", this.f38079a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        f140.t(sbS, this.c, ", iconResId=", this.d, ", title=");
        f140.v(sbS, this.e, ", subtitle=", this.f, ", subtitleIcon=");
        return ohs0.k(R.drawable.ic_status_green_check_circle, ", subtitleIconVisible=", Separators.RPAREN, sbS, this.g);
    }
}
