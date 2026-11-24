package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cca0 f30583a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public rja0(cca0 cca0Var, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6) {
        this.f30583a = cca0Var;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = z6;
    }

    public static rja0 a(rja0 rja0Var, cca0 cca0Var, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, int i2) {
        if ((i2 & 1) != 0) {
            cca0Var = rja0Var.f30583a;
        }
        cca0 cca0Var2 = cca0Var;
        if ((i2 & 2) != 0) {
            z = rja0Var.b;
        }
        boolean z7 = z;
        if ((i2 & 4) != 0) {
            i = rja0Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = rja0Var.d;
        }
        boolean z8 = z2;
        if ((i2 & 16) != 0) {
            z3 = rja0Var.e;
        }
        boolean z9 = z3;
        boolean z10 = (i2 & 32) != 0 ? rja0Var.f : z4;
        boolean z11 = (i2 & 64) != 0 ? rja0Var.g : z5;
        String str2 = (i2 & 128) != 0 ? rja0Var.h : str;
        boolean z12 = (i2 & 256) != 0 ? rja0Var.i : z6;
        rja0Var.getClass();
        str2.getClass();
        return new rja0(cca0Var2, z7, i3, z8, z9, z10, z11, str2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rja0)) {
            return false;
        }
        rja0 rja0Var = (rja0) obj;
        return Intrinsics.d(this.f30583a, rja0Var.f30583a) && this.b == rja0Var.b && this.c == rja0Var.c && this.d == rja0Var.d && this.e == rja0Var.e && this.f == rja0Var.f && this.g == rja0Var.g && this.h.equals(rja0Var.h) && this.i == rja0Var.i;
    }

    public final int hashCode() {
        cca0 cca0Var = this.f30583a;
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(brm0.e(brm0.e(brm0.e(twn.a(this.c, brm0.e((cca0Var == null ? 0 : cca0Var.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayersStatisticState(playerTennisMenuModel=");
        sb.append(this.f30583a);
        sb.append(", isPair=");
        sb.append(this.b);
        sb.append(", currentTab=");
        brm0.w(this.c, ", isSinglePlayer=", ", isLoading=", sb, this.d);
        ua80.u(", isError=", ", isEmpty=", sb, this.e, this.f);
        f140.s(", singleIdPlayer=", this.h, ", isNightTheme=", sb, this.g);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
