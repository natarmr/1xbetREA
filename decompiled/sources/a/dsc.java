package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pif0 f6606a;

    public final boolean equals(Object obj) {
        if (obj instanceof dsc) {
            return this.f6606a == ((dsc) obj).f6606a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6606a.hashCode();
    }

    public final String toString() {
        return "OnElementClick(element=" + this.f6606a + Separators.RPAREN;
    }
}
