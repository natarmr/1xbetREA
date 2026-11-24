package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ed4 implements fd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7599a;

    public ed4(Throwable th) {
        th.getClass();
        this.f7599a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed4) && Intrinsics.d(this.f7599a, ((ed4) obj).f7599a);
    }

    public final int hashCode() {
        return this.f7599a.hashCode();
    }

    public final String toString() {
        return ohs0.q("UnknownError(throwable=", Separators.RPAREN, this.f7599a);
    }
}
