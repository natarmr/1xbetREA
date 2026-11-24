package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dat implements hat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5768a;

    public final boolean equals(Object obj) {
        if (obj instanceof dat) {
            return Intrinsics.d(this.f5768a, ((dat) obj).f5768a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5768a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f5768a);
    }
}
