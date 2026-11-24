package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mqn0 implements nqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22234a;
    public final String b;
    public final String c;

    public mqn0(String str, String str2, String str3) {
        this.f22234a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqn0)) {
            return false;
        }
        mqn0 mqn0Var = (mqn0) obj;
        return this.f22234a.equals(mqn0Var.f22234a) && this.b.equals(mqn0Var.b) && this.c.equals(mqn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f22234a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("UpdateBetSettings(betSum=", this.f22234a, ", betCurrency=", this.b, ", balance="), this.c, Separators.RPAREN);
    }
}
