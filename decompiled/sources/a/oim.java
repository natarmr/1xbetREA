package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oim implements qim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25319a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final gmm f;
    public final int g;
    public final a4x h;
    public final dxh0 i;
    public final String j;

    public oim(String str, boolean z, String str2, String str3, boolean z2, gmm gmmVar, int i, a4x a4xVar, dxh0 dxh0Var, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        gmmVar.getClass();
        a4xVar.getClass();
        this.f25319a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = gmmVar;
        this.g = i;
        this.h = a4xVar;
        this.i = dxh0Var;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oim)) {
            return false;
        }
        oim oimVar = (oim) obj;
        return Intrinsics.d(this.f25319a, oimVar.f25319a) && this.b == oimVar.b && Intrinsics.d(this.c, oimVar.c) && Intrinsics.d(this.d, oimVar.d) && this.e == oimVar.e && Intrinsics.d(this.f, oimVar.f) && this.g == oimVar.g && Intrinsics.d(this.h, oimVar.h) && Intrinsics.d(this.i, oimVar.i) && Intrinsics.d(this.j, oimVar.j);
    }

    public final int hashCode() {
        int iH = hne.h(this.i, cs0.b(this.h, twn.a(this.g, (this.f.hashCode() + brm0.e(ua80.b(ua80.b(brm0.e(this.f25319a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31), 31), 31);
        String str = this.j;
        return iH + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SmallHeaderSegments(navigationBarTitle=", this.f25319a, ", navigationBarSearchViewExpanded=", this.b, ", navigationBarSearchHint=");
        f140.v(sbU, this.c, ", navigationBarSearchQuery=", this.d, ", enableSearchAutoFocus=");
        sbU.append(this.e);
        sbU.append(", navigationBarRightStyle=");
        sbU.append(this.f);
        sbU.append(", currentTab=");
        sbU.append(this.g);
        sbU.append(", availableTabs=");
        sbU.append(this.h);
        sbU.append(", segmentedControlStyle=");
        sbU.append(this.i);
        sbU.append(", navigationBarSubtitle=");
        sbU.append(this.j);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
