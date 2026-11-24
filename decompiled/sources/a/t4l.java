package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnp0 f33325a;

    public final boolean equals(Object obj) {
        if (obj instanceof t4l) {
            return this.f33325a.equals(((t4l) obj).f33325a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33325a.hashCode();
    }

    public final String toString() {
        return "Team(value=" + this.f33325a + Separators.RPAREN;
    }
}
