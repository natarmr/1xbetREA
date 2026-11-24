package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j8n0 {
    public static final i8n0 Companion = new i8n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16093a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ j8n0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f16093a = null;
        } else {
            this.f16093a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8n0)) {
            return false;
        }
        j8n0 j8n0Var = (j8n0) obj;
        return Intrinsics.d(this.f16093a, j8n0Var.f16093a) && Intrinsics.d(this.b, j8n0Var.b) && Intrinsics.d(this.c, j8n0Var.c) && Intrinsics.d(this.d, j8n0Var.d) && Intrinsics.d(this.e, j8n0Var.e) && Intrinsics.d(this.f, j8n0Var.f) && Intrinsics.d(this.g, j8n0Var.g) && Intrinsics.d(this.h, j8n0Var.h);
    }

    public final int hashCode() {
        String str = this.f16093a;
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
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SubscriptionMatchInfoObjResponse(matchFormat=", this.f16093a, ", tournamentStage=", this.b, ", seedNum1=");
        f140.v(sbN, this.c, ", seedNum2=", this.d, ", location=");
        f140.v(sbN, this.e, ", locationCountry=", this.f, ", stadiumId=");
        return ua80.m(sbN, this.g, ", surface=", this.h, Separators.RPAREN);
    }
}
