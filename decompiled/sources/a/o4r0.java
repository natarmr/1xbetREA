package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class o4r0 implements s4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f24655a;

    public final boolean equals(Object obj) {
        if (obj instanceof o4r0) {
            return this.f24655a.equals(((o4r0) obj).f24655a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24655a.hashCode();
    }

    public final String toString() {
        return twn.n("GameCardAction(action=", this.f24655a, Separators.RPAREN);
    }
}
