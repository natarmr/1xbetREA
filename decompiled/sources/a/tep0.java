package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tep0 implements vep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnp0 f33832a;

    public final boolean equals(Object obj) {
        if (obj instanceof tep0) {
            return this.f33832a.equals(((tep0) obj).f33832a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33832a.hashCode();
    }

    public final String toString() {
        return "Team(value=" + this.f33832a + Separators.RPAREN;
    }
}
