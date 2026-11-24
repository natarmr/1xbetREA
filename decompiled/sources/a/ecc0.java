package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ecc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7560a;
    public final Date b;
    public final qcc0 c;
    public final List d;
    public final icc0 e;
    public final jcc0 f;

    public ecc0(int i, Date date, qcc0 qcc0Var, List list, icc0 icc0Var, jcc0 jcc0Var) {
        list.getClass();
        this.f7560a = i;
        this.b = date;
        this.c = qcc0Var;
        this.d = list;
        this.e = icc0Var;
        this.f = jcc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecc0)) {
            return false;
        }
        ecc0 ecc0Var = (ecc0) obj;
        return this.f7560a == ecc0Var.f7560a && this.b.equals(ecc0Var.b) && this.c == ecc0Var.c && Intrinsics.d(this.d, ecc0Var.d) && this.e == ecc0Var.e && this.f == ecc0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + dw9.a((this.c.hashCode() + brm0.i(this.b, Integer.hashCode(this.f7560a) * 31, 31)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "PromoCmsPromotionInfoDrawModel(drawId=" + this.f7560a + ", date=" + this.b + ", unitId=" + this.c + ", unitTypeIds=" + this.d + ", isRating=" + this.e + ", isResultDraw=" + this.f + Separators.RPAREN;
    }
}
