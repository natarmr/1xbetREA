package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q3t0 {
    public static final p3t0 Companion = new p3t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28067a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ q3t0(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6) {
        if ((i & 1) == 0) {
            this.f28067a = null;
        } else {
            this.f28067a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
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
            this.h = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3t0)) {
            return false;
        }
        q3t0 q3t0Var = (q3t0) obj;
        return Intrinsics.d(this.f28067a, q3t0Var.f28067a) && Intrinsics.d(this.b, q3t0Var.b) && Intrinsics.d(this.c, q3t0Var.c) && Intrinsics.d(this.d, q3t0Var.d) && Intrinsics.d(this.e, q3t0Var.e) && Intrinsics.d(this.f, q3t0Var.f) && Intrinsics.d(this.g, q3t0Var.g) && Intrinsics.d(this.h, q3t0Var.h);
    }

    public final int hashCode() {
        Long l = this.f28067a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28067a, this.b, "UfcCalendarFighterResponse(fighterID=", ", feedId=", ", feedName=");
        f140.v(sbO, this.c, ", name=", this.d, ", country=");
        f140.v(sbO, this.e, ", countryImageS3=", this.f, ", imageS3=");
        return ua80.m(sbO, this.g, ", imageHeadS3=", this.h, Separators.RPAREN);
    }
}
