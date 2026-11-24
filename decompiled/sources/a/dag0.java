package a;

import android.gov.nist.core.Separators;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class dag0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5746a;

    public dag0(Throwable th) {
        super(th);
        this.f5746a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dag0) && this.f5746a.equals(((dag0) obj).f5746a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5746a;
    }

    public final int hashCode() {
        return this.f5746a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ohs0.q("RetryOnErrorException(cause=", Separators.RPAREN, this.f5746a);
    }
}
