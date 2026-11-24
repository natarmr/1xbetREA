package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j96 implements o96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4i f16121a;

    public final boolean equals(Object obj) {
        if (obj instanceof j96) {
            return this.f16121a.equals(((j96) obj).f16121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16121a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f16121a + Separators.RPAREN;
    }
}
