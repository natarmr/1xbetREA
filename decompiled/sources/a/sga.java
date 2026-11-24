package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0n f32152a;
    public final String b;
    public final String c;
    public final y1m d;
    public final ows0 e;
    public final ows0 f;

    public sga(g0n g0nVar, String str, String str2, y1m y1mVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f32152a = g0nVar;
        this.b = str;
        this.c = str2;
        this.d = y1mVar;
        this.e = ows0Var;
        this.f = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sga)) {
            return false;
        }
        sga sgaVar = (sga) obj;
        return Intrinsics.d(this.f32152a, sgaVar.f32152a) && Intrinsics.d(this.b, sgaVar.b) && Intrinsics.d(this.c, sgaVar.c) && this.d.equals(sgaVar.d) && this.e.equals(sgaVar.e) && this.f.equals(sgaVar.f);
    }

    public final int hashCode() {
        g0n g0nVar = this.f32152a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b((g0nVar == null ? 0 : g0nVar.hashCode()) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f32152a + ", championshipLabel=" + this.b + ", infoLabel=" + this.c + ", scoreSection=" + this.d + ", teamOneModel=" + this.e + ", teamTwoModel=" + this.f + Separators.RPAREN;
    }
}
