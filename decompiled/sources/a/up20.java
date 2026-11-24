package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class up20 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36042a;

    public up20(i4 i4Var) {
        i4Var.getClass();
        this.f36042a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up20) && Intrinsics.d(this.f36042a, ((up20) obj).f36042a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MAPS_IN_SERIES_ITEM";
    }

    public final int hashCode() {
        return this.f36042a.hashCode() + 358922935;
    }

    public final String toString() {
        return h97.i(this.f36042a, "MapsInSeriesUiModel(key=MAPS_IN_SERIES_ITEM, mapList=", Separators.RPAREN);
    }
}
