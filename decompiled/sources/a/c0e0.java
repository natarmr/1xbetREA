package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c0e0 {
    public static final b0e0 Companion = new b0e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3521a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Float e;
    public final Integer f;
    public final Float g;
    public final Float h;

    public /* synthetic */ c0e0(int i, Integer num, String str, Integer num2, Integer num3, Float f, Integer num4, Float f2, Float f3) {
        if ((i & 1) == 0) {
            this.f3521a = null;
        } else {
            this.f3521a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = f2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0e0)) {
            return false;
        }
        c0e0 c0e0Var = (c0e0) obj;
        return Intrinsics.d(this.f3521a, c0e0Var.f3521a) && Intrinsics.d(this.b, c0e0Var.b) && Intrinsics.d(this.c, c0e0Var.c) && Intrinsics.d(this.d, c0e0Var.d) && Intrinsics.d(this.e, c0e0Var.e) && Intrinsics.d(this.f, c0e0Var.f) && Intrinsics.d(this.g, c0e0Var.g) && Intrinsics.d(this.h, c0e0Var.h);
    }

    public final int hashCode() {
        Integer num = this.f3521a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.e;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f2 = this.g;
        int iHashCode7 = (iHashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.h;
        return iHashCode7 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f3521a, "RainbowStatisticMatchesMatchTeamPlayerResponse(id=", ", name=", this.b, ", kills=");
        rz4.y(sbN, this.c, ", deaths=", this.d, ", kost=");
        sbN.append(this.e);
        sbN.append(", eps=");
        sbN.append(this.f);
        sbN.append(", kpr=");
        sbN.append(this.g);
        sbN.append(", hs=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
