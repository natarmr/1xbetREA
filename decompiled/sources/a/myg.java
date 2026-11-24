package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class myg {
    public static final lyg Companion = new lyg();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new xng(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22601a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Long f;
    public final List g;

    public /* synthetic */ myg(int i, Long l, String str, String str2, String str3, Integer num, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f22601a = null;
        } else {
            this.f22601a = l;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myg)) {
            return false;
        }
        myg mygVar = (myg) obj;
        return Intrinsics.d(this.f22601a, mygVar.f22601a) && Intrinsics.d(this.b, mygVar.b) && Intrinsics.d(this.c, mygVar.c) && Intrinsics.d(this.d, mygVar.d) && Intrinsics.d(this.e, mygVar.e) && Intrinsics.d(this.f, mygVar.f) && Intrinsics.d(this.g, mygVar.g);
    }

    public final int hashCode() {
        Long l = this.f22601a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f22601a, "CyberGamesCSRankingLeaderBoardTeamsResponse(id=", ", name=", this.b, ", logo=");
        f140.v(sbS, this.c, ", logoS3=", this.d, ", position=");
        cs0.w(this.e, this.f, ", points=", ", champs=", sbS);
        return dw9.r(sbS, this.g, Separators.RPAREN);
    }
}
