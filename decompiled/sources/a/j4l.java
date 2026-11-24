package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnp0 f15889a;

    public final boolean equals(Object obj) {
        if (obj instanceof j4l) {
            return this.f15889a.equals(((j4l) obj).f15889a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15889a.hashCode();
    }

    public final String toString() {
        return "Team(value=" + this.f15889a + Separators.RPAREN;
    }
}
