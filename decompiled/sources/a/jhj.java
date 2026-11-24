package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jhj implements khj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chl0 f16529a;

    public jhj(chl0 chl0Var) {
        this.f16529a = chl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhj) && this.f16529a.equals(((jhj) obj).f16529a);
    }

    public final int hashCode() {
        return this.f16529a.hashCode();
    }

    public final String toString() {
        return "SportMarket(value=" + this.f16529a + Separators.RPAREN;
    }
}
