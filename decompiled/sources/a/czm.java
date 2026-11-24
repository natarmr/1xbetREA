package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class czm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5231a;
    public final d280 b;
    public final d280 c;

    public czm(String str, c280 c280Var, c280 c280Var2) {
        str.getClass();
        this.f5231a = str;
        this.b = c280Var;
        this.c = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czm)) {
            return false;
        }
        czm czmVar = (czm) obj;
        return Intrinsics.d(this.f5231a, czmVar.f5231a) && Intrinsics.d(this.b, czmVar.b) && Intrinsics.d(this.c, czmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5231a.hashCode() * 31;
        d280 d280Var = this.b;
        int iHashCode2 = (iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 31;
        d280 d280Var2 = this.c;
        return iHashCode2 + (d280Var2 != null ? d280Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DsSportEventCardTennisTeamUiModel(name=" + this.f5231a + ", logoOne=" + this.b + ", logoTwo=" + this.c + Separators.RPAREN;
    }
}
