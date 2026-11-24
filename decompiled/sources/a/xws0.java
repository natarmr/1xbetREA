package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41626a;
    public final int b;
    public final d280 c;

    public xws0(int i, d280 d280Var, String str) {
        str.getClass();
        this.f41626a = str;
        this.b = i;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xws0)) {
            return false;
        }
        xws0 xws0Var = (xws0) obj;
        return Intrinsics.d(this.f41626a, xws0Var.f41626a) && this.b == xws0Var.b && this.c.equals(xws0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f41626a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "V3(opponentLabel=", this.f41626a, ", redCardCounter=", ", opponentIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
