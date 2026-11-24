package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class f2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8803a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public f2a0(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.f8803a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2a0)) {
            return false;
        }
        f2a0 f2a0Var = (f2a0) obj;
        if (!this.f8803a.equals(f2a0Var.f8803a) || !this.b.equals(f2a0Var.b) || !this.c.equals(f2a0Var.c) || !this.d.equals(f2a0Var.d) || !this.e.equals(f2a0Var.e)) {
            return false;
        }
        long j = f2a0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j) && h2t0.a(this.g, f2a0Var.g);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(this.f8803a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.g) + rw2.b(iB, 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        String strI2 = y3d.i(this.g);
        StringBuilder sbN = b1j.n("PlayerDuelInfoUiModel(fullName=", this.f8803a, ", nickName=", this.b, ", teamName=");
        f140.v(sbN, this.c, ", teamLogo=", this.d, ", playerImage=");
        f140.v(sbN, this.e, ", playerBgColor=", strI, ", playerBorderColor=");
        return axq.n(sbN, strI2, Separators.RPAREN);
    }
}
