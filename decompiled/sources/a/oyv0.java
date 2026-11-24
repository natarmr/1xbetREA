package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class oyv0 implements pyv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f26077a;

    public final boolean equals(Object obj) {
        if (obj instanceof oyv0) {
            return this.f26077a.equals(((oyv0) obj).f26077a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26077a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f26077a + Separators.RPAREN;
    }
}
