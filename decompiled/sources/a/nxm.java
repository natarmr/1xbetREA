package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nxm implements sxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24289a;
    public final jwm b;
    public final jwm c;
    public final jwm d;

    public nxm(String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f24289a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
        this.d = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxm)) {
            return false;
        }
        nxm nxmVar = (nxm) obj;
        return Intrinsics.d(this.f24289a, nxmVar.f24289a) && this.b.equals(nxmVar.b) && this.c.equals(nxmVar.c) && Intrinsics.d(this.d, nxmVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, b1j.d(this.b, this.f24289a.hashCode() * 961, 31), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(opponentName=");
        sb.append(this.f24289a);
        sb.append(", opponentIcon=null, oneLabelInfo=");
        sb.append(this.b);
        sb.append(", twoLabelInfo=");
        return b1j.l(sb, this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
