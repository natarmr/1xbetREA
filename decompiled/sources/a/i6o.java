package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i6o implements k6o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f14251a;

    public final boolean equals(Object obj) {
        if (obj instanceof i6o) {
            return this.f14251a.equals(((i6o) obj).f14251a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14251a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f14251a + Separators.RPAREN;
    }
}
