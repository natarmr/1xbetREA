package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d96 implements h96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5685a;
    public final uxm b;
    public final String c;
    public final qem d;

    public d96(String str, uxm uxmVar, String str2, qem qemVar) {
        str.getClass();
        this.f5685a = str;
        this.b = uxmVar;
        this.c = str2;
        this.d = qemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d96)) {
            return false;
        }
        d96 d96Var = (d96) obj;
        return Intrinsics.d(this.f5685a, d96Var.f5685a) && Intrinsics.d(this.b, d96Var.b) && this.c.equals(d96Var.c) && Intrinsics.d(this.d, d96Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5685a.hashCode() * 31;
        uxm uxmVar = this.b;
        return ua80.b((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31, 31, this.c) + (this.d != null ? -924444967 : 0);
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f5685a + ", timer=" + this.b + ", infoLabel=" + this.c + ", eventStatusIndicatorModel=" + this.d + Separators.RPAREN;
    }
}
