package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l120 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19227a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public l120(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        this.f19227a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static l120 a(l120 l120Var, String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str2 = l120Var.f19227a;
        String str3 = l120Var.b;
        if ((i & 4) != 0) {
            str = l120Var.c;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            z = l120Var.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = l120Var.e;
        }
        boolean z6 = z2;
        boolean z7 = l120Var.f;
        if ((i & 64) != 0) {
            z3 = l120Var.g;
        }
        boolean z8 = z3;
        if ((i & 128) != 0) {
            z4 = l120Var.h;
        }
        l120Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new l120(str2, str3, str4, z5, z6, z7, z8, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l120)) {
            return false;
        }
        l120 l120Var = (l120) obj;
        return Intrinsics.d(this.f19227a, l120Var.f19227a) && Intrinsics.d(this.b, l120Var.b) && this.c.equals(l120Var.c) && this.d == l120Var.d && this.e == l120Var.e && this.f == l120Var.f && this.g == l120Var.g && this.h == l120Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e(brm0.e(ua80.b(ua80.b(this.f19227a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MainToolbarState(title=", this.f19227a, ", searchHint=", this.b, ", searchQuery=");
        brm0.C(this.c, ", stockVisible=", ", stockWithFire=", sbN, this.d);
        ua80.u(", searchVisible=", ", searchCollapsed=", sbN, this.e, this.f);
        return ohs0.p(", calendarVisible=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
