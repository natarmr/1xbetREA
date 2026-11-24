package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0n f30422a;
    public final String b;
    public final String c;
    public final kpm d;
    public final ows0 e;
    public final ows0 f;

    public rga(g0n g0nVar, String str, String str2, kpm kpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f30422a = g0nVar;
        this.b = str;
        this.c = str2;
        this.d = kpmVar;
        this.e = ows0Var;
        this.f = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rga)) {
            return false;
        }
        rga rgaVar = (rga) obj;
        return Intrinsics.d(this.f30422a, rgaVar.f30422a) && Intrinsics.d(this.b, rgaVar.b) && Intrinsics.d(this.c, rgaVar.c) && this.d.equals(rgaVar.d) && this.e.equals(rgaVar.e) && this.f.equals(rgaVar.f);
    }

    public final int hashCode() {
        g0n g0nVar = this.f30422a;
        return this.f.hashCode() + ((this.e.hashCode() + dw9.c(this.d, ua80.b(ua80.b((g0nVar == null ? 0 : g0nVar.hashCode()) * 31, 31, this.b), 31, this.c), 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f30422a + ", championshipLabel=" + this.b + ", infoLabel=" + this.c + ", scoreSection=" + this.d + ", teamOneModel=" + this.e + ", teamTwoModel=" + this.f + Separators.RPAREN;
    }
}
