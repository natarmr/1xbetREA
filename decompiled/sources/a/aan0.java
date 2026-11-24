package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f536a;
    public final zrm b;

    public aan0(long j, zrm zrmVar) {
        this.f536a = j;
        this.b = zrmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aan0)) {
            return false;
        }
        aan0 aan0Var = (aan0) obj;
        return this.f536a == aan0Var.f536a && this.b.equals(aan0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f536a) * 31);
    }

    public final String toString() {
        return "SubscriptionTeamUiModel(id=" + this.f536a + ", style=" + this.b + Separators.RPAREN;
    }
}
