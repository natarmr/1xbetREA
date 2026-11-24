package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class b440 {
    public static final a440 Companion = new a440();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1940a;
    public final String b;
    public final Integer c;
    public final Long d;
    public final Integer e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Long n;
    public final String o;
    public final String p;
    public final Long q;
    public final Integer r;
    public final Long s;

    public /* synthetic */ b440(int i, String str, String str2, Integer num, Long l, Integer num2, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, String str3, String str4, Long l11, Integer num3, Long l12) {
        if ((i & 1) == 0) {
            this.f1940a = null;
        } else {
            this.f1940a = str;
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
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l8;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l9;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l10;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str4;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = l11;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num3;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = l12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b440)) {
            return false;
        }
        b440 b440Var = (b440) obj;
        return Intrinsics.d(this.f1940a, b440Var.f1940a) && Intrinsics.d(this.b, b440Var.b) && Intrinsics.d(this.c, b440Var.c) && Intrinsics.d(this.d, b440Var.d) && Intrinsics.d(this.e, b440Var.e) && Intrinsics.d(this.f, b440Var.f) && Intrinsics.d(this.g, b440Var.g) && Intrinsics.d(this.h, b440Var.h) && Intrinsics.d(this.i, b440Var.i) && Intrinsics.d(this.j, b440Var.j) && Intrinsics.d(this.k, b440Var.k) && Intrinsics.d(this.l, b440Var.l) && Intrinsics.d(this.m, b440Var.m) && Intrinsics.d(this.n, b440Var.n) && Intrinsics.d(this.o, b440Var.o) && Intrinsics.d(this.p, b440Var.p) && Intrinsics.d(this.q, b440Var.q) && Intrinsics.d(this.r, b440Var.r) && Intrinsics.d(this.s, b440Var.s);
    }

    public final int hashCode() {
        String str = this.f1940a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.h;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.i;
        int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.j;
        int iHashCode10 = (iHashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.k;
        int iHashCode11 = (iHashCode10 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.l;
        int iHashCode12 = (iHashCode11 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.m;
        int iHashCode13 = (iHashCode12 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.n;
        int iHashCode14 = (iHashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.q;
        int iHashCode17 = (iHashCode16 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num3 = this.r;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l12 = this.s;
        return iHashCode18 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MessageExtensionDataResponse(externalURL=", this.f1940a, ", mainSection=", this.b, ", lineLive=");
        cs0.w(this.c, this.d, ", target=", ", cybertype=", sbN);
        cs0.w(this.e, this.f, ", sportId=", ", subSportId=", sbN);
        cs0.A(sbN, this.g, ", champId=", this.h, ", gameId=");
        cs0.A(sbN, this.i, ", aggregatorSubcategoryId=", this.j, ", aggregatorTournamentId=");
        cs0.A(sbN, this.k, ", aggregatorProviderId=", this.l, ", aggregatorBrandId=");
        cs0.A(sbN, this.m, ", aggregatorPartId=", this.n, ", aggregatorSection=");
        f140.v(sbN, this.o, ", promocode=", this.p, ", actionId=");
        brm0.A(this.r, this.q, ", limitType=", ", callbackId=", sbN);
        return ohs0.r(sbN, this.s, Separators.RPAREN);
    }
}
