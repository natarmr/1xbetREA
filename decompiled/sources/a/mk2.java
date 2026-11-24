package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f21922a;

    public final boolean equals(Object obj) {
        if (obj instanceof mk2) {
            return Intrinsics.d(this.f21922a, ((mk2) obj).f21922a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21922a.hashCode();
    }

    public final String toString() {
        return "OnCoefClick(model=" + this.f21922a + Separators.RPAREN;
    }
}
