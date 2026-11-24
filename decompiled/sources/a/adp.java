package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class adp {
    public static final zcp Companion = new zcp();
    public static final a8z[] k = {null, null, null, null, null, null, maz.a(wez.f39042a, new r4p(29)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f690a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Integer f;
    public final List g;
    public final Integer h;
    public final Boolean i;
    public final String j;

    public /* synthetic */ adp(int i, Long l, String str, Long l2, Long l3, String str2, Integer num, List list, Integer num2, Boolean bool, String str3) {
        if ((i & 1) == 0) {
            this.f690a = null;
        } else {
            this.f690a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adp)) {
            return false;
        }
        adp adpVar = (adp) obj;
        return Intrinsics.d(this.f690a, adpVar.f690a) && Intrinsics.d(this.b, adpVar.b) && Intrinsics.d(this.c, adpVar.c) && Intrinsics.d(this.d, adpVar.d) && Intrinsics.d(this.e, adpVar.e) && Intrinsics.d(this.f, adpVar.f) && Intrinsics.d(this.g, adpVar.g) && Intrinsics.d(this.h, adpVar.h) && Intrinsics.d(this.i, adpVar.i) && Intrinsics.d(this.j, adpVar.j);
    }

    public final int hashCode() {
        Long l = this.f690a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.j;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f690a, "FavoriteTeamResponse(id=", ", name=", this.b, ", sportId=");
        cs0.A(sbS, this.c, ", subSportId=", this.d, ", sportName=");
        axq.x(this.f, this.e, ", cyberType=", ", images=", sbS);
        sbS.append(this.g);
        sbS.append(", gamesCount=");
        sbS.append(this.h);
        sbS.append(", hasLiveGame=");
        sbS.append(this.i);
        sbS.append(", statId=");
        sbS.append(this.j);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
