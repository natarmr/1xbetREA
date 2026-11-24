package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i76 implements m76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14277a;
    public final uxm b;
    public final String c;
    public final pem d;

    public i76(String str, uxm uxmVar, String str2, pem pemVar) {
        str.getClass();
        str2.getClass();
        this.f14277a = str;
        this.b = uxmVar;
        this.c = str2;
        this.d = pemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i76)) {
            return false;
        }
        i76 i76Var = (i76) obj;
        return Intrinsics.d(this.f14277a, i76Var.f14277a) && Intrinsics.d(this.b, i76Var.b) && Intrinsics.d(this.c, i76Var.c) && Intrinsics.d(this.d, i76Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f14277a.hashCode() * 31;
        int i = 0;
        uxm uxmVar = this.b;
        int iB = ua80.b((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31, 31, this.c);
        pem pemVar = this.d;
        if (pemVar != null) {
            pemVar.getClass();
            i = -924445215;
        }
        return iB + i;
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f14277a + ", timer=" + this.b + ", infoLabel=" + this.c + ", eventStatusIndicatorModel=" + this.d + Separators.RPAREN;
    }
}
