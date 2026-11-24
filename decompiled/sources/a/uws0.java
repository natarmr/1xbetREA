package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36408a;
    public final int b;
    public final d280 c;

    public uws0(int i, d280 d280Var, String str) {
        str.getClass();
        this.f36408a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uws0)) {
            return false;
        }
        uws0 uws0Var = (uws0) obj;
        return Intrinsics.d(this.f36408a, uws0Var.f36408a) && this.b == uws0Var.b && Intrinsics.d(this.c, uws0Var.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f36408a.hashCode() * 31, 31);
        d280 d280Var = this.c;
        return iA + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "Default(opponentLabel=", this.f36408a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
