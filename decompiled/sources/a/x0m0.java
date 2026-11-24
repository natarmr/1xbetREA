package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class x0m0 {
    public static final w0m0 Companion = new w0m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40077a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Long h;
    public final Integer i;
    public final Integer j;
    public final Long k;

    public /* synthetic */ x0m0(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, Long l, Integer num3, Integer num4, Long l2) {
        if ((i & 1) == 0) {
            this.f40077a = null;
        } else {
            this.f40077a = str;
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
            this.e = num2;
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
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0m0)) {
            return false;
        }
        x0m0 x0m0Var = (x0m0) obj;
        return Intrinsics.d(this.f40077a, x0m0Var.f40077a) && Intrinsics.d(this.b, x0m0Var.b) && Intrinsics.d(this.c, x0m0Var.c) && Intrinsics.d(this.d, x0m0Var.d) && Intrinsics.d(this.e, x0m0Var.e) && Intrinsics.d(this.f, x0m0Var.f) && Intrinsics.d(this.g, x0m0Var.g) && Intrinsics.d(this.h, x0m0Var.h) && Intrinsics.d(this.i, x0m0Var.i) && Intrinsics.d(this.j, x0m0Var.j) && Intrinsics.d(this.k, x0m0Var.k);
    }

    public final int hashCode() {
        String str = this.f40077a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l2 = this.k;
        return iHashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StageNetGameResponse(id=", this.f40077a, ", firstTeamId=", this.b, ", secondTeamId=");
        axq.x(this.d, this.c, ", firstTeamScore=", ", secondTeamScore=", sbN);
        b1j.u(this.e, ", firstTeamStringScore=", this.f, ", secondTeamStringScore=", sbN);
        h97.w(this.h, this.g, ", dataStart=", ", status=", sbN);
        rz4.y(sbN, this.i, ", winner=", this.j, ", feedGameId=");
        return ohs0.r(sbN, this.k, Separators.RPAREN);
    }
}
