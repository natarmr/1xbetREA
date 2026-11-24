package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class zjk0 {
    public static final yjk0 Companion = new yjk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44485a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ zjk0(int i, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f44485a = null;
        } else {
            this.f44485a = str;
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
            this.d = str3;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjk0)) {
            return false;
        }
        zjk0 zjk0Var = (zjk0) obj;
        return Intrinsics.d(this.f44485a, zjk0Var.f44485a) && Intrinsics.d(this.b, zjk0Var.b) && Intrinsics.d(this.c, zjk0Var.c) && Intrinsics.d(this.d, zjk0Var.d) && Intrinsics.d(this.e, zjk0Var.e) && Intrinsics.d(this.f, zjk0Var.f) && Intrinsics.d(this.g, zjk0Var.g) && Intrinsics.d(this.h, zjk0Var.h) && Intrinsics.d(this.i, zjk0Var.i);
    }

    public final int hashCode() {
        String str = this.f44485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RequestPayload(appGuid=", this.f44485a, ", bundleId=", this.b, ", whence=");
        b1j.u(this.c, ", os=", this.d, ", osVersion=", sbN);
        f140.v(sbN, this.e, ", language=", this.f, ", accessToken=");
        f140.v(sbN, this.g, ", reconnectionToken=", this.h, ", lastReceivedMessageId=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }

    public zjk0(String str, String str2, String str3, String str4, String str5) {
        String str6 = Build.VERSION.RELEASE;
        this.f44485a = str;
        this.b = "org.xbet.client1";
        this.c = 22;
        this.d = "Android";
        this.e = str6;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }
}
