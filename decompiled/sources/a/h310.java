package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class h310 implements l310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f12364a;

    public final boolean equals(Object obj) {
        if (obj instanceof h310) {
            return this.f12364a.equals(((h310) obj).f12364a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12364a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f12364a + Separators.RPAREN;
    }
}
