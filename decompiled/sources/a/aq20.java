package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aq20 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1277a;

    public aq20(i4 i4Var) {
        i4Var.getClass();
        this.f1277a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq20) && Intrinsics.d(this.f1277a, ((aq20) obj).f1277a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MAPS_STATISTIC_ITEM";
    }

    public final int hashCode() {
        return this.f1277a.hashCode() - 277971498;
    }

    public final String toString() {
        return h97.i(this.f1277a, "MapsStatisticUiModel(key=MAPS_STATISTIC_ITEM, mapList=", Separators.RPAREN);
    }
}
