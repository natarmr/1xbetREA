package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0n f19998a;
    public final String b;
    public final String c;
    public final ows0 d;
    public final ows0 e;

    public lga(e0n e0nVar, String str, String str2, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f19998a = e0nVar;
        this.b = str;
        this.c = str2;
        this.d = ows0Var;
        this.e = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lga)) {
            return false;
        }
        lga lgaVar = (lga) obj;
        return Intrinsics.d(this.f19998a, lgaVar.f19998a) && Intrinsics.d(this.b, lgaVar.b) && Intrinsics.d(this.c, lgaVar.c) && this.d.equals(lgaVar.d) && this.e.equals(lgaVar.e);
    }

    public final int hashCode() {
        e0n e0nVar = this.f19998a;
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b((e0nVar == null ? 0 : e0nVar.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f19998a + ", championshipLabel=" + this.b + ", infoLabel=" + this.c + ", teamOneModel=" + this.d + ", teamTwoModel=" + this.e + Separators.RPAREN;
    }
}
