package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pz50 implements tz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f27828a;

    public pz50(Throwable th) {
        th.getClass();
        this.f27828a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz50) && Intrinsics.d(this.f27828a, ((pz50) obj).f27828a);
    }

    public final int hashCode() {
        return this.f27828a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f27828a);
    }
}
