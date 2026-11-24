package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rxm implements sxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31271a;
    public final String b;
    public final jwm c;
    public final jwm d;

    public rxm(String str, String str2, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        str2.getClass();
        this.f31271a = str;
        this.b = str2;
        this.c = jwmVar;
        this.d = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxm)) {
            return false;
        }
        rxm rxmVar = (rxm) obj;
        return Intrinsics.d(this.f31271a, rxmVar.f31271a) && Intrinsics.d(this.b, rxmVar.b) && this.c.equals(rxmVar.c) && Intrinsics.d(this.d, rxmVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, ua80.b(this.f31271a.hashCode() * 961, 31, this.b), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return b1j.l(b1j.n("V4(opponentName=", this.f31271a, ", opponentIcon=null, topInfoLabel=", this.b, ", twoLabelInfo="), this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
