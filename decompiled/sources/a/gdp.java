package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gdp extends t9p {
    public final String b;
    public final a4x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdp(a4x a4xVar, String str) {
        super(str, a4xVar);
        a4xVar.getClass();
        this.b = str;
        this.c = a4xVar;
    }

    public static gdp c(gdp gdpVar, i4 i4Var) {
        String str = gdpVar.b;
        gdpVar.getClass();
        i4Var.getClass();
        return new gdp(i4Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdp)) {
            return false;
        }
        gdp gdpVar = (gdp) obj;
        return this.b.equals(gdpVar.b) && Intrinsics.d(this.c, gdpVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b + Separators.SP + this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("FavoriteTeamUiItemsHolder(id=", this.b, ", uiItems=", this.c, Separators.RPAREN);
    }
}
