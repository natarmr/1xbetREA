package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class voz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f37788a;
    public final boolean b;

    public voz(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f37788a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voz)) {
            return false;
        }
        voz vozVar = (voz) obj;
        return Intrinsics.d(this.f37788a, vozVar.f37788a) && this.b == vozVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(this.f37788a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LimitSelfExcludeAfricaUiState(availableValueModels=" + this.f37788a + ", acceptButtonEnabled=" + this.b + ", isLoading=false)";
    }
}
