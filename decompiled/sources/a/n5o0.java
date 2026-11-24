package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n5o0 implements s5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4i f22954a;

    public final boolean equals(Object obj) {
        if (obj instanceof n5o0) {
            return this.f22954a.equals(((n5o0) obj).f22954a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22954a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f22954a + Separators.RPAREN;
    }
}
