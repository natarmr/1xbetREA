package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l2s0 {
    public static final k2s0 Companion = new k2s0();
    public static final a8z[] k = {null, null, null, maz.a(wez.f39042a, new yqr0(12)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19328a;
    public final String b;
    public final String c;
    public final d2s0 d;
    public final Integer e;
    public final Integer f;
    public final Float g;
    public final Float h;
    public final String i;
    public final String j;

    public /* synthetic */ l2s0(int i, Long l, String str, String str2, d2s0 d2s0Var, Integer num, Integer num2, Float f, Float f2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f19328a = null;
        } else {
            this.f19328a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2s0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2s0)) {
            return false;
        }
        l2s0 l2s0Var = (l2s0) obj;
        return Intrinsics.d(this.f19328a, l2s0Var.f19328a) && Intrinsics.d(this.b, l2s0Var.b) && Intrinsics.d(this.c, l2s0Var.c) && this.d == l2s0Var.d && Intrinsics.d(this.e, l2s0Var.e) && Intrinsics.d(this.f, l2s0Var.f) && Intrinsics.d(this.g, l2s0Var.g) && Intrinsics.d(this.h, l2s0Var.h) && Intrinsics.d(this.i, l2s0Var.i) && Intrinsics.d(this.j, l2s0Var.j);
    }

    public final int hashCode() {
        Long l = this.f19328a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d2s0 d2s0Var = this.d;
        int iHashCode4 = (iHashCode3 + (d2s0Var == null ? 0 : d2s0Var.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.g;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.h;
        int iHashCode8 = (iHashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f19328a, "TournamentLolFeedStatisticPlayerResponse(id=", ", name=", this.b, ", imageS3=");
        sbS.append(this.c);
        sbS.append(", role=");
        sbS.append(this.d);
        sbS.append(", wins=");
        rz4.y(sbS, this.e, ", loses=", this.f, ", winrate=");
        vqd.x(sbS, this.g, ", kda=", this.h, ", teamName=");
        return ua80.m(sbS, this.i, ", teamImageS3=", this.j, Separators.RPAREN);
    }
}
