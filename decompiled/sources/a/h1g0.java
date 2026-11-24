package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h1g0 implements j1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12282a;
    public final String b;
    public final jwm c;

    public h1g0(String str, String str2, jwm jwmVar) {
        str2.getClass();
        this.f12282a = str;
        this.b = str2;
        this.c = jwmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1g0)) {
            return false;
        }
        h1g0 h1g0Var = (h1g0) obj;
        return this.f12282a.equals(h1g0Var.f12282a) && Intrinsics.d(this.b, h1g0Var.b) && this.c.equals(h1g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12282a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f12282a, ", oneLabelInfo=", this.b, ", twoLabelInfo=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
