package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mj6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21880a;
    public final mdm b;

    public mj6(long j, mdm mdmVar) {
        this.f21880a = j;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj6)) {
            return false;
        }
        mj6 mj6Var = (mj6) obj;
        return this.f21880a == mj6Var.f21880a && this.b.equals(mj6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f21880a) * 31);
    }

    public final String toString() {
        return "SearchEmpty(selectedSubGameId=" + this.f21880a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
