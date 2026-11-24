package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tjk0 {
    public static final sjk0 Companion = new sjk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34052a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public /* synthetic */ tjk0(int i, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f34052a = null;
        } else {
            this.f34052a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjk0)) {
            return false;
        }
        tjk0 tjk0Var = (tjk0) obj;
        return Intrinsics.d(this.f34052a, tjk0Var.f34052a) && Intrinsics.d(this.b, tjk0Var.b) && Intrinsics.d(this.c, tjk0Var.c) && Intrinsics.d(this.d, tjk0Var.d) && Intrinsics.d(this.e, tjk0Var.e) && Intrinsics.d(this.f, tjk0Var.f) && Intrinsics.d(this.g, tjk0Var.g) && Intrinsics.d(this.h, tjk0Var.h) && Intrinsics.d(this.i, tjk0Var.i) && Intrinsics.d(this.j, tjk0Var.j);
    }

    public final int hashCode() {
        String str = this.f34052a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iB = ua80.b((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.h);
        String str6 = this.i;
        int iHashCode7 = (iB + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RequestPayload(appGuid=", this.f34052a, ", bundleId=", this.b, ", referral=");
        rz4.y(sbN, this.c, ", whence=", this.d, ", os=");
        f140.v(sbN, this.e, ", osVersion=", this.f, ", language=");
        f140.v(sbN, this.g, ", accessToken=", this.h, ", reconnectionToken=");
        return ua80.m(sbN, this.i, ", lastReceivedMessageId=", this.j, Separators.RPAREN);
    }

    public tjk0(String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        this.f34052a = str;
        this.b = "org.xbet.client1";
        this.c = 1;
        this.d = 22;
        this.e = "Android";
        this.f = str5;
        this.g = str2;
        this.h = "";
        this.i = str3;
        this.j = str4;
    }
}
