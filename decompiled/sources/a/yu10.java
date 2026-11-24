package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class yu10 {
    public static final xu10 Companion = new xu10();
    public static final a8z[] j = {null, null, null, maz.a(wez.f39042a, new gf10(28)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43247a;
    public final Long b;
    public final Boolean c;
    public final List d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final String h;
    public final String i;

    public /* synthetic */ yu10(int i, Long l, Long l2, Boolean bool, List list, String str, String str2, Boolean bool2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f43247a = null;
        } else {
            this.f43247a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu10)) {
            return false;
        }
        yu10 yu10Var = (yu10) obj;
        return Intrinsics.d(this.f43247a, yu10Var.f43247a) && Intrinsics.d(this.b, yu10Var.b) && Intrinsics.d(this.c, yu10Var.c) && Intrinsics.d(this.d, yu10Var.d) && Intrinsics.d(this.e, yu10Var.e) && Intrinsics.d(this.f, yu10Var.f) && Intrinsics.d(this.g, yu10Var.g) && Intrinsics.d(this.h, yu10Var.h) && Intrinsics.d(this.i, yu10Var.i);
    }

    public final int hashCode() {
        Long l = this.f43247a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f43247a, this.b, "MainFeedLiveSportsResponse(id=", ", gamesCount=", ", isNew=");
        sbO.append(this.c);
        sbO.append(", tabs=");
        sbO.append(this.d);
        sbO.append(", name=");
        f140.v(sbO, this.e, ", nameEng=", this.f, ", isCyber=");
        defpackage.c.h(this.g, ", timeName=", this.h, ", timesName=", sbO);
        return axq.n(sbO, this.i, Separators.RPAREN);
    }
}
