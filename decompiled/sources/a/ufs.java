package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ufs {
    public static final tfs Companion = new tfs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35589a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ ufs(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.f35589a = null;
        } else {
            this.f35589a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufs)) {
            return false;
        }
        ufs ufsVar = (ufs) obj;
        return Intrinsics.d(this.f35589a, ufsVar.f35589a) && Intrinsics.d(this.b, ufsVar.b) && Intrinsics.d(this.c, ufsVar.c) && Intrinsics.d(this.d, ufsVar.d) && Intrinsics.d(this.e, ufsVar.e) && Intrinsics.d(this.f, ufsVar.f) && Intrinsics.d(this.g, ufsVar.g);
    }

    public final int hashCode() {
        String str = this.f35589a;
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
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GameInfoDataResponse(tournamentStage=", this.f35589a, ", location=", this.b, ", matchFormat=");
        f140.v(sbN, this.c, ", seedNum1=", this.d, ", seedNum2=");
        f140.v(sbN, this.e, ", surface=", this.f, ", stadiumId=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }

    public ufs(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f35589a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
