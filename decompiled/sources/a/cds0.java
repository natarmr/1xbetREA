package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cds0 implements gds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4177a;

    public final boolean equals(Object obj) {
        if (obj instanceof cds0) {
            return Intrinsics.d(this.f4177a, ((cds0) obj).f4177a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4177a.hashCode();
    }

    public final String toString() {
        return ohs0.q("Error(error=", Separators.RPAREN, this.f4177a);
    }
}
