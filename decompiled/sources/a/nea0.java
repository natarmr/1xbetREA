package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23377a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public nea0(String str, String str2, String str3, String str4, String str5) {
        this.f23377a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nea0)) {
            return false;
        }
        nea0 nea0Var = (nea0) obj;
        return this.f23377a.equals(nea0Var.f23377a) && this.b.equals(nea0Var.b) && this.c.equals(nea0Var.c) && this.d.equals(nea0Var.d) && this.e.equals(nea0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f23377a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerUiModel(number=", this.f23377a, ", name=", this.b, ", imageUrl=");
        f140.v(sbN, this.c, ", id=", this.d, ", numberName=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
