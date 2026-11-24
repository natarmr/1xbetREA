package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s8l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31807a;

    public final boolean equals(Object obj) {
        if (obj instanceof s8l) {
            return this.f31807a.equals(((s8l) obj).f31807a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31807a.hashCode();
    }

    public final String toString() {
        return kng0.l("DireTeamIcon(value=", this.f31807a, Separators.RPAREN);
    }
}
