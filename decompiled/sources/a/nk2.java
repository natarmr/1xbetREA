package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f23662a;

    public final boolean equals(Object obj) {
        if (obj instanceof nk2) {
            return Intrinsics.d(this.f23662a, ((nk2) obj).f23662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23662a.hashCode();
    }

    public final String toString() {
        return "OnCoefItemClick(model=" + this.f23662a + Separators.RPAREN;
    }
}
