package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hkk0 {
    public static final gkk0 Companion = new gkk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13214a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final String g;
    public final Long h;

    public /* synthetic */ hkk0(int i, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f13214a = null;
        } else {
            this.f13214a = str;
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
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkk0)) {
            return false;
        }
        hkk0 hkk0Var = (hkk0) obj;
        return Intrinsics.d(this.f13214a, hkk0Var.f13214a) && Intrinsics.d(this.b, hkk0Var.b) && Intrinsics.d(this.c, hkk0Var.c) && Intrinsics.d(this.d, hkk0Var.d) && Intrinsics.d(this.e, hkk0Var.e) && Intrinsics.d(this.f, hkk0Var.f) && Intrinsics.d(this.g, hkk0Var.g) && Intrinsics.d(this.h, hkk0Var.h);
    }

    public final int hashCode() {
        String str = this.f13214a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.h;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ResponsePayload(operationApprovalGuid=", this.f13214a, ", token=", this.b, ", deviceName=");
        axq.x(this.d, this.c, ", pushExpiry=", ", error=", sbN);
        axq.x(this.f, this.e, ", errorCode=", ", reconnectionToken=", sbN);
        sbN.append(this.g);
        sbN.append(", expiredAt=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
