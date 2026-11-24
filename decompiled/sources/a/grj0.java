package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class grj0 {
    public static final frj0 Companion = new frj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11781a;
    public final String b;
    public final Long c;
    public final String d;
    public final Long e;
    public final Integer f;
    public final Integer g;
    public final Boolean h;

    public /* synthetic */ grj0(int i, String str, String str2, Long l, String str3, Long l2, Integer num, Integer num2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f11781a = null;
        } else {
            this.f11781a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grj0)) {
            return false;
        }
        grj0 grj0Var = (grj0) obj;
        return Intrinsics.d(this.f11781a, grj0Var.f11781a) && Intrinsics.d(this.b, grj0Var.b) && Intrinsics.d(this.c, grj0Var.c) && Intrinsics.d(this.d, grj0Var.d) && Intrinsics.d(this.e, grj0Var.e) && Intrinsics.d(this.f, grj0Var.f) && Intrinsics.d(this.g, grj0Var.g) && Intrinsics.d(this.h, grj0Var.h);
    }

    public final int hashCode() {
        String str = this.f11781a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ShortGameResponseBody(team1=", this.f11781a, ", team2=", this.b, ", dateStart=");
        rz4.v(this.c, ", tournamentTitle=", this.d, ", champId=", sbN);
        brm0.A(this.f, this.e, ", winner=", ", status=", sbN);
        sbN.append(this.g);
        sbN.append(", headLine=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
