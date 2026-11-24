package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ima implements lma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15015a;
    public final String b;
    public final jwm c;
    public final jwm d;

    public ima(String str, String str2, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        str2.getClass();
        this.f15015a = str;
        this.b = str2;
        this.c = jwmVar;
        this.d = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ima)) {
            return false;
        }
        ima imaVar = (ima) obj;
        return Intrinsics.d(this.f15015a, imaVar.f15015a) && Intrinsics.d(this.b, imaVar.b) && this.c.equals(imaVar.c) && Intrinsics.d(this.d, imaVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, ua80.b(this.f15015a.hashCode() * 31, 31, this.b), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return b1j.l(b1j.n("OneOpponent(opponentName=", this.f15015a, ", oneLabelInfo=", this.b, ", twoLabelInfo="), this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
