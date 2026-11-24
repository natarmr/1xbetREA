package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class llr {
    public static final ykr Companion = new ykr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20262a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final Long k;

    public /* synthetic */ llr(int i, Integer num, String str, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4, String str5, Integer num5, Long l) {
        if ((i & 1) == 0) {
            this.f20262a = null;
        } else {
            this.f20262a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llr)) {
            return false;
        }
        llr llrVar = (llr) obj;
        return Intrinsics.d(this.f20262a, llrVar.f20262a) && Intrinsics.d(this.b, llrVar.b) && Intrinsics.d(this.c, llrVar.c) && Intrinsics.d(this.d, llrVar.d) && Intrinsics.d(this.e, llrVar.e) && Intrinsics.d(this.f, llrVar.f) && Intrinsics.d(this.g, llrVar.g) && Intrinsics.d(this.h, llrVar.h) && Intrinsics.d(this.i, llrVar.i) && Intrinsics.d(this.j, llrVar.j) && Intrinsics.d(this.k, llrVar.k);
    }

    public final int hashCode() {
        Integer num = this.f20262a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num5 = this.j;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.k;
        return iHashCode10 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f20262a, "Game(dateStart=", ", gameId=", this.b, ", score1=");
        rz4.y(sbN, this.c, ", score2=", this.d, ", status=");
        b1j.u(this.e, ", team1=", this.f, ", team2=", sbN);
        f140.v(sbN, this.g, ", stringScore1=", this.h, ", stringScore2=");
        axq.x(this.j, this.i, ", winner=", ", feedGameId=", sbN);
        return ohs0.r(sbN, this.k, Separators.RPAREN);
    }
}
