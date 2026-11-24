package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pcm implements qcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncm f26766a;

    public final boolean equals(Object obj) {
        if (obj instanceof pcm) {
            return this.f26766a == ((pcm) obj).f26766a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26766a.hashCode();
    }

    public final String toString() {
        return "State(value=" + this.f26766a + Separators.RPAREN;
    }
}
