package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class urh {
    public static final trh Companion = new trh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36162a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Float h;
    public final Float i;
    public final Float j;
    public final Float k;
    public final Float l;
    public final String m;

    public /* synthetic */ urh(int i, Long l, String str, String str2, String str3, String str4, String str5, Long l2, Float f, Float f2, Float f3, Float f4, Float f5, String str6) {
        if ((i & 1) == 0) {
            this.f36162a = null;
        } else {
            this.f36162a = l;
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
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = f5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urh)) {
            return false;
        }
        urh urhVar = (urh) obj;
        return Intrinsics.d(this.f36162a, urhVar.f36162a) && Intrinsics.d(this.b, urhVar.b) && Intrinsics.d(this.c, urhVar.c) && Intrinsics.d(this.d, urhVar.d) && Intrinsics.d(this.e, urhVar.e) && Intrinsics.d(this.f, urhVar.f) && Intrinsics.d(this.g, urhVar.g) && Intrinsics.d(this.h, urhVar.h) && Intrinsics.d(this.i, urhVar.i) && Intrinsics.d(this.j, urhVar.j) && Intrinsics.d(this.k, urhVar.k) && Intrinsics.d(this.l, urhVar.l) && Intrinsics.d(this.m, urhVar.m);
    }

    public final int hashCode() {
        Long l = this.f36162a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.h;
        int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.i;
        int iHashCode9 = (iHashCode8 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.j;
        int iHashCode10 = (iHashCode9 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.k;
        int iHashCode11 = (iHashCode10 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.l;
        int iHashCode12 = (iHashCode11 + (f5 == null ? 0 : f5.hashCode())) * 31;
        String str6 = this.m;
        return iHashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f36162a, "CyberValorantPlayersResponse(id=", ", name=", this.b, ", realName=");
        f140.v(sbS, this.c, ", country=", this.d, ", region=");
        f140.v(sbS, this.e, ", image=", this.f, ", birthdayStamp=");
        sbS.append(this.g);
        sbS.append(", avgCombatScore=");
        sbS.append(this.h);
        sbS.append(", avgKills=");
        vqd.x(sbS, this.i, ", avgDeaths=", this.j, ", avgFirstKills=");
        vqd.x(sbS, this.k, ", avgHeadshots=", this.l, ", countryImageS3=");
        return axq.n(sbS, this.m, Separators.RPAREN);
    }
}
