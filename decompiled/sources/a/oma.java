package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oma implements rma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25494a;
    public final jwm b;
    public final jwm c;
    public final jwm d;

    public oma(String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f25494a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
        this.d = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oma)) {
            return false;
        }
        oma omaVar = (oma) obj;
        return Intrinsics.d(this.f25494a, omaVar.f25494a) && this.b.equals(omaVar.b) && this.c.equals(omaVar.c) && Intrinsics.d(this.d, omaVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, b1j.d(this.b, this.f25494a.hashCode() * 31, 31), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneOpponent(opponentName=");
        sb.append(this.f25494a);
        sb.append(", oneLabelInfo=");
        sb.append(this.b);
        sb.append(", twoLabelInfo=");
        return b1j.l(sb, this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
