package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nba implements iqg {
    public static final mba Companion = new mba();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23231a;
    public final Integer b;
    public final Integer c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, null, null, maz.a(wezVar, new mn9((byte) 16)), maz.a(wezVar, new mn9((byte) 17))};
    }

    public /* synthetic */ nba(int i, Integer num, Integer num2, Integer num3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f23231a = null;
        } else {
            this.f23231a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nba)) {
            return false;
        }
        nba nbaVar = (nba) obj;
        return Intrinsics.d(this.f23231a, nbaVar.f23231a) && Intrinsics.d(this.b, nbaVar.b) && Intrinsics.d(this.c, nbaVar.c) && Intrinsics.d(this.d, nbaVar.d) && Intrinsics.d(this.e, nbaVar.e);
    }

    public final int hashCode() {
        Integer num = this.f23231a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("CardBasketballResponse(gameStatus=", this.f23231a, ", firstPlayerCards=", this.b, ", secondPlayerCards=");
        cs0.z(sbQ, this.c, ", firstPlayerInfo=", this.d, ", secondPlayerInfo=");
        return dw9.r(sbQ, this.e, Separators.RPAREN);
    }

    public nba() {
        this.f23231a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
