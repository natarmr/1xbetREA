package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s3o0 implements x3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4i f31568a;

    public final boolean equals(Object obj) {
        if (obj instanceof s3o0) {
            return this.f31568a.equals(((s3o0) obj).f31568a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31568a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(model=" + this.f31568a + Separators.RPAREN;
    }
}
