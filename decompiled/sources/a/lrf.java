package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lrf implements iqg {
    public static final krf Companion = new krf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrf f20529a;
    public final wrf b;
    public final wrf c;

    static {
        vrf vrfVar = wrf.Companion;
        qrf qrfVar = rrf.Companion;
    }

    public /* synthetic */ lrf(int i, rrf rrfVar, wrf wrfVar, wrf wrfVar2) {
        if ((i & 1) == 0) {
            this.f20529a = null;
        } else {
            this.f20529a = rrfVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = wrfVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wrfVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrf)) {
            return false;
        }
        lrf lrfVar = (lrf) obj;
        return Intrinsics.d(this.f20529a, lrfVar.f20529a) && Intrinsics.d(this.b, lrfVar.b) && Intrinsics.d(this.c, lrfVar.c);
    }

    public final int hashCode() {
        rrf rrfVar = this.f20529a;
        int iHashCode = (rrfVar == null ? 0 : rrfVar.hashCode()) * 31;
        wrf wrfVar = this.b;
        int iHashCode2 = (iHashCode + (wrfVar == null ? 0 : wrfVar.hashCode())) * 31;
        wrf wrfVar2 = this.c;
        return iHashCode2 + (wrfVar2 != null ? wrfVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Cs2StatisticMainResponse(cs2Statistic=" + this.f20529a + ", statisticFirstTeam=" + this.b + ", statisticSecondTeam=" + this.c + Separators.RPAREN;
    }

    public lrf() {
        this.f20529a = null;
        this.b = null;
        this.c = null;
    }
}
