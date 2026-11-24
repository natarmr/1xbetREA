package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o1e0 implements p1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24475a;

    public o1e0(i4 i4Var) {
        i4Var.getClass();
        this.f24475a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1e0) && Intrinsics.d(this.f24475a, ((o1e0) obj).f24475a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return o1e0.class;
    }

    public final int hashCode() {
        return this.f24475a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f24475a, "RankingsDefaultUiModel(list=", Separators.RPAREN);
    }
}
