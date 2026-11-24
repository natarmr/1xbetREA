package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class esz implements fsz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csz f8350a;

    public final boolean equals(Object obj) {
        if (obj instanceof esz) {
            return this.f8350a.equals(((esz) obj).f8350a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8350a.hashCode();
    }

    public final String toString() {
        return "Enum(value=" + this.f8350a + Separators.RPAREN;
    }
}
