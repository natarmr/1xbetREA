package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bqr f9781a;
    public final j0g0 b;
    public final qlh c;
    public final Integer d;

    public fmh(bqr bqrVar, j0g0 j0g0Var, qlh qlhVar, Integer num) {
        this.f9781a = bqrVar;
        this.b = j0g0Var;
        this.c = qlhVar;
        this.d = num;
    }

    public static fmh a(fmh fmhVar, bqr bqrVar, j0g0 j0g0Var, qlh qlhVar, Integer num, int i) {
        fmhVar.getClass();
        if ((i & 2) != 0) {
            bqrVar = fmhVar.f9781a;
        }
        if ((i & 4) != 0) {
            j0g0Var = fmhVar.b;
        }
        if ((i & 8) != 0) {
            qlhVar = fmhVar.c;
        }
        if ((i & 16) != 0) {
            num = fmhVar.d;
        }
        fmhVar.getClass();
        bqrVar.getClass();
        return new fmh(bqrVar, j0g0Var, qlhVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmh)) {
            return false;
        }
        fmh fmhVar = (fmh) obj;
        return this.f9781a.equals(fmhVar.f9781a) && Intrinsics.d(this.b, fmhVar.b) && this.c.equals(fmhVar.c) && Intrinsics.d(this.d, fmhVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9781a.hashCode() + (Boolean.hashCode(true) * 31)) * 31;
        j0g0 j0g0Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31)) * 31;
        Integer num = this.d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CyberTournamentBracketStateModel(connected=true, gameBackgroundModel=" + this.f9781a + ", bracketResult=" + this.b + ", selectedMatchModel=" + this.c + ", selectedStageId=" + this.d + Separators.RPAREN;
    }
}
