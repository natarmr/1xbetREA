package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kbm0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lep0 f18021a;
    public final a4x b;
    public final boolean c;

    public kbm0(lep0 lep0Var, i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f18021a = lep0Var;
        this.b = i4Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbm0)) {
            return false;
        }
        kbm0 kbm0Var = (kbm0) obj;
        return this.f18021a.equals(kbm0Var.f18021a) && Intrinsics.d(this.b, kbm0Var.b) && this.c == kbm0Var.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STATISTIC_BANS_MAPS";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, (this.f18021a.f19915a.hashCode() + rw2.b(-479485699, 31, 15L)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatisticCardUiModel(key=STATISTIC_BANS_MAPS, subSportId=15, teamHeader=");
        sb.append(this.f18021a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
