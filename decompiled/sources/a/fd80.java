package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fd80 implements kd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9346a;

    public fd80(i4 i4Var) {
        i4Var.getClass();
        this.f9346a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd80) && Intrinsics.d(this.f9346a, ((fd80) obj).f9346a);
    }

    public final int hashCode() {
        return this.f9346a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f9346a, "Data(content=", Separators.RPAREN);
    }
}
