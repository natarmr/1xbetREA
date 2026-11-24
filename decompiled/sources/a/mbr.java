package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mbr {
    public static final kbr Companion = new kbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21521a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ mbr(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if ((i & 1) == 0) {
            this.f21521a = null;
        } else {
            this.f21521a = str;
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbr)) {
            return false;
        }
        mbr mbrVar = (mbr) obj;
        return Intrinsics.d(this.f21521a, mbrVar.f21521a) && Intrinsics.d(this.b, mbrVar.b) && Intrinsics.d(this.c, mbrVar.c) && Intrinsics.d(this.d, mbrVar.d) && Intrinsics.d(this.e, mbrVar.e) && Intrinsics.d(this.f, mbrVar.f) && Intrinsics.d(this.g, mbrVar.g) && Intrinsics.d(this.h, mbrVar.h) && Intrinsics.d(this.i, mbrVar.i);
    }

    public final int hashCode() {
        String str = this.f21521a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FullMatchInfoResponse(tournamentStage=", this.f21521a, ", location=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", seriesScore=", this.d, ", seedNum1=");
        f140.v(sbN, this.e, ", seedNum2=", this.f, ", locationCity=");
        f140.v(sbN, this.g, ", stadiumId=", this.h, ", surface=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
