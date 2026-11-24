package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class cz00 extends az00 {
    public final boolean b;
    public final Pair c;
    public final d310 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public cz00(boolean z, Pair pair, d310 d310Var) {
        d310 d310Var2 = d310.RADIANT;
        super((d310Var == d310Var2 && z) ? R.drawable.cyber_lol_barak_radiant_active_ic : ((d310Var != d310Var2 || z) && d310Var == d310.DIRE && z) ? R.drawable.cyber_lol_barak_dire_active_ic : R.drawable.cyber_lol_barak_unactive_ic);
        this.b = z;
        this.c = pair;
        this.d = d310Var;
    }

    @Override // a.az00
    public final Pair a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz00)) {
            return false;
        }
        cz00 cz00Var = (cz00) obj;
        return this.b == cz00Var.b && Intrinsics.d(this.c, cz00Var.c) && this.d == cz00Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "LolBuildingBarrack(active=" + this.b + ", position=" + this.c + ", race=" + this.d + Separators.RPAREN;
    }
}
