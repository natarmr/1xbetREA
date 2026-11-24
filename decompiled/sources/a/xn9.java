package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xn9 {
    public static final wn9 Companion = new wn9();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new mn9(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41163a;
    public final Boolean b;
    public final Boolean c;
    public final List d;

    public /* synthetic */ xn9(int i, String str, Boolean bool, Boolean bool2, List list) {
        if ((i & 1) == 0) {
            this.f41163a = null;
        } else {
            this.f41163a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn9)) {
            return false;
        }
        xn9 xn9Var = (xn9) obj;
        return Intrinsics.d(this.f41163a, xn9Var.f41163a) && Intrinsics.d(this.b, xn9Var.b) && Intrinsics.d(this.c, xn9Var.c) && Intrinsics.d(this.d, xn9Var.d);
    }

    public final int hashCode() {
        String str = this.f41163a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CalendarTournamentRoundPlayoffResponse(name=" + this.f41163a + ", isThirdPlace=" + this.b + ", isGrandFinal=" + this.c + ", matches=" + this.d + Separators.RPAREN;
    }
}
