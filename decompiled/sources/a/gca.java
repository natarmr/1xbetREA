package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gca implements jca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2i f11049a;

    public final boolean equals(Object obj) {
        if (obj instanceof gca) {
            return this.f11049a.equals(((gca) obj).f11049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11049a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f11049a + Separators.RPAREN;
    }
}
