package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class el50 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7981a;

    public el50(Throwable th) {
        super(th);
        this.f7981a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el50) && Intrinsics.d(this.f7981a, ((el50) obj).f7981a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f7981a;
    }

    public final int hashCode() {
        Throwable th = this.f7981a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ohs0.q("NetworkNotAvailableException(cause=", Separators.RPAREN, this.f7981a);
    }
}
