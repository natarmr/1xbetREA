package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pq4 {
    public static final oq4 Companion = new oq4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27397a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Integer g;
    public final Long h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final String m;
    public final Integer n;
    public final String o;
    public final Integer p;

    public /* synthetic */ pq4(int i, String str, String str2, String str3, String str4, Long l, Long l2, Integer num, Long l3, String str5, Integer num2, String str6, String str7, String str8, Integer num3, String str9, Integer num4) {
        if ((i & 1) == 0) {
            this.f27397a = null;
        } else {
            this.f27397a = str;
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
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str8;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num3;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str9;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq4)) {
            return false;
        }
        pq4 pq4Var = (pq4) obj;
        return Intrinsics.d(this.f27397a, pq4Var.f27397a) && Intrinsics.d(this.b, pq4Var.b) && Intrinsics.d(this.c, pq4Var.c) && Intrinsics.d(this.d, pq4Var.d) && Intrinsics.d(this.e, pq4Var.e) && Intrinsics.d(this.f, pq4Var.f) && Intrinsics.d(this.g, pq4Var.g) && Intrinsics.d(this.h, pq4Var.h) && Intrinsics.d(this.i, pq4Var.i) && Intrinsics.d(this.j, pq4Var.j) && Intrinsics.d(this.k, pq4Var.k) && Intrinsics.d(this.l, pq4Var.l) && Intrinsics.d(this.m, pq4Var.m) && Intrinsics.d(this.n, pq4Var.n) && Intrinsics.d(this.o, pq4Var.o) && Intrinsics.d(this.p, pq4Var.p);
    }

    public final int hashCode() {
        String str = this.f27397a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.j;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.n;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num4 = this.p;
        return iHashCode15 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthenticatorNotificationV2Response(appGuid=", this.f27397a, ", pemPublicKey=", this.b, ", iv=");
        f140.v(sbN, this.c, ", code=", this.d, ", createdSecAt=");
        cs0.A(sbN, this.e, ", expiredSecAt=", this.f, ", expiryTimeSec=");
        cs0.w(this.g, this.h, ", completedSecAt=", ", ip=", sbN);
        axq.x(this.j, this.i, ", operatingSystemId=", ", operationSystem=", sbN);
        f140.v(sbN, this.k, ", location=", this.l, ", operationApprovalId=");
        axq.x(this.n, this.m, ", operationType=", ", randomString=", sbN);
        return vqd.l(this.p, this.o, ", status=", Separators.RPAREN, sbN);
    }
}
