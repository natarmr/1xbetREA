package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class scn implements tcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv20 f31994a;

    public scn(iv20 iv20Var) {
        this.f31994a = iv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scn) && this.f31994a.equals(((scn) obj).f31994a);
    }

    public final int hashCode() {
        return this.f31994a.hashCode();
    }

    public final String toString() {
        return "MarketGroup(delegateAction=" + this.f31994a + Separators.RPAREN;
    }
}
