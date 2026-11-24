package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4173a;
    public final String b;

    public cdq(int i, String str) {
        this.f4173a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdq)) {
            return false;
        }
        cdq cdqVar = (cdq) obj;
        return this.f4173a == cdqVar.f4173a && this.b.equals(cdqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f4173a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f4173a, "FindCouponParamsModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
