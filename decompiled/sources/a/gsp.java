package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gsp {
    public static final fsp Companion = new fsp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11840a;
    public final String b;
    public final String c;
    public final lre d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final luj0 m;
    public final qfv n;

    public /* synthetic */ gsp(int i, String str, String str2, String str3, lre lreVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, luj0 luj0Var, qfv qfvVar) {
        if ((i & 1) == 0) {
            this.f11840a = null;
        } else {
            this.f11840a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lreVar;
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
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str10;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str11;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = luj0Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = qfvVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsp)) {
            return false;
        }
        gsp gspVar = (gsp) obj;
        return Intrinsics.d(this.f11840a, gspVar.f11840a) && Intrinsics.d(this.b, gspVar.b) && Intrinsics.d(this.c, gspVar.c) && Intrinsics.d(this.d, gspVar.d) && Intrinsics.d(this.e, gspVar.e) && Intrinsics.d(this.f, gspVar.f) && Intrinsics.d(this.g, gspVar.g) && Intrinsics.d(this.h, gspVar.h) && Intrinsics.d(this.i, gspVar.i) && Intrinsics.d(this.j, gspVar.j) && Intrinsics.d(this.k, gspVar.k) && Intrinsics.d(this.l, gspVar.l) && Intrinsics.d(this.m, gspVar.m) && Intrinsics.d(this.n, gspVar.n);
    }

    public final int hashCode() {
        String str = this.f11840a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        lre lreVar = this.d;
        int iHashCode4 = (iHashCode3 + (lreVar == null ? 0 : lreVar.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        luj0 luj0Var = this.m;
        int iHashCode13 = (iHashCode12 + (luj0Var == null ? 0 : luj0Var.hashCode())) * 31;
        qfv qfvVar = this.n;
        return iHashCode13 + (qfvVar != null ? qfvVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FightCardResponse(opponentId=", this.f11840a, ", nickname=", this.b, ", imageUrl=");
        sbN.append(this.c);
        sbN.append(", country=");
        sbN.append(this.d);
        sbN.append(", record=");
        f140.v(sbN, this.e, ", knockout=", this.f, ", painTechniques=");
        f140.v(sbN, this.g, ", judgment=", this.h, ", height=");
        f140.v(sbN, this.i, ", weight=", this.j, ", armSpan=");
        f140.v(sbN, this.k, ", legSpan=", this.l, ", significantHits=");
        sbN.append(this.m);
        sbN.append(", grappling=");
        sbN.append(this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
