package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b1g0 implements d1g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1804a;
    public final String b;
    public final jwm c;

    public b1g0(String str, String str2, jwm jwmVar) {
        str2.getClass();
        this.f1804a = str;
        this.b = str2;
        this.c = jwmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1g0)) {
            return false;
        }
        b1g0 b1g0Var = (b1g0) obj;
        return this.f1804a.equals(b1g0Var.f1804a) && Intrinsics.d(this.b, b1g0Var.b) && this.c.equals(b1g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f1804a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("OneOpponent(opponentName=", this.f1804a, ", oneLabelInfo=", this.b, ", twoLabelInfo=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
