package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fxs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10326a;
    public final c280 b;
    public final d280 c;

    public fxs0(String str, c280 c280Var, c280 c280Var2) {
        this.f10326a = str;
        this.b = c280Var;
        this.c = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxs0)) {
            return false;
        }
        fxs0 fxs0Var = (fxs0) obj;
        return this.f10326a.equals(fxs0Var.f10326a) && this.b.equals(fxs0Var.b) && Intrinsics.d(this.c, fxs0Var.c);
    }

    public final int hashCode() {
        int iG = hne.g(this.b, this.f10326a.hashCode() * 31, 31);
        d280 d280Var = this.c;
        return iG + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "TwoPairsOpponentModel(name=", this.f10326a, ", teamLogoOne=", ", teamLogoTwo=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
