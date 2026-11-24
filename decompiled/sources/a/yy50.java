package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f43452a;

    public final boolean equals(Object obj) {
        if (obj instanceof yy50) {
            return this.f43452a.equals(((yy50) obj).f43452a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43452a.hashCode();
    }

    public final String toString() {
        return twn.n("SportGameCardAction(action=", this.f43452a, Separators.RPAREN);
    }
}
