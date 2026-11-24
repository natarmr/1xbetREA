package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jj2 implements nj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f16601a;

    public final boolean equals(Object obj) {
        if (obj instanceof jj2) {
            return Intrinsics.d(this.f16601a, ((jj2) obj).f16601a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16601a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f16601a);
    }
}
