package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vu10 {
    public static final uu10 Companion = new uu10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38032a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final String f;
    public final String g;
    public final Long h;

    public /* synthetic */ vu10(int i, Long l, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, Long l2) {
        if ((i & 1) == 0) {
            this.f38032a = null;
        } else {
            this.f38032a = l;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu10)) {
            return false;
        }
        vu10 vu10Var = (vu10) obj;
        return Intrinsics.d(this.f38032a, vu10Var.f38032a) && Intrinsics.d(this.b, vu10Var.b) && Intrinsics.d(this.c, vu10Var.c) && Intrinsics.d(this.d, vu10Var.d) && Intrinsics.d(this.e, vu10Var.e) && Intrinsics.d(this.f, vu10Var.f) && Intrinsics.d(this.g, vu10Var.g) && Intrinsics.d(this.h, vu10Var.h);
    }

    public final int hashCode() {
        Long l = this.f38032a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.h;
        return iHashCode7 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f38032a, "MainFeedLineSportsResponse(id=", ", name=", this.b, ", nameEng=");
        h97.v(this.d, this.c, ", isCyber=", ", isNew=", sbS);
        defpackage.c.h(this.e, ", timeName=", this.f, ", timesName=", sbS);
        sbS.append(this.g);
        sbS.append(", gamesCount=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
