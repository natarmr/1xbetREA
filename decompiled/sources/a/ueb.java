package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ueb {
    public static final teb Companion = new teb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f35517a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Long h;
    public final Boolean i;
    public final Boolean j;
    public final Long k;
    public final Integer l;

    public /* synthetic */ ueb(int i, Long l, String str, String str2, String str3, String str4, Integer num, String str5, Long l2, Boolean bool, Boolean bool2, Long l3, Integer num2) {
        if ((i & 1) == 0) {
            this.f35517a = null;
        } else {
            this.f35517a = l;
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
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueb)) {
            return false;
        }
        ueb uebVar = (ueb) obj;
        return Intrinsics.d(this.f35517a, uebVar.f35517a) && Intrinsics.d(this.b, uebVar.b) && Intrinsics.d(this.c, uebVar.c) && Intrinsics.d(this.d, uebVar.d) && Intrinsics.d(this.e, uebVar.e) && Intrinsics.d(this.f, uebVar.f) && Intrinsics.d(this.g, uebVar.g) && Intrinsics.d(this.h, uebVar.h) && Intrinsics.d(this.i, uebVar.i) && Intrinsics.d(this.j, uebVar.j) && Intrinsics.d(this.k, uebVar.k) && Intrinsics.d(this.l, uebVar.l);
    }

    public final int hashCode() {
        Long l = this.f35517a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.k;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.l;
        return iHashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f35517a, "LigaResponse(id=", ", name=", this.b, ", image=");
        f140.v(sbS, this.c, ", altImage=", this.d, ", countryImage=");
        axq.x(this.f, this.e, ", countryId=", ", countryName=", sbS);
        h97.w(this.h, this.g, ", gamesCount=", ", new=", sbS);
        defpackage.c.j(sbS, this.i, ", top=", this.j, ", subSportId=");
        sbS.append(this.k);
        sbS.append(", globalChampId=");
        sbS.append(this.l);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
