package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final czm f36858a;
    public final czm b;

    public v66(czm czmVar, czm czmVar2) {
        this.f36858a = czmVar;
        this.b = czmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v66)) {
            return false;
        }
        v66 v66Var = (v66) obj;
        return this.f36858a.equals(v66Var.f36858a) && this.b.equals(v66Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36858a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoPairs(teamOne=" + this.f36858a + ", teamTwo=" + this.b + Separators.RPAREN;
    }
}
