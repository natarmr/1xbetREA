package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kda0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18096a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public kda0(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f18096a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kda0)) {
            return false;
        }
        kda0 kda0Var = (kda0) obj;
        return this.f18096a.equals(kda0Var.f18096a) && this.b.equals(kda0Var.b) && this.c.equals(kda0Var.c) && this.d.equals(kda0Var.d) && this.e.equals(kda0Var.e) && this.f == kda0Var.f && this.g == kda0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + twn.a(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f18096a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerTransfersPlayerModel(nickname=", this.f18096a, ", realName=", this.b, ", country=");
        f140.v(sbN, this.c, ", playerImageS3=", this.d, ", flagImageS3=");
        twn.w(this.f, this.e, ", totalWinnings=", ", lngSideLeft=", sbN);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
