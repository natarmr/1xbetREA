package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n5p extends t9p {
    public final String b;
    public final a4x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5p(a4x a4xVar, String str) {
        super(str, a4xVar);
        a4xVar.getClass();
        this.b = str;
        this.c = a4xVar;
    }

    public static n5p c(n5p n5pVar, i4 i4Var) {
        String str = n5pVar.b;
        n5pVar.getClass();
        i4Var.getClass();
        return new n5p(i4Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5p)) {
            return false;
        }
        n5p n5pVar = (n5p) obj;
        return this.b.equals(n5pVar.b) && Intrinsics.d(this.c, n5pVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b + Separators.SP + this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("FavoriteChampionshipUiItem(id=", this.b, ", uiItems=", this.c, Separators.RPAREN);
    }
}
