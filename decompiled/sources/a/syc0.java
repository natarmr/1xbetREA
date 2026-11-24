package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class syc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f33019a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public syc0(pz40 pz40Var, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f33019a = pz40Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public static syc0 a(syc0 syc0Var, pz40 pz40Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            pz40Var = syc0Var.f33019a;
        }
        pz40 pz40Var2 = pz40Var;
        String str = syc0Var.b;
        String str2 = syc0Var.c;
        if ((i & 16) != 0) {
            z = syc0Var.d;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = syc0Var.e;
        }
        str.getClass();
        return new syc0(pz40Var2, str, str2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syc0)) {
            return false;
        }
        syc0 syc0Var = (syc0) obj;
        return this.f33019a.equals(syc0Var.f33019a) && Intrinsics.d(this.b, syc0Var.b) && Intrinsics.d(this.c, syc0Var.c) && this.d == syc0Var.d && this.e == syc0Var.e;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f33019a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((iB + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromocodeFieldState(promocodeValue=");
        sb.append(this.f33019a);
        sb.append(", promocodeValuePlaceholder=");
        sb.append(this.b);
        sb.append(", promocodeSupportingText=");
        brm0.C(this.c, ", isVisibleActionButton=true, isActivatedButton=", ", isVisibleBadge=", sb, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
