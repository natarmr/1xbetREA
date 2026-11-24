package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17228a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ax0 l;

    public jw0(String str, String str2, String str3, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ax0 ax0Var) {
        brm0.B(str, str2, str3);
        this.f17228a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = ax0Var;
    }

    public static jw0 a(jw0 jw0Var, boolean z, boolean z2, boolean z3, ax0 ax0Var, int i) {
        String str = jw0Var.f17228a;
        String str2 = jw0Var.b;
        String str3 = jw0Var.c;
        boolean z4 = jw0Var.d;
        long j = jw0Var.e;
        long j2 = jw0Var.f;
        boolean z5 = jw0Var.g;
        boolean z6 = (i & 128) != 0 ? jw0Var.h : z;
        boolean z7 = (i & 256) != 0 ? jw0Var.i : z2;
        boolean z8 = (i & 512) != 0 ? jw0Var.j : z3;
        boolean z9 = (i & 1024) != 0 ? jw0Var.k : false;
        ax0 ax0Var2 = (i & 2048) != 0 ? jw0Var.l : ax0Var;
        jw0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        ax0Var2.getClass();
        return new jw0(str, str2, str3, z4, j, j2, z5, z6, z7, z8, z9, ax0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        return Intrinsics.d(this.f17228a, jw0Var.f17228a) && Intrinsics.d(this.b, jw0Var.b) && Intrinsics.d(this.c, jw0Var.c) && this.d == jw0Var.d && this.e == jw0Var.e && this.f == jw0Var.f && this.g == jw0Var.g && this.h == jw0Var.h && this.i == jw0Var.i && this.j == jw0Var.j && this.k == jw0Var.k && this.l.equals(jw0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(brm0.e(rw2.b(rw2.b(brm0.e(ua80.b(ua80.b(this.f17228a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorGameStateModel(title=", this.f17228a, ", gameUrl=", this.b, ", lobbyUrl=");
        brm0.C(this.c, ", paymentEnabled=", ", balanceId=", sbN, this.d);
        sbN.append(this.e);
        kng0.A(sbN, ", productId=", this.f, ", debugAllowed=");
        ua80.u(", isAlreadyShownUnknownError=", ", isLoading=", sbN, this.g, this.h);
        ua80.u(", disabledHandleAction=", ", taxInfoVisible=", sbN, this.i, this.j);
        sbN.append(this.k);
        sbN.append(", aggregatorGameWebViewState=");
        sbN.append(this.l);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
