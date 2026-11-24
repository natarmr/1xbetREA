package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zen0 implements a9a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44261a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final naa0 f;

    public zen0(String str, String str2, String str3, String str4, boolean z, naa0 naa0Var) {
        this.f44261a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = naa0Var;
    }

    @Override // a.a9a0
    public final String a() {
        return this.f44261a;
    }

    @Override // a.a9a0
    public final String b() {
        return this.d;
    }

    @Override // a.a9a0
    public final naa0 c() {
        return this.f;
    }

    @Override // a.a9a0
    public final String d() {
        return this.c;
    }

    @Override // a.a9a0
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zen0)) {
            return false;
        }
        zen0 zen0Var = (zen0) obj;
        return this.f44261a.equals(zen0Var.f44261a) && this.b.equals(zen0Var.b) && this.c.equals(zen0Var.c) && this.d.equals(zen0Var.d) && this.e == zen0Var.e && this.f.equals(zen0Var.f);
    }

    @Override // a.a9a0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(this.f44261a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SubstitutePlayerModel(playerId=", this.f44261a, ", name=", this.b, ", logo=");
        f140.v(sbN, this.c, ", playerType=", this.d, ", hasMarkets=");
        sbN.append(this.e);
        sbN.append(", playerRoleModel=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
