package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wt10 {
    public static final vt10 Companion = new vt10();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new gf10(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39717a;
    public final String b;
    public final String c;
    public final Integer d;
    public final List e;

    public /* synthetic */ wt10(int i, Integer num, Long l, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f39717a = null;
        } else {
            this.f39717a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt10)) {
            return false;
        }
        wt10 wt10Var = (wt10) obj;
        return Intrinsics.d(this.f39717a, wt10Var.f39717a) && Intrinsics.d(this.b, wt10Var.b) && Intrinsics.d(this.c, wt10Var.c) && Intrinsics.d(this.d, wt10Var.d) && Intrinsics.d(this.e, wt10Var.e);
    }

    public final int hashCode() {
        Long l = this.f39717a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f39717a, "CountriesResponse(id=", ", name=", this.b, ", image=");
        axq.x(this.d, this.c, ", gamesCount=", ", ligas=", sbS);
        return dw9.r(sbS, this.e, Separators.RPAREN);
    }
}
