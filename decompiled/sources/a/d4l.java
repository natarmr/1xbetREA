package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d4l implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5460a;

    public d4l(i4 i4Var) {
        i4Var.getClass();
        this.f5460a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4l) && Intrinsics.d(this.f5460a, ((d4l) obj).f5460a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HERO_INDICATORS_PHONE";
    }

    public final int hashCode() {
        return this.f5460a.hashCode() - 807156792;
    }

    public final String toString() {
        return h97.i(this.f5460a, "DotaHeroIndicatorsUiModel(key=HERO_INDICATORS_PHONE, indicators=", Separators.RPAREN);
    }
}
