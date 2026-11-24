package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ax60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f1609a;

    public ax60(dn60 dn60Var) {
        this.f1609a = dn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax60) && this.f1609a.equals(((ax60) obj).f1609a);
    }

    public final int hashCode() {
        return this.f1609a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f1609a + Separators.RPAREN;
    }
}
