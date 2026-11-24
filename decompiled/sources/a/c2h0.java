package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c2h0 extends df50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1h0 f3623a;

    public c2h0(y1h0 y1h0Var) {
        this.f3623a = y1h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2h0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.d(this.f3623a, ((c2h0) obj).f3623a);
    }

    public final int hashCode() {
        return this.f3623a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.f3623a + Separators.RPAREN;
    }
}
