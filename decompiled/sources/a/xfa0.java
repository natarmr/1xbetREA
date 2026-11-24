package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xfa0 extends zfa0 {
    public static final wfa0 Companion = new wfa0();
    public static final a8z[] d;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new raa0((byte) 13)), maz.a(wezVar, new raa0((byte) 14))};
    }

    public /* synthetic */ xfa0(int i, List list, List list2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, vfa0.f37321a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfa0)) {
            return false;
        }
        xfa0 xfa0Var = (xfa0) obj;
        return Intrinsics.d(this.b, xfa0Var.b) && Intrinsics.d(this.c, xfa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DuelGame(team1Ids=", ", team2Ids=", this.b, Separators.RPAREN, this.c);
    }

    public xfa0(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.b = list;
        this.c = list2;
    }
}
