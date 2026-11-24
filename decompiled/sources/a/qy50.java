package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f29519a;

    public final boolean equals(Object obj) {
        if (obj instanceof qy50) {
            return Intrinsics.d(this.f29519a, ((qy50) obj).f29519a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29519a.hashCode();
    }

    public final String toString() {
        return "OnCoefItemClick(model=" + this.f29519a + Separators.RPAREN;
    }
}
