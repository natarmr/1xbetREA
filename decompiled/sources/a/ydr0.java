package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ydr0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylb0 f42453a;

    public final boolean equals(Object obj) {
        if (obj instanceof ydr0) {
            return this.f42453a.equals(((ydr0) obj).f42453a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42453a.hashCode();
    }

    public final String toString() {
        return "OpenTabByHeaderTag(tab=" + this.f42453a + Separators.RPAREN;
    }
}
