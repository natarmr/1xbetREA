package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class prj0 {
    public static final pn20 j = new pn20(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27469a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;

    public prj0(String str, String str2, String str3, boolean z, boolean z2, float f, float f2, int i, int i2) {
        brm0.B(str, str2, str3);
        this.f27469a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = f;
        this.g = f2;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prj0)) {
            return false;
        }
        prj0 prj0Var = (prj0) obj;
        return Intrinsics.d(this.f27469a, prj0Var.f27469a) && Intrinsics.d(this.b, prj0Var.b) && Intrinsics.d(this.c, prj0Var.c) && this.d == prj0Var.d && this.e == prj0Var.e && Float.compare(this.f, prj0Var.f) == 0 && Float.compare(this.g, prj0Var.g) == 0 && this.h == prj0Var.h && this.i == prj0Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + twn.a(this.h, defpackage.c.a(defpackage.c.a(brm0.e(brm0.e(ua80.b(ua80.b(this.f27469a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShortInfoUiItem(name=", this.f27469a, ", teamOneStat=", this.b, ", teamTwoStat=");
        brm0.C(this.c, ", justTeamOneStatExist=", ", justTeamTwoStatExist=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", weightTeamOneView=");
        sbN.append(this.f);
        sbN.append(", weightTeamTwoView=");
        sbN.append(this.g);
        sbN.append(", teamOneViewBackgroundId=");
        sbN.append(this.h);
        sbN.append(", teamTwoViewBackgroundId=");
        return rz4.j(this.i, Separators.RPAREN, sbN);
    }
}
