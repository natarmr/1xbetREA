package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l8t0 implements m8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f19621a;

    public l8t0(bem bemVar) {
        this.f19621a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l8t0) && this.f19621a.equals(((l8t0) obj).f19621a);
    }

    public final int hashCode() {
        return this.f19621a.hashCode();
    }

    public final String toString() {
        return twn.n("OnDsAction(action=", this.f19621a, Separators.RPAREN);
    }
}
