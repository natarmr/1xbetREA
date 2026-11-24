package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3476a;
    public final c280 b;
    public final d280 c;

    public bzm(String str, c280 c280Var, c280 c280Var2) {
        str.getClass();
        this.f3476a = str;
        this.b = c280Var;
        this.c = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzm)) {
            return false;
        }
        bzm bzmVar = (bzm) obj;
        return Intrinsics.d(this.f3476a, bzmVar.f3476a) && this.b.equals(bzmVar.b) && Intrinsics.d(this.c, bzmVar.c);
    }

    public final int hashCode() {
        int iG = hne.g(this.b, this.f3476a.hashCode() * 31, 31);
        d280 d280Var = this.c;
        return iG + (d280Var == null ? 0 : d280Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "DsSportEventCardTennisStatisticsTeamUiModel(name=", this.f3476a, ", logoOne=", ", logoTwo=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
