package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wde0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38969a;
    public final String b;

    public wde0(i4 i4Var) {
        i4Var.getClass();
        this.f38969a = i4Var;
        this.b = String.valueOf(i4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wde0) && Intrinsics.d(this.f38969a, ((wde0) obj).f38969a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f38969a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f38969a, "RecommendChampsUiItem(chipModels=", Separators.RPAREN);
    }
}
