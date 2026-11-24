package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0n f16471a;
    public final String b;
    public final ows0 c;
    public final ows0 d;

    public jga(e0n e0nVar, String str, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        this.f16471a = e0nVar;
        this.b = str;
        this.c = ows0Var;
        this.d = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jga)) {
            return false;
        }
        jga jgaVar = (jga) obj;
        return Intrinsics.d(this.f16471a, jgaVar.f16471a) && Intrinsics.d(this.b, jgaVar.b) && this.c.equals(jgaVar.c) && this.d.equals(jgaVar.d);
    }

    public final int hashCode() {
        e0n e0nVar = this.f16471a;
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b((e0nVar == null ? 0 : e0nVar.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f16471a + ", championshipLabel=" + this.b + ", teamOneModel=" + this.c + ", teamTwoModel=" + this.d + Separators.RPAREN;
    }
}
