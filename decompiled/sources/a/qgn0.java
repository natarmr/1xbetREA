package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qgn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28695a;
    public final String b;
    public final dhn0 c;
    public final wul d;
    public final wul e;

    public qgn0(String str, String str2, dhn0 dhn0Var, wul wulVar, wul wulVar2) {
        this.f28695a = str;
        this.b = str2;
        this.c = dhn0Var;
        this.d = wulVar;
        this.e = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgn0)) {
            return false;
        }
        qgn0 qgn0Var = (qgn0) obj;
        return this.f28695a.equals(qgn0Var.f28695a) && this.b.equals(qgn0Var.b) && this.c.equals(qgn0Var.c) && this.d.equals(qgn0Var.d) && this.e.equals(qgn0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + i8i.a(this.d, (this.c.hashCode() + ua80.b(this.f28695a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SuccessBetAlertUiModel(title=", this.f28695a, ", subTitle=", this.b, ", betInfo=");
        sbN.append(this.c);
        sbN.append(", historyButton=");
        sbN.append(this.d);
        sbN.append(", continueButton=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
