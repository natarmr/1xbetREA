package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class dlt {
    public static final clt Companion = new clt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6300a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Long f;
    public final Integer g;

    public /* synthetic */ dlt(int i, String str, String str2, String str3, String str4, Integer num, Long l, Integer num2) {
        if ((i & 1) == 0) {
            this.f6300a = null;
        } else {
            this.f6300a = str;
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
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlt)) {
            return false;
        }
        dlt dltVar = (dlt) obj;
        return Intrinsics.d(this.f6300a, dltVar.f6300a) && Intrinsics.d(this.b, dltVar.b) && Intrinsics.d(this.c, dltVar.c) && Intrinsics.d(this.d, dltVar.d) && Intrinsics.d(this.e, dltVar.e) && Intrinsics.d(this.f, dltVar.f) && Intrinsics.d(this.g, dltVar.g);
    }

    public final int hashCode() {
        String str = this.f6300a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GeoIpInfoResponse(countryCode=", this.f6300a, ", countryName=", this.b, ", regionName=");
        f140.v(sbN, this.c, ", cityName=", this.d, ", countryId=");
        cs0.w(this.e, this.f, ", regionId=", ", cityId=", sbN);
        return dw9.q(sbN, this.g, Separators.RPAREN);
    }
}
