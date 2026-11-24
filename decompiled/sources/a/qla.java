package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qla implements tla {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28923a;
    public final jwm b;
    public final jwm c;
    public final jwm d;

    public qla(String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f28923a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
        this.d = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qla)) {
            return false;
        }
        qla qlaVar = (qla) obj;
        return Intrinsics.d(this.f28923a, qlaVar.f28923a) && this.b.equals(qlaVar.b) && this.c.equals(qlaVar.c) && Intrinsics.d(this.d, qlaVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, b1j.d(this.b, this.f28923a.hashCode() * 31, 31), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(opponentName=");
        sb.append(this.f28923a);
        sb.append(", oneLabelInfo=");
        sb.append(this.b);
        sb.append(", twoLabelInfo=");
        return b1j.l(sb, this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
