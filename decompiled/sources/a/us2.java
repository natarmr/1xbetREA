package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class us2 {
    public static final ts2 Companion = new ts2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36189a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    public /* synthetic */ us2(int i, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        if ((i & 1) == 0) {
            this.f36189a = null;
        } else {
            this.f36189a = str;
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
            this.f = num3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us2)) {
            return false;
        }
        us2 us2Var = (us2) obj;
        return Intrinsics.d(this.f36189a, us2Var.f36189a) && Intrinsics.d(this.b, us2Var.b) && Intrinsics.d(this.c, us2Var.c) && Intrinsics.d(this.d, us2Var.d) && Intrinsics.d(this.e, us2Var.e) && Intrinsics.d(this.f, us2Var.f) && Intrinsics.d(this.g, us2Var.g) && Intrinsics.d(this.h, us2Var.h) && Intrinsics.d(this.i, us2Var.i) && Intrinsics.d(this.j, us2Var.j);
    }

    public final int hashCode() {
        String str = this.f36189a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.h;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.i;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.j;
        return iHashCode9 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AnalyticEventAttributes(gameId=", this.f36189a, ", uniqHash=", this.b, ", applicationId=");
        axq.x(this.d, this.c, ", entryPoint=", ", type=", sbN);
        rz4.y(sbN, this.e, ", subType=", this.f, ", cyberType=");
        rz4.y(sbN, this.g, ", xGroup=", this.h, ", champId=");
        return ua80.l(sbN, this.i, ", sportId=", this.j, Separators.RPAREN);
    }

    public us2(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.f36189a = str;
        this.b = str2;
        this.c = "org.xbet.client1";
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = num5;
        this.i = num6;
        this.j = num7;
    }
}
