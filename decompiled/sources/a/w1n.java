package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38410a;
    public final d280 b;
    public final d280 c;

    public w1n(String str, d280 d280Var, d280 d280Var2) {
        str.getClass();
        this.f38410a = str;
        this.b = d280Var;
        this.c = d280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1n)) {
            return false;
        }
        w1n w1nVar = (w1n) obj;
        return Intrinsics.d(this.f38410a, w1nVar.f38410a) && Intrinsics.d(this.b, w1nVar.b) && Intrinsics.d(this.c, w1nVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f38410a.hashCode() * 31;
        d280 d280Var = this.b;
        int iHashCode2 = (iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 31;
        d280 d280Var2 = this.c;
        return iHashCode2 + (d280Var2 != null ? d280Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DsSportEventCardTwoPairsDynamicTeamUiModel(name=" + this.f38410a + ", logoOne=" + this.b + ", logoTwo=" + this.c + Separators.RPAREN;
    }
}
