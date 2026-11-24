package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tf2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f33847a;

    public final boolean equals(Object obj) {
        if (obj instanceof tf2) {
            return this.f33847a.equals(((tf2) obj).f33847a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33847a.hashCode();
    }

    public final String toString() {
        return twn.n("GameCardAction(action=", this.f33847a, Separators.RPAREN);
    }
}
