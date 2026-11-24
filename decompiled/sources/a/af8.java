package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class af8 implements bf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f765a;

    public af8(dn60 dn60Var) {
        this.f765a = dn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af8) && this.f765a.equals(((af8) obj).f765a);
    }

    public final int hashCode() {
        return this.f765a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f765a + Separators.RPAREN;
    }
}
