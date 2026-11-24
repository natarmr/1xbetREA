package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oqh f27416a;
    public final xph b;
    public final eph c;

    public pqh(oqh oqhVar, xph xphVar, eph ephVar) {
        this.f27416a = oqhVar;
        this.b = xphVar;
        this.c = ephVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqh)) {
            return false;
        }
        pqh pqhVar = (pqh) obj;
        return Intrinsics.d(this.f27416a, pqhVar.f27416a) && Intrinsics.d(this.b, pqhVar.b) && Intrinsics.d(this.c, pqhVar.c);
    }

    public final int hashCode() {
        oqh oqhVar = this.f27416a;
        int iHashCode = (oqhVar == null ? 0 : oqhVar.hashCode()) * 31;
        xph xphVar = this.b;
        int iHashCode2 = (iHashCode + (xphVar == null ? 0 : xphVar.hashCode())) * 31;
        eph ephVar = this.c;
        return iHashCode2 + (ephVar != null ? ephVar.hashCode() : 0);
    }

    public final String toString() {
        return "CyberUFCStatisticsUiModel(top=" + this.f27416a + ", middle=" + this.b + ", bottom=" + this.c + Separators.RPAREN;
    }

    public /* synthetic */ pqh(oqh oqhVar, xph xphVar, int i) {
        this((i & 1) != 0 ? null : oqhVar, xphVar, (eph) null);
    }
}
