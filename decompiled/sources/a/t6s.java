package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33434a;

    public t6s(String str) {
        this.f33434a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6s) && this.f33434a.equals(((t6s) obj).f33434a);
    }

    public final int hashCode() {
        return this.f33434a.hashCode();
    }

    public final String toString() {
        return kng0.l("StatisticGameClick(statGameId=", this.f33434a, Separators.RPAREN);
    }
}
