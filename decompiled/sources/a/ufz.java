package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ufz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35598a;
    public final o2h b;

    public ufz(String str, o2h o2hVar) {
        this.f35598a = str;
        this.b = o2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufz)) {
            return false;
        }
        ufz ufzVar = (ufz) obj;
        return this.f35598a.equals(ufzVar.f35598a) && this.b.equals(ufzVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f35598a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35598a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardAnalyticsUiModel(key=" + this.f35598a + ", analyticsUiModel=" + this.b + Separators.RPAREN;
    }
}
