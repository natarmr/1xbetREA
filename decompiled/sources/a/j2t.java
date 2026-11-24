package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class j2t implements n2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f15798a;

    public final boolean equals(Object obj) {
        if (obj instanceof j2t) {
            return this.f15798a.equals(((j2t) obj).f15798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15798a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f15798a + Separators.RPAREN;
    }
}
