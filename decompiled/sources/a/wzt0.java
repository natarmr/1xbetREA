package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wzt0 implements a0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f40035a;

    public final boolean equals(Object obj) {
        if (obj instanceof wzt0) {
            return this.f40035a.equals(((wzt0) obj).f40035a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40035a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f40035a + Separators.RPAREN;
    }
}
