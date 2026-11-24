package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0n f35615a;
    public final String b;
    public final kpm c;
    public final ows0 d;
    public final ows0 e;

    public uga(g0n g0nVar, String str, kpm kpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        this.f35615a = g0nVar;
        this.b = str;
        this.c = kpmVar;
        this.d = ows0Var;
        this.e = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga)) {
            return false;
        }
        uga ugaVar = (uga) obj;
        return Intrinsics.d(this.f35615a, ugaVar.f35615a) && Intrinsics.d(this.b, ugaVar.b) && this.c.equals(ugaVar.c) && this.d.equals(ugaVar.d) && this.e.equals(ugaVar.e);
    }

    public final int hashCode() {
        g0n g0nVar = this.f35615a;
        return this.e.hashCode() + ((this.d.hashCode() + dw9.c(this.c, ua80.b((g0nVar == null ? 0 : g0nVar.hashCode()) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f35615a + ", championshipLabel=" + this.b + ", scoreSection=" + this.c + ", teamOneModel=" + this.d + ", teamTwoModel=" + this.e + Separators.RPAREN;
    }
}
