package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pud0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27611a;
    public final String b;
    public final String c;
    public final String d;
    public final oud0 e;
    public final nud0 f;

    public pud0(String str, String str2, String str3, String str4, oud0 oud0Var, nud0 nud0Var) {
        this.f27611a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = oud0Var;
        this.f = nud0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pud0)) {
            return false;
        }
        pud0 pud0Var = (pud0) obj;
        return this.f27611a.equals(pud0Var.f27611a) && this.b.equals(pud0Var.b) && this.c.equals(pud0Var.c) && this.d.equals(pud0Var.d) && this.e == pud0Var.e && this.f == pud0Var.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f27611a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f27611a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RainbowBansDetailsUiModel(key=", this.f27611a, ", teamImage=", this.b, ", playerImage=");
        f140.v(sbN, this.c, ", playerName=", this.d, ", detailsType=");
        sbN.append(this.e);
        sbN.append(", cardType=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
