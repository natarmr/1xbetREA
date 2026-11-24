package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class up60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f36047a;

    public up60(dn60 dn60Var) {
        this.f36047a = dn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up60) && this.f36047a.equals(((up60) obj).f36047a);
    }

    public final int hashCode() {
        return this.f36047a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f36047a + Separators.RPAREN;
    }
}
