package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class bz00 extends az00 {
    public final Pair b;
    public final d310 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public bz00(Pair pair, d310 d310Var) {
        int iOrdinal = d310Var.ordinal();
        super(iOrdinal != 0 ? iOrdinal != 1 ? R.drawable.cyber_lol_ancient_unactive_ic : R.drawable.cyber_lol_ancient_dire_ic : R.drawable.cyber_lol_ancient_radiant_ic);
        this.b = pair;
        this.c = d310Var;
    }

    @Override // a.az00
    public final Pair a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz00)) {
            return false;
        }
        bz00 bz00Var = (bz00) obj;
        return Intrinsics.d(this.b, bz00Var.b) && this.c == bz00Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LolBuildingAncients(position=" + this.b + ", race=" + this.c + Separators.RPAREN;
    }
}
