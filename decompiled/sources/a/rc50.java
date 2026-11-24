package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30222a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;

    public rc50(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        str3.getClass();
        this.f30222a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
    }

    public static rc50 a(rc50 rc50Var, boolean z, boolean z2, boolean z3, String str, int i) {
        if ((i & 1) != 0) {
            z = rc50Var.f30222a;
        }
        boolean z4 = z;
        String str2 = rc50Var.b;
        if ((i & 4) != 0) {
            z2 = rc50Var.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = rc50Var.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            str = rc50Var.e;
        }
        String str3 = str;
        String str4 = rc50Var.f;
        str3.getClass();
        str4.getClass();
        return new rc50(str2, str3, str4, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc50)) {
            return false;
        }
        rc50 rc50Var = (rc50) obj;
        return this.f30222a == rc50Var.f30222a && this.b.equals(rc50Var.b) && this.c == rc50Var.c && this.d == rc50Var.d && this.e.equals(rc50Var.e) && Intrinsics.d(this.f, rc50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.e(brm0.e(ua80.b(Boolean.hashCode(this.f30222a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("NavigationBarStateModel(searchAvailable=", ", navigationBarTitle=", this.b, this.f30222a, ", isSearchActive=");
        ua80.u(", searchFocused=", ", searchString=", sbQ, this.c, this.d);
        return ua80.m(sbQ, this.e, ", placeholder=", this.f, Separators.RPAREN);
    }
}
