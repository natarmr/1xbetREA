package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t1b implements y1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f33161a;

    public t1b(Throwable th) {
        th.getClass();
        this.f33161a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1b) && Intrinsics.d(this.f33161a, ((t1b) obj).f33161a);
    }

    public final int hashCode() {
        return this.f33161a.hashCode();
    }

    public final String toString() {
        return ohs0.q("CashbackError(throwable=", Separators.RPAREN, this.f33161a);
    }
}
