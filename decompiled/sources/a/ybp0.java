package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ybp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42349a;
    public final a4x b;

    public ybp0(i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f42349a = z;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybp0)) {
            return false;
        }
        ybp0 ybp0Var = (ybp0) obj;
        return this.f42349a == ybp0Var.f42349a && Intrinsics.d(this.b, ybp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f42349a) * 31);
    }

    public final String toString() {
        return "TeamDragonsUiModel(visible=" + this.f42349a + ", dragonList=" + this.b + Separators.RPAREN;
    }
}
