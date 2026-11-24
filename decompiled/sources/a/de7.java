package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;

/* JADX INFO: loaded from: classes3.dex */
public final class de7 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5934a;
    public final String b;
    public final BetZip c;
    public final boolean d;
    public final String e;
    public final zq20 f;
    public final byte g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final boolean l;
    public final chl0 m;

    /* JADX WARN: Multi-variable type inference failed */
    public de7(long j, String str, BetZip betZip, boolean z, String str2, zq20 zq20Var, int i, int i2, int i3, int i4, float f, boolean z2, chl0 chl0Var) {
        str.getClass();
        this.f5934a = j;
        this.b = str;
        this.c = betZip;
        this.d = z;
        this.e = str2;
        this.f = zq20Var;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = f;
        this.l = z2;
        this.m = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de7)) {
            return false;
        }
        de7 de7Var = (de7) obj;
        return this.f5934a == de7Var.f5934a && Intrinsics.d(this.b, de7Var.b) && Intrinsics.d(this.c, de7Var.c) && this.d == de7Var.d && this.e.equals(de7Var.e) && this.f == de7Var.f && this.g == de7Var.g && this.h == de7Var.h && this.i == de7Var.i && this.j == de7Var.j && Float.compare(this.k, de7Var.k) == 0 && this.l == de7Var.l && Intrinsics.d(this.m, de7Var.m);
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f5934a) * 31, 31, this.b);
        BetZip betZip = this.c;
        int iE = brm0.e(defpackage.c.a(twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, (this.f.hashCode() + ua80.b(brm0.e((iB + (betZip == null ? 0 : betZip.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31), 31), 31), 31), this.k, 31), 31, this.l);
        chl0 chl0Var = this.m;
        return iE + (chl0Var != null ? chl0Var.hashCode() : 0);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof de7) || !(p6t0Var2 instanceof de7)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        de7 de7Var = (de7) p6t0Var;
        de7 de7Var2 = (de7) p6t0Var2;
        k9x.G(linkedHashSet, new xd7(de7Var.b), new xd7(de7Var2.b));
        k9x.G(linkedHashSet, new yd7(de7Var.e), new yd7(de7Var2.e));
        k9x.G(linkedHashSet, new zd7(de7Var.h), new zd7(de7Var2.h));
        k9x.G(linkedHashSet, new wd7(de7Var.k), new wd7(de7Var2.k));
        k9x.G(linkedHashSet, new ae7(de7Var.i), new ae7(de7Var2.i));
        k9x.G(linkedHashSet, new ce7(de7Var.j), new ce7(de7Var2.j));
        k9x.G(linkedHashSet, new be7(de7Var.l), new be7(de7Var2.l));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("BetTitle(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Coefficient(value=", this.e, Separators.RPAREN);
        String strE = ua80.e(this.h, "CoefficientColor(value=", Separators.RPAREN);
        String strE2 = ua80.e(this.i, "IsBlockedIcon(value=", Separators.RPAREN);
        String strE3 = ua80.e(this.j, "IsTrackedIcon(value=", Separators.RPAREN);
        String strJ = rw2.j(this.k, "Alpha(value=", Separators.RPAREN);
        String strD = defpackage.c.d("IsClickable(value=", Separators.RPAREN, this.l);
        StringBuilder sbO = axq.o(this.f5934a, "BetItemUiModel(id=", ", betTitle=", strL);
        sbO.append(", betZip=");
        sbO.append(this.c);
        sbO.append(", isBetEmpty=");
        sbO.append(this.d);
        sbO.append(", coefficient=");
        sbO.append(strL2);
        sbO.append(", extraMarginDirection=");
        sbO.append(this.f);
        w6x.w(this.g, ", rowCapacity=", ", coefficientColor=", strE, sbO);
        f140.v(sbO, ", isBlockedIcon=", strE2, ", isTrackedIcon=", strE3);
        f140.v(sbO, ", alpha=", strJ, ", isClickable=", strD);
        sbO.append(", model=");
        sbO.append(this.m);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
