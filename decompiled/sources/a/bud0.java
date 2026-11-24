package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bud0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3225a;

    public final boolean equals(Object obj) {
        if (obj instanceof bud0) {
            return this.f3225a.equals(((bud0) obj).f3225a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3225a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnMatchClick(value=", this.f3225a, Separators.RPAREN);
    }
}
