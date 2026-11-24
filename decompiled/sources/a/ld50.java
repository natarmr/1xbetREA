package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ld50 implements nd50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19834a;

    public final boolean equals(Object obj) {
        if (obj instanceof ld50) {
            return this.f19834a.equals(((ld50) obj).f19834a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19834a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchTextChange(value=", this.f19834a, Separators.RPAREN);
    }
}
