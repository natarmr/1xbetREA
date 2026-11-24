package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4f f10354a;
    public final llx b;

    public fye(q4f q4fVar, llx llxVar) {
        q4fVar.getClass();
        this.f10354a = q4fVar;
        this.b = llxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fye)) {
            return false;
        }
        fye fyeVar = (fye) obj;
        return this.f10354a == fyeVar.f10354a && this.b == fyeVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10354a.hashCode() * 31);
    }

    public final String toString() {
        return "CouponIntentionInfoModel(couponTypeModel=" + this.f10354a + ", intentionState=" + this.b + Separators.RPAREN;
    }
}
