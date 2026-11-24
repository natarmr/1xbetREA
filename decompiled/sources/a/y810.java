package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y810 implements b910 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gx90 f42174a;

    public y810(gx90 gx90Var) {
        gx90Var.getClass();
        this.f42174a = gx90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y810) && Intrinsics.d(this.f42174a, ((y810) obj).f42174a);
    }

    public final int hashCode() {
        return this.f42174a.hashCode();
    }

    public final String toString() {
        return "ApplyGameState(result=" + this.f42174a + Separators.RPAREN;
    }
}
