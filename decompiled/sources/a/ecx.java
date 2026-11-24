package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ecx implements fcx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f7588a;

    public ecx(i4 i4Var) {
        i4Var.getClass();
        this.f7588a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecx) && Intrinsics.d(this.f7588a, ((ecx) obj).f7588a);
    }

    public final int hashCode() {
        return this.f7588a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f7588a, "Loading(shimmerList=", Separators.RPAREN);
    }
}
