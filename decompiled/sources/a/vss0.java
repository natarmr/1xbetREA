package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f37968a;
    public final ArrayList b;
    public final ArrayList c;

    public vss0(double d, ArrayList arrayList, ArrayList arrayList2) {
        this.f37968a = d;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vss0)) {
            return false;
        }
        vss0 vss0Var = (vss0) obj;
        return Double.compare(this.f37968a, vss0Var.f37968a) == 0 && this.b.equals(vss0Var.b) && this.c.equals(vss0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, Double.hashCode(this.f37968a) * 31, 31);
    }

    public final String toString() {
        return "TvBetJackpotModel(jackpotSum=" + this.f37968a + ", weeksInfo=" + this.b + ", weeks=" + this.c + Separators.RPAREN;
    }
}
