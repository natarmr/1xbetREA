package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o76 implements t76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4i f24770a;

    public final boolean equals(Object obj) {
        if (obj instanceof o76) {
            return this.f24770a.equals(((o76) obj).f24770a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24770a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f24770a + Separators.RPAREN;
    }
}
