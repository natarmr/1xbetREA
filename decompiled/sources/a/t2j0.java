package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t2j0 implements a3j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ezc f33218a;

    public final boolean equals(Object obj) {
        if (obj instanceof t2j0) {
            return this.f33218a == ((t2j0) obj).f33218a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33218a.hashCode();
    }

    public final String toString() {
        return "CoefChange(coefChangeType=" + this.f33218a + Separators.RPAREN;
    }
}
