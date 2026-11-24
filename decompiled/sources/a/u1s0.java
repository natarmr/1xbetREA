package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class u1s0 {
    public static final t1s0 Companion = new t1s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34915a;
    public final Long b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ u1s0(int i, Integer num, Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f34915a = null;
        } else {
            this.f34915a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1s0)) {
            return false;
        }
        u1s0 u1s0Var = (u1s0) obj;
        return Intrinsics.d(this.f34915a, u1s0Var.f34915a) && Intrinsics.d(this.b, u1s0Var.b) && Intrinsics.d(this.c, u1s0Var.c) && Intrinsics.d(this.d, u1s0Var.d) && Intrinsics.d(this.e, u1s0Var.e) && Intrinsics.d(this.f, u1s0Var.f) && Intrinsics.d(this.g, u1s0Var.g) && Intrinsics.d(this.h, u1s0Var.h) && Intrinsics.d(this.i, u1s0Var.i) && Intrinsics.d(this.j, u1s0Var.j) && Intrinsics.d(this.k, u1s0Var.k);
    }

    public final int hashCode() {
        Integer num = this.f34915a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f34915a, this.b, "TournamentInfoResponse(eventId=", ", tournamentFeedId=", ", name=");
        h97.w(this.d, this.c, ", startTime=", ", countryImage=", sbM);
        f140.v(sbM, this.e, ", status=", this.f, ", city=");
        f140.v(sbM, this.g, ", state=", this.h, ", country=");
        f140.v(sbM, this.i, ", triCode=", this.j, ", venue=");
        return axq.n(sbM, this.k, Separators.RPAREN);
    }
}
