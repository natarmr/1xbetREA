package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ina implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrj0 f15064a;
    public final imo b;
    public final ao8 c;

    public ina(xrj0 xrj0Var, imo imoVar, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        this.f15064a = xrj0Var;
        this.b = imoVar;
        this.c = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ina)) {
            return false;
        }
        ina inaVar = (ina) obj;
        dja djaVar = dja.PENALTY;
        return this.f15064a.equals(inaVar.f15064a) && Intrinsics.d(this.b, inaVar.b) && this.c.equals(inaVar.c);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.SHORT_STATISTIC;
    }

    public final int hashCode() {
        int iHashCode = (this.f15064a.hashCode() + (dja.SHORT_STATISTIC.hashCode() * 31)) * 31;
        imo imoVar = this.b;
        return this.c.hashCode() + ((iHashCode + (imoVar == null ? 0 : imoVar.hashCode())) * 31);
    }

    public final String toString() {
        return "CardShortStatisticUiModel(type=" + dja.SHORT_STATISTIC + ", shortInfoUiModel=" + this.f15064a + ", btnUiModel=" + this.b + ", bottomInfoUiModel=" + this.c + Separators.RPAREN;
    }
}
