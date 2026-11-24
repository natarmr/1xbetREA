package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class awa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1564a;

    public awa(double d) {
        this.f1564a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awa) && Double.compare(this.f1564a, ((awa) obj).f1564a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f1564a);
    }

    public final String toString() {
        return "CashbackBalanceModel(cashbackBalance=" + this.f1564a + Separators.RPAREN;
    }
}
