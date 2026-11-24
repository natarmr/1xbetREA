package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vgl0 implements wgl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xgl0 f37387a;

    public final boolean equals(Object obj) {
        if (obj instanceof vgl0) {
            return Intrinsics.d(this.f37387a, ((vgl0) obj).f37387a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37387a.hashCode();
    }

    public final String toString() {
        return "Market(params=" + this.f37387a + Separators.RPAREN;
    }
}
