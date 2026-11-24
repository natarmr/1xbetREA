package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kxb0 implements lxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19047a;
    public final String b;
    public final String c;
    public final String d;
    public final v12 e;
    public final String f;

    public kxb0(String str, String str2, String str3, String str4, v12 v12Var) {
        this.f19047a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = v12Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxb0)) {
            return false;
        }
        kxb0 kxb0Var = (kxb0) obj;
        return this.f19047a.equals(kxb0Var.f19047a) && this.b.equals(kxb0Var.b) && this.c.equals(kxb0Var.c) && this.d.equals(kxb0Var.d) && this.e == kxb0Var.e;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f19047a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PrizeDistributionUiModel(place=", this.f19047a, ", logo=", this.b, ", teamName=");
        f140.v(sbN, this.c, ", prize=", this.d, ", alignmentInSection=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
