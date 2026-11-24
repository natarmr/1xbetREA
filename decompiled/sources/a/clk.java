package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class clk implements iqg {
    public static final blk Companion = new blk();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4564a;
    public final String b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, null, maz.a(wezVar, new rtj((byte) 10)), maz.a(wezVar, new rtj((byte) 11))};
    }

    public /* synthetic */ clk(int i, String str, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f4564a = null;
        } else {
            this.f4564a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clk)) {
            return false;
        }
        clk clkVar = (clk) obj;
        return Intrinsics.d(this.f4564a, clkVar.f4564a) && Intrinsics.d(this.b, clkVar.b) && Intrinsics.d(this.c, clkVar.c) && Intrinsics.d(this.d, clkVar.d);
    }

    public final int hashCode() {
        String str = this.f4564a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return kng0.n(", roundsList=", Separators.RPAREN, b1j.n("DiceResponse(playersTurn=", this.f4564a, ", matchState=", this.b, ", dicesOnTable="), this.c, this.d);
    }

    public clk() {
        this.f4564a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
