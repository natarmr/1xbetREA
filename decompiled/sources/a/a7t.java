package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class a7t {
    public static final z6t Companion = new z6t();
    public static final a8z[] l = {null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new e6t(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f390a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Boolean g;
    public final Boolean h;
    public final Long i;
    public final Long j;
    public final List k;

    public /* synthetic */ a7t(int i, Long l2, String str, String str2, String str3, Long l3, Long l4, Boolean bool, Boolean bool2, Long l5, Long l6, List list) {
        if ((i & 1) == 0) {
            this.f390a = null;
        } else {
            this.f390a = l2;
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
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7t)) {
            return false;
        }
        a7t a7tVar = (a7t) obj;
        return Intrinsics.d(this.f390a, a7tVar.f390a) && Intrinsics.d(this.b, a7tVar.b) && Intrinsics.d(this.c, a7tVar.c) && Intrinsics.d(this.d, a7tVar.d) && Intrinsics.d(this.e, a7tVar.e) && Intrinsics.d(this.f, a7tVar.f) && Intrinsics.d(this.g, a7tVar.g) && Intrinsics.d(this.h, a7tVar.h) && Intrinsics.d(this.i, a7tVar.i) && Intrinsics.d(this.j, a7tVar.j) && Intrinsics.d(this.k, a7tVar.k);
    }

    public final int hashCode() {
        Long l2 = this.f390a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l5 = this.i;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.j;
        int iHashCode10 = (iHashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List list = this.k;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f390a, "LigaResponse(id=", ", name=", this.b, ", image=");
        f140.v(sbS, this.c, ", countryImage=", this.d, ", countryId=");
        cs0.A(sbS, this.e, ", gamesCount=", this.f, ", new=");
        defpackage.c.j(sbS, this.g, ", top=", this.h, ", subSportId=");
        cs0.A(sbS, this.i, ", globalChampId=", this.j, ", games=");
        return dw9.r(sbS, this.k, Separators.RPAREN);
    }
}
