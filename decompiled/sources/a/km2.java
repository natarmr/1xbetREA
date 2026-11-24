package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class km2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f18518a;

    public final boolean equals(Object obj) {
        if (obj instanceof km2) {
            return this.f18518a.equals(((km2) obj).f18518a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18518a.hashCode();
    }

    public final String toString() {
        return twn.n("OnActionWithCard(value=", this.f18518a, Separators.RPAREN);
    }
}
