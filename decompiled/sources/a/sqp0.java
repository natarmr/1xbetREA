package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sqp0 implements uqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f32641a;

    public sqp0(i4 i4Var) {
        i4Var.getClass();
        this.f32641a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sqp0) && Intrinsics.d(this.f32641a, ((sqp0) obj).f32641a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return sqp0.class;
    }

    public final int hashCode() {
        return this.f32641a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f32641a, "TeamsDefaultUiModel(list=", Separators.RPAREN);
    }
}
