package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f31153a;
    public final boolean b;
    public final r040 c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;
    public final bzw l;

    public rv30(iz30 iz30Var, boolean z, r040 r040Var, long j, int i, long j2, long j3, String str, String str2, int i2, List list, bzw bzwVar) {
        r040Var.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f31153a = iz30Var;
        this.b = z;
        this.c = r040Var;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = str2;
        this.j = i2;
        this.k = list;
        this.l = bzwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv30)) {
            return false;
        }
        rv30 rv30Var = (rv30) obj;
        if (this.f31153a != rv30Var.f31153a || this.b != rv30Var.b || this.c != rv30Var.c) {
            return false;
        }
        long j = rv30Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && this.e == rv30Var.e && h2t0.a(this.f, rv30Var.f) && h2t0.a(this.g, rv30Var.g) && Intrinsics.d(this.h, rv30Var.h) && Intrinsics.d(this.i, rv30Var.i) && this.j == rv30Var.j && Intrinsics.d(this.k, rv30Var.k) && this.l == rv30Var.l;
    }

    public final int hashCode() {
        int iF = w6x.f(this.c, brm0.e(this.f31153a.hashCode() * 31, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iA = dw9.a(twn.a(this.j, ua80.b(ua80.b(rw2.b(rw2.b(twn.a(this.e, rw2.b(iF, 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k);
        bzw bzwVar = this.l;
        return iA + (bzwVar == null ? 0 : bzwVar.hashCode());
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.f31153a;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.f);
        String strI3 = y3d.i(this.g);
        StringBuilder sbS = w6x.s("DecoratedMenuUiItem(menuItemModel=", this.f31153a, ", isBadgeVisible=", this.b, ", menuSectionType=");
        sbS.append(this.c);
        sbS.append(", badgeBackgroundTint=");
        sbS.append(strI);
        sbS.append(", iconResId=");
        kng0.w(this.e, ", iconTint=", strI2, ", iconBackgroundTint=", sbS);
        f140.v(sbS, strI3, ", title=", this.h, ", subtitle=");
        twn.w(this.j, this.i, ", endIcon=", ", backgroundGradientColors=", sbS);
        sbS.append(this.k);
        sbS.append(", endIconBlendMode=");
        sbS.append(this.l);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
