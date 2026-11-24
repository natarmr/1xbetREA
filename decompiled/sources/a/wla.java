package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wla implements zla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39344a;
    public final String b;
    public final jwm c;
    public final jwm d;

    public wla(String str, String str2, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        str2.getClass();
        this.f39344a = str;
        this.b = str2;
        this.c = jwmVar;
        this.d = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wla)) {
            return false;
        }
        wla wlaVar = (wla) obj;
        return Intrinsics.d(this.f39344a, wlaVar.f39344a) && Intrinsics.d(this.b, wlaVar.b) && this.c.equals(wlaVar.c) && Intrinsics.d(this.d, wlaVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, ua80.b(this.f39344a.hashCode() * 31, 31, this.b), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return b1j.l(b1j.n("OneOpponent(opponentName=", this.f39344a, ", oneLabelInfo=", this.b, ", twoLabelInfo="), this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
