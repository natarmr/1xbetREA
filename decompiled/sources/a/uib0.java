package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35723a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public uib0(boolean z, boolean z2, List list, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str) {
        list.getClass();
        this.f35723a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = str;
    }

    public static uib0 a(uib0 uib0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = uib0Var.f35723a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = uib0Var.b;
        }
        boolean z7 = z2;
        List list = uib0Var.c;
        boolean z8 = (i & 8) != 0 ? uib0Var.d : z3;
        boolean z9 = (i & 16) != 0 ? uib0Var.e : z4;
        boolean z10 = (i & 32) != 0 ? uib0Var.f : z5;
        boolean z11 = uib0Var.g;
        boolean z12 = uib0Var.h;
        boolean z13 = uib0Var.i;
        boolean z14 = uib0Var.j;
        String str = uib0Var.k;
        uib0Var.getClass();
        list.getClass();
        return new uib0(z6, z7, list, z8, z9, z10, z11, z12, z13, z14, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uib0)) {
            return false;
        }
        uib0 uib0Var = (uib0) obj;
        return this.f35723a == uib0Var.f35723a && this.b == uib0Var.b && Intrinsics.d(this.c, uib0Var.c) && this.d == uib0Var.d && this.e == uib0Var.e && this.f == uib0Var.f && this.g == uib0Var.g && this.h == uib0Var.h && this.i == uib0Var.i && this.j == uib0Var.j && this.k.equals(uib0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(dw9.a(brm0.e(Boolean.hashCode(this.f35723a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PopularSettingsState(isPersonalizationAvailable=", ", personalizationChecked=", ", personalizationAllowedGeoIdList=", this.f35723a, this.b);
        rz4.z(sbQ, ", sportsBandChecked=", this.c, ", bannersBandChecked=", this.d);
        ua80.u(", oneXGamesBandChecked=", ", bannerBandEnable=", sbQ, this.e, this.f);
        ua80.u(", oneXGamesBandEnable=", ", isBannerEnable=", sbQ, this.g, this.h);
        ua80.u(", isBettingDisable=", ", xGameName=", sbQ, this.i, this.j);
        return axq.n(sbQ, this.k, Separators.RPAREN);
    }
}
