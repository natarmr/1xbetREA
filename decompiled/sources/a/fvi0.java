package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f10216a;

    public fvi0(y3d y3dVar) {
        this.f10216a = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvi0) && Intrinsics.d(this.f10216a, ((fvi0) obj).f10216a);
    }

    public final int hashCode() {
        y3d y3dVar = this.f10216a;
        if (y3dVar == null) {
            return 0;
        }
        long j = y3dVar.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j);
    }

    public final String toString() {
        return "Chevron(chevronColor=" + this.f10216a + Separators.RPAREN;
    }
}
