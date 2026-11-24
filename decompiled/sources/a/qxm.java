package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qxm implements sxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29491a;
    public final jwm b;
    public final jwm c;

    public qxm(String str, jwm jwmVar, jwm jwmVar2) {
        str.getClass();
        this.f29491a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxm)) {
            return false;
        }
        qxm qxmVar = (qxm) obj;
        return Intrinsics.d(this.f29491a, qxmVar.f29491a) && this.b.equals(qxmVar.b) && Intrinsics.d(this.c, qxmVar.c);
    }

    public final int hashCode() {
        int iD = b1j.d(this.b, this.f29491a.hashCode() * 961, 31);
        jwm jwmVar = this.c;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        return "V3(opponentName=" + this.f29491a + ", opponentIcon=null, twoLabelInfo=" + this.b + ", threeLabelInfo=" + this.c + Separators.RPAREN;
    }
}
