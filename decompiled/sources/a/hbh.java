package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hbh implements qbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f12769a;

    public hbh(Throwable th) {
        th.getClass();
        this.f12769a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbh) && Intrinsics.d(this.f12769a, ((hbh) obj).f12769a);
    }

    public final int hashCode() {
        return this.f12769a.hashCode();
    }

    public final String toString() {
        return ohs0.q("OnError(error=", Separators.RPAREN, this.f12769a);
    }
}
