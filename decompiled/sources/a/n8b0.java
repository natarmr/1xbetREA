package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n8b0 extends q8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f23081a;

    public n8b0(Throwable th) {
        th.getClass();
        this.f23081a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8b0) && Intrinsics.d(this.f23081a, ((n8b0) obj).f23081a);
    }

    public final int hashCode() {
        return this.f23081a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f23081a);
    }
}
