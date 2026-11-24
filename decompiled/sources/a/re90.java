package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class re90 {
    public static final pe90 Companion = new pe90();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30325a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;

    public /* synthetic */ re90(int i, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, Integer num3) {
        if ((i & 1) == 0) {
            this.f30325a = null;
        } else {
            this.f30325a = str;
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
            this.h = null;
        } else {
            this.h = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re90)) {
            return false;
        }
        re90 re90Var = (re90) obj;
        return Intrinsics.d(this.f30325a, re90Var.f30325a) && Intrinsics.d(this.b, re90Var.b) && Intrinsics.d(this.c, re90Var.c) && Intrinsics.d(this.d, re90Var.d) && Intrinsics.d(this.e, re90Var.e) && Intrinsics.d(this.f, re90Var.f) && Intrinsics.d(this.g, re90Var.g) && Intrinsics.d(this.h, re90Var.h);
    }

    public final int hashCode() {
        String str = this.f30325a;
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
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.h;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodResponse(score1=", this.f30325a, ", score2=", this.b, ", subScore1=");
        rz4.y(sbN, this.c, ", subScore2=", this.d, ", title=");
        f140.v(sbN, this.e, ", shortTitle=", this.f, ", mapName=");
        return vqd.l(this.h, this.g, ", winner=", Separators.RPAREN, sbN);
    }
}
