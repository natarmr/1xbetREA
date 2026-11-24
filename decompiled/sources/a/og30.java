package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class og30 implements pg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg30 f25197a;

    public og30(lg30 lg30Var) {
        this.f25197a = lg30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og30) && this.f25197a == ((og30) obj).f25197a;
    }

    public final int hashCode() {
        return this.f25197a.hashCode();
    }

    public final String toString() {
        return "OnMatchTypeClick(matchType=" + this.f25197a + Separators.RPAREN;
    }
}
