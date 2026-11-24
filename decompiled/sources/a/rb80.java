package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f30172a;

    public final boolean equals(Object obj) {
        if (obj instanceof rb80) {
            return this.f30172a.equals(((rb80) obj).f30172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30172a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f30172a + Separators.RPAREN;
    }
}
