package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xee extends hfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f40742a;

    public xee(Throwable th) {
        th.getClass();
        this.f40742a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xee) && Intrinsics.d(this.f40742a, ((xee) obj).f40742a);
    }

    public final int hashCode() {
        return this.f40742a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(throwable=", Separators.RPAREN, this.f40742a);
    }
}
