package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4165a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final long i;
    public final long j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final xck0 n;
    public final boolean o;

    public cdk0(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, long j, long j2, String str8, boolean z2, boolean z3, xck0 xck0Var, boolean z4) {
        str.getClass();
        str2.getClass();
        this.f4165a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = j;
        this.j = j2;
        this.k = str8;
        this.l = z2;
        this.m = z3;
        this.n = xck0Var;
        this.o = z4;
    }

    public static cdk0 a(cdk0 cdk0Var, String str, String str2, String str3, boolean z, boolean z2, xck0 xck0Var, boolean z3, int i) {
        String str4 = cdk0Var.f4165a;
        String str5 = cdk0Var.b;
        String str6 = (i & 4) != 0 ? cdk0Var.c : str;
        String str7 = (i & 8) != 0 ? cdk0Var.d : str2;
        String str8 = cdk0Var.e;
        String str9 = str6;
        String str10 = str7;
        String str11 = cdk0Var.f;
        String str12 = (i & 64) != 0 ? cdk0Var.g : str3;
        boolean z4 = cdk0Var.h;
        String str13 = str12;
        long j = cdk0Var.i;
        long j2 = cdk0Var.j;
        String str14 = cdk0Var.k;
        boolean z5 = (i & 2048) != 0 ? cdk0Var.l : z;
        boolean z6 = (i & 4096) != 0 ? cdk0Var.m : z2;
        xck0 xck0Var2 = (i & 8192) != 0 ? cdk0Var.n : xck0Var;
        boolean z7 = (i & 16384) != 0 ? cdk0Var.o : z3;
        cdk0Var.getClass();
        str4.getClass();
        str5.getClass();
        return new cdk0(str4, str5, str9, str10, str8, str11, str13, z4, j, j2, str14, z5, z6, xck0Var2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdk0)) {
            return false;
        }
        cdk0 cdk0Var = (cdk0) obj;
        return Intrinsics.d(this.f4165a, cdk0Var.f4165a) && Intrinsics.d(this.b, cdk0Var.b) && this.c.equals(cdk0Var.c) && this.d.equals(cdk0Var.d) && this.e.equals(cdk0Var.e) && this.f.equals(cdk0Var.f) && this.g.equals(cdk0Var.g) && this.h == cdk0Var.h && this.i == cdk0Var.i && this.j == cdk0Var.j && this.k.equals(cdk0Var.k) && this.l == cdk0Var.l && this.m == cdk0Var.m && this.n.equals(cdk0Var.n) && this.o == cdk0Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + brm0.e(brm0.e(ua80.b(rw2.b(rw2.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f4165a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SmsSendState(title=", this.f4165a, ", codeLabel=", this.b, ", code=");
        f140.v(sbN, this.c, ", codeErrorMessage=", this.d, ", requestCode=");
        f140.v(sbN, this.e, ", initialGuid=", this.f, ", currentGuid=");
        brm0.C(this.g, ", payInOut=", ", balanceId=", sbN, this.h);
        sbN.append(this.i);
        kng0.A(sbN, ", productId=", this.j, ", amount=");
        brm0.C(this.k, ", isLoading=", ", isConfirmEnabled=", sbN, this.l);
        sbN.append(this.m);
        sbN.append(", resendState=");
        sbN.append(this.n);
        sbN.append(", autoFocus=");
        return rw2.p(sbN, this.o, Separators.RPAREN);
    }
}
