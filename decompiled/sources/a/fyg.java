package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fyg {
    public static final eyg Companion = new eyg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10357a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ fyg(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f10357a = null;
        } else {
            this.f10357a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyg)) {
            return false;
        }
        fyg fygVar = (fyg) obj;
        return Intrinsics.d(this.f10357a, fygVar.f10357a) && Intrinsics.d(this.b, fygVar.b) && Intrinsics.d(this.c, fygVar.c) && Intrinsics.d(this.d, fygVar.d) && Intrinsics.d(this.e, fygVar.e) && Intrinsics.d(this.f, fygVar.f);
    }

    public final int hashCode() {
        String str = this.f10357a;
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
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberGamesCSRankingLeaderBoardChampsResponse(name=", this.f10357a, ", image=", this.b, ", champImageS3=");
        f140.v(sbN, this.c, ", place=", this.d, ", lineup=");
        return ua80.m(sbN, this.e, ", relevance=", this.f, Separators.RPAREN);
    }
}
