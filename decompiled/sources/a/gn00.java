package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gn00 implements rn00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f11566a;

    public gn00(Throwable th) {
        th.getClass();
        this.f11566a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn00) && Intrinsics.d(this.f11566a, ((gn00) obj).f11566a);
    }

    public final int hashCode() {
        return this.f11566a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f11566a);
    }
}
