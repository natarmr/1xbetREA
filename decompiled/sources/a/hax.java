package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hax implements jax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12746a;
    public final lmo b;

    public hax(i4 i4Var, lmo lmoVar) {
        dja djaVar = dja.PENALTY;
        ch00 ch00Var = ch00.SHORT_STATISTIC;
        i4Var.getClass();
        this.f12746a = i4Var;
        this.b = lmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hax)) {
            return false;
        }
        hax haxVar = (hax) obj;
        dja djaVar = dja.PENALTY;
        ch00 ch00Var = ch00.SHORT_STATISTIC;
        return Intrinsics.d(this.f12746a, haxVar.f12746a) && Intrinsics.d(this.b, haxVar.b);
    }

    @Override // a.jax
    public final dja getType() {
        return dja.SHORT_STATISTIC;
    }

    public final int hashCode() {
        int iB = cs0.b(this.f12746a, (ch00.SHORT_STATISTIC.hashCode() + (dja.SHORT_STATISTIC.hashCode() * 31)) * 31, 31);
        lmo lmoVar = this.b;
        return iB + (lmoVar == null ? 0 : lmoVar.hashCode());
    }

    public final String toString() {
        return "ShortStatistic(type=" + dja.SHORT_STATISTIC + ", expandSection=" + ch00.SHORT_STATISTIC + ", infoList=" + this.f12746a + ", btnUiModel=" + this.b + Separators.RPAREN;
    }
}
