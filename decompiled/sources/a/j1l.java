package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j1l implements x1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f15741a;

    public final boolean equals(Object obj) {
        if (obj instanceof j1l) {
            return this.f15741a.equals(((j1l) obj).f15741a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15741a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f15741a + Separators.RPAREN;
    }
}
