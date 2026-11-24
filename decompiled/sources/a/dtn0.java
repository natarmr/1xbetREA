package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dtn0 implements gtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fzc f6665a;

    public final boolean equals(Object obj) {
        if (obj instanceof dtn0) {
            return this.f6665a == ((dtn0) obj).f6665a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6665a.hashCode();
    }

    public final String toString() {
        return "CoefColor(coefColorType=" + this.f6665a + Separators.RPAREN;
    }
}
