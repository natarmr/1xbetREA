package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pc5 implements rc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f26741a;

    public pc5(y3d y3dVar) {
        this.f26741a = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc5) && Intrinsics.d(this.f26741a, ((pc5) obj).f26741a);
    }

    public final int hashCode() {
        y3d y3dVar = this.f26741a;
        if (y3dVar == null) {
            return 0;
        }
        long j = y3dVar.f41946a;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(j);
    }

    public final String toString() {
        return "ColorBackground(color=" + this.f26741a + Separators.RPAREN;
    }
}
