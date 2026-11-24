package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cma implements fma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4594a;
    public final jwm b;
    public final jwm c;

    public cma(String str, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        this.f4594a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cma)) {
            return false;
        }
        cma cmaVar = (cma) obj;
        return Intrinsics.d(this.f4594a, cmaVar.f4594a) && this.b.equals(cmaVar.b) && Intrinsics.d(this.c, cmaVar.c);
    }

    public final int hashCode() {
        int iD = b1j.d(this.b, this.f4594a.hashCode() * 31, 31);
        jwm jwmVar = this.c;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f4594a + ", twoLabelInfo=" + this.b + ", threeLabelInfo=" + this.c + Separators.RPAREN;
    }
}
