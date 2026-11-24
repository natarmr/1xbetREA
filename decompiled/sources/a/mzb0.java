package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mzb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22646a;
    public final String b;

    public mzb0(long j, String str) {
        this.f22646a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzb0)) {
            return false;
        }
        mzb0 mzb0Var = (mzb0) obj;
        return this.f22646a == mzb0Var.f22646a && this.b.equals(mzb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f22646a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f22646a, "ProductModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
