package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jkr implements mkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ejr f16684a;

    public final boolean equals(Object obj) {
        if (obj instanceof jkr) {
            return this.f16684a == ((jkr) obj).f16684a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16684a.hashCode();
    }

    public final String toString() {
        return "Answer(value=" + this.f16684a + Separators.RPAREN;
    }
}
