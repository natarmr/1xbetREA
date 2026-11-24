package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oxm implements sxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26019a;
    public final jwm b;
    public final jwm c;
    public final jwm d;

    public oxm(String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3) {
        str.getClass();
        this.f26019a = str;
        this.b = jwmVar;
        this.c = jwmVar2;
        this.d = jwmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxm)) {
            return false;
        }
        oxm oxmVar = (oxm) obj;
        return Intrinsics.d(this.f26019a, oxmVar.f26019a) && this.b.equals(oxmVar.b) && this.c.equals(oxmVar.c) && Intrinsics.d(this.d, oxmVar.d);
    }

    public final int hashCode() {
        int iD = b1j.d(this.c, b1j.d(this.b, this.f26019a.hashCode() * 31, 31), 31);
        jwm jwmVar = this.d;
        return iD + (jwmVar == null ? 0 : jwmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V1(opponentName=");
        sb.append(this.f26019a);
        sb.append(", oneLabelInfo=");
        sb.append(this.b);
        sb.append(", twoLabelInfo=");
        return b1j.l(sb, this.c, ", threeLabelInfo=", this.d, Separators.RPAREN);
    }
}
