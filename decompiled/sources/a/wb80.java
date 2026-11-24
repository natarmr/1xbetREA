package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f38863a;

    public final boolean equals(Object obj) {
        if (obj instanceof wb80) {
            return this.f38863a.equals(((wb80) obj).f38863a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38863a.hashCode();
    }

    public final String toString() {
        return twn.n("SportGameCardAction(action=", this.f38863a, Separators.RPAREN);
    }
}
