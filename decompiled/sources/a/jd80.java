package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jd80 implements kd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f16317a;

    public jd80(i4 i4Var) {
        i4Var.getClass();
        this.f16317a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd80) && Intrinsics.d(this.f16317a, ((jd80) obj).f16317a);
    }

    public final int hashCode() {
        return this.f16317a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f16317a, "Shimmers(content=", Separators.RPAREN);
    }
}
