package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kcv0 implements mcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f18080a;

    public kcv0(i4 i4Var) {
        i4Var.getClass();
        this.f18080a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcv0) && Intrinsics.d(this.f18080a, ((kcv0) obj).f18080a);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return kcv0.class;
    }

    public final int hashCode() {
        return this.f18080a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f18080a, "WhoWinGroupCardsDefaultUiModel(groups=", Separators.RPAREN);
    }
}
