package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class w9l implements iqg {
    public static final v9l Companion = new v9l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cng f38785a;
    public final phh b;
    public final phh c;

    static {
        ohh ohhVar = phh.Companion;
        bng bngVar = cng.Companion;
    }

    public /* synthetic */ w9l(int i, cng cngVar, phh phhVar, phh phhVar2) {
        if ((i & 1) == 0) {
            this.f38785a = null;
        } else {
            this.f38785a = cngVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = phhVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = phhVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9l)) {
            return false;
        }
        w9l w9lVar = (w9l) obj;
        return Intrinsics.d(this.f38785a, w9lVar.f38785a) && Intrinsics.d(this.b, w9lVar.b) && Intrinsics.d(this.c, w9lVar.c);
    }

    public final int hashCode() {
        cng cngVar = this.f38785a;
        int iHashCode = (cngVar == null ? 0 : cngVar.hashCode()) * 31;
        phh phhVar = this.b;
        int iHashCode2 = (iHashCode + (phhVar == null ? 0 : phhVar.hashCode())) * 31;
        phh phhVar2 = this.c;
        return iHashCode2 + (phhVar2 != null ? phhVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DotaStatisticMainResponse(dotaStatistic=" + this.f38785a + ", statisticFirstTeam=" + this.b + ", statisticSecondTeam=" + this.c + Separators.RPAREN;
    }

    public w9l() {
        this.f38785a = null;
        this.b = null;
        this.c = null;
    }
}
