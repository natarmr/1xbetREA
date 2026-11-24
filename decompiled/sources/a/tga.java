package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0n f33900a;
    public final String b;
    public final y1m c;
    public final ows0 d;
    public final ows0 e;

    public tga(g0n g0nVar, String str, y1m y1mVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        this.f33900a = g0nVar;
        this.b = str;
        this.c = y1mVar;
        this.d = ows0Var;
        this.e = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tga)) {
            return false;
        }
        tga tgaVar = (tga) obj;
        return Intrinsics.d(this.f33900a, tgaVar.f33900a) && Intrinsics.d(this.b, tgaVar.b) && this.c.equals(tgaVar.c) && this.d.equals(tgaVar.d) && this.e.equals(tgaVar.e);
    }

    public final int hashCode() {
        g0n g0nVar = this.f33900a;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ua80.b((g0nVar == null ? 0 : g0nVar.hashCode()) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f33900a + ", championshipLabel=" + this.b + ", scoreSection=" + this.c + ", teamOneModel=" + this.d + ", teamTwoModel=" + this.e + Separators.RPAREN;
    }
}
