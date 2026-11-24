package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mma implements rma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzm f22027a;
    public final vzm b;
    public final jwm c;
    public final jwm d;
    public final jwm e;

    public mma(vzm vzmVar, vzm vzmVar2, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        this.f22027a = vzmVar;
        this.b = vzmVar2;
        this.c = jwmVar;
        this.d = jwmVar2;
        this.e = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mma)) {
            return false;
        }
        mma mmaVar = (mma) obj;
        return this.f22027a.equals(mmaVar.f22027a) && this.b.equals(mmaVar.b) && this.c.equals(mmaVar.c) && this.d.equals(mmaVar.d) && Intrinsics.d(this.e, mmaVar.e);
    }

    public final int hashCode() {
        int iD = b1j.d(this.d, b1j.d(this.c, (this.b.hashCode() + (this.f22027a.hashCode() * 31)) * 31, 31), 31);
        jwm jwmVar = this.e;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cricket(firstOpponentModel=");
        sb.append(this.f22027a);
        sb.append(", secondOpponentModel=");
        sb.append(this.b);
        sb.append(", infoLabelOne=");
        b1j.A(sb, this.c, ", infoLabelTwo=", this.d, ", infoLabelThree=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
