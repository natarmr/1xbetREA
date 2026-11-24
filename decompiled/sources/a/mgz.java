package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mgz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21765a;
    public final o8m b;

    public mgz(String str, o8m o8mVar) {
        this.f21765a = str;
        this.b = o8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgz)) {
            return false;
        }
        mgz mgzVar = (mgz) obj;
        return this.f21765a.equals(mgzVar.f21765a) && this.b.equals(mgzVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21765a;
    }

    public final int hashCode() {
        return this.b.f24837a.hashCode() + (this.f21765a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardPlayerUiModel(key=" + this.f21765a + ", model=" + this.b + Separators.RPAREN;
    }
}
