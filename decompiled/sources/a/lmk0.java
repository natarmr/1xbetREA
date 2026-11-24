package a;

import android.gov.nist.core.Separators;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lmk0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u99 f20300a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20300a.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lmk0) {
            return this.f20300a.equals(((lmk0) obj).f20300a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20300a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.f20300a + Separators.RPAREN;
    }
}
