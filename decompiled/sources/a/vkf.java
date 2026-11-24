package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vkf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37568a;

    public final boolean equals(Object obj) {
        if (obj instanceof vkf) {
            return this.f37568a.equals(((vkf) obj).f37568a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37568a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapName(value=", this.f37568a, Separators.RPAREN);
    }
}
