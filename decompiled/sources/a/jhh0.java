package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jhh0 implements thh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f16526a;

    public jhh0(Throwable th) {
        th.getClass();
        this.f16526a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhh0) && Intrinsics.d(this.f16526a, ((jhh0) obj).f16526a);
    }

    public final int hashCode() {
        return this.f16526a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f16526a);
    }
}
