package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qxv implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29507a;
    public final int b;
    public final uxv c;
    public final uxv d;
    public final boolean e;

    public qxv(int i, int i2, uxv uxvVar, uxv uxvVar2, boolean z) {
        this.f29507a = i;
        this.b = i2;
        this.c = uxvVar;
        this.d = uxvVar2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxv)) {
            return false;
        }
        qxv qxvVar = (qxv) obj;
        return this.f29507a == qxvVar.f29507a && this.b == qxvVar.b && this.c.equals(qxvVar.c) && this.d.equals(qxvVar.d) && this.e == qxvVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f29507a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("HigherVsLowerModel(firstPlayerScore=", this.f29507a, ", secondPlayerScore=", ", firstPlayerRoundScore=", this.b);
        sbT.append(this.c);
        sbT.append(", secondPlayerRoundScore=");
        sbT.append(this.d);
        sbT.append(", gameIsFinish=");
        return rw2.p(sbT, this.e, Separators.RPAREN);
    }
}
