package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o32 implements r32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24560a;

    public o32(i4 i4Var) {
        i4Var.getClass();
        this.f24560a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o32) && Intrinsics.d(this.f24560a, ((o32) obj).f24560a);
    }

    public final int hashCode() {
        return this.f24560a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f24560a, "Content(items=", Separators.RPAREN);
    }
}
