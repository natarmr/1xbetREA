package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xfq {
    public static final wfq Companion = new wfq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40803a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final String i;
    public final Boolean j;
    public final ffq k;

    public /* synthetic */ xfq(int i, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, Integer num3, String str6, Boolean bool, ffq ffqVar) {
        if ((i & 1) == 0) {
            this.f40803a = null;
        } else {
            this.f40803a = str;
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
            this.d = num;
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
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = ffqVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfq)) {
            return false;
        }
        xfq xfqVar = (xfq) obj;
        return Intrinsics.d(this.f40803a, xfqVar.f40803a) && Intrinsics.d(this.b, xfqVar.b) && Intrinsics.d(this.c, xfqVar.c) && Intrinsics.d(this.d, xfqVar.d) && Intrinsics.d(this.e, xfqVar.e) && Intrinsics.d(this.f, xfqVar.f) && Intrinsics.d(this.g, xfqVar.g) && Intrinsics.d(this.h, xfqVar.h) && Intrinsics.d(this.i, xfqVar.i) && Intrinsics.d(this.j, xfqVar.j) && Intrinsics.d(this.k, xfqVar.k);
    }

    public final int hashCode() {
        String str = this.f40803a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        ffq ffqVar = this.k;
        return iHashCode10 + (ffqVar != null ? ffqVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FirebaseEntity(name=", this.f40803a, ", iss=", this.b, ", aud=");
        axq.x(this.d, this.c, ", authTime=", ", userId=", sbN);
        f140.v(sbN, this.e, ", sub=", this.f, ", iat=");
        rz4.y(sbN, this.g, ", exp=", this.h, ", email=");
        h97.v(this.j, this.i, ", emailVerified=", ", firebase=", sbN);
        sbN.append(this.k);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
