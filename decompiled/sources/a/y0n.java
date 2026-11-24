package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41815a;
    public final int b;
    public final d280 c;

    public y0n(int i, d280 d280Var, String str) {
        str.getClass();
        this.f41815a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0n)) {
            return false;
        }
        y0n y0nVar = (y0n) obj;
        return Intrinsics.d(this.f41815a, y0nVar.f41815a) && this.b == y0nVar.b && Intrinsics.d(this.c, y0nVar.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f41815a.hashCode() * 31, 31);
        d280 d280Var = this.c;
        return iA + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Default(opponentLabel=", this.f41815a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
