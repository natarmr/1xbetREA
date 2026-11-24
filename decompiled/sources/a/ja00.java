package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ja00 implements ka00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16165a;

    public final boolean equals(Object obj) {
        if (obj instanceof ja00) {
            return this.f16165a.equals(((ja00) obj).f16165a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16165a.hashCode();
    }

    public final String toString() {
        return kng0.l("SectionTitle(title=", this.f16165a, Separators.RPAREN);
    }
}
