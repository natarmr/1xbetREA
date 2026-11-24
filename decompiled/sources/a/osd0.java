package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class osd0 {
    public static final nsd0 Companion = new nsd0();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new cbc0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25779a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ osd0(int i, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f25779a = null;
        } else {
            this.f25779a = l;
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
            this.d = str3;
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
        if (!(obj instanceof osd0)) {
            return false;
        }
        osd0 osd0Var = (osd0) obj;
        return Intrinsics.d(this.f25779a, osd0Var.f25779a) && Intrinsics.d(this.b, osd0Var.b) && Intrinsics.d(this.c, osd0Var.c) && Intrinsics.d(this.d, osd0Var.d) && Intrinsics.d(this.e, osd0Var.e);
    }

    public final int hashCode() {
        Long l = this.f25779a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f25779a, "RaceStatisticResponse(dateStart=", ", hippodrome=", this.b, ", title=");
        f140.v(sbS, this.c, ", result=", this.d, ", description=");
        return dw9.r(sbS, this.e, Separators.RPAREN);
    }
}
