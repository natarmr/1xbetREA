package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class csm implements dsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usm f4897a;

    public final boolean equals(Object obj) {
        if (obj instanceof csm) {
            return this.f4897a.equals(((csm) obj).f4897a);
        }
        return false;
    }

    @Override // a.dsm
    public final String getKey() {
        return String.valueOf(this.f4897a.f36218a);
    }

    public final int hashCode() {
        return this.f4897a.hashCode();
    }

    public final String toString() {
        return "SportItem(item=" + this.f4897a + Separators.RPAREN;
    }
}
