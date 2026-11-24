package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19304a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;
    public final int g;
    public final zvh0 h;
    public final boolean i;
    public final boolean j;

    public l2f(String str, boolean z, boolean z2, boolean z3, String str2, List list, int i, zvh0 zvh0Var, boolean z4, boolean z5) {
        list.getClass();
        this.f19304a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = list;
        this.g = i;
        this.h = zvh0Var;
        this.i = z4;
        this.j = z5;
    }

    public static l2f a(l2f l2fVar, String str, boolean z, boolean z2, String str2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = l2fVar.f19304a;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            z = l2fVar.b;
        }
        boolean z3 = z;
        boolean z4 = l2fVar.c;
        if ((i2 & 8) != 0) {
            z2 = l2fVar.d;
        }
        boolean z5 = z2;
        String str4 = (i2 & 16) != 0 ? l2fVar.e : str2;
        List list = l2fVar.f;
        int i3 = (i2 & 64) != 0 ? l2fVar.g : i;
        zvh0 zvh0Var = l2fVar.h;
        boolean z6 = l2fVar.i;
        boolean z7 = l2fVar.j;
        l2fVar.getClass();
        str3.getClass();
        list.getClass();
        return new l2f(str3, z3, z4, z5, str4, list, i3, zvh0Var, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f)) {
            return false;
        }
        l2f l2fVar = (l2f) obj;
        return this.f19304a.equals(l2fVar.f19304a) && this.b == l2fVar.b && this.c == l2fVar.c && this.d == l2fVar.d && Intrinsics.d(this.e, l2fVar.e) && Intrinsics.d(this.f, l2fVar.f) && this.g == l2fVar.g && this.h == l2fVar.h && this.i == l2fVar.i && this.j == l2fVar.j;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(brm0.e(this.f19304a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.j) + brm0.e((this.h.hashCode() + twn.a(this.g, dw9.a((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("CouponScannerState(couponId=", this.f19304a, ", isLoading=", this.b, ", isScanButtonVisible=");
        ua80.u(", isKeyboardVisible=", ", errorText=", sbU, this.c, this.d);
        cs0.y(this.e, ", segments=", ", selectedSegmentIndex=", sbU, this.f);
        sbU.append(this.g);
        sbU.append(", segmentedControlStyle=");
        sbU.append(this.h);
        sbU.append(", possibleGainEnabled=");
        return ohs0.p(", isNewEventParams=", Separators.RPAREN, sbU, this.i, this.j);
    }
}
