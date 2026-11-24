package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f38233a;

    public final boolean equals(Object obj) {
        if (obj instanceof vy50) {
            return Intrinsics.d(this.f38233a, ((vy50) obj).f38233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38233a.hashCode();
    }

    public final String toString() {
        return "OnRemoveCoefClick(model=" + this.f38233a + Separators.RPAREN;
    }
}
