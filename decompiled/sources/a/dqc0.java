package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6507a;
    public final String b;

    public dqc0(long j, String str) {
        this.f6507a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqc0)) {
            return false;
        }
        dqc0 dqc0Var = (dqc0) obj;
        return this.f6507a == dqc0Var.f6507a && this.b.equals(dqc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f6507a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f6507a, "PromoShopCategoryModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
