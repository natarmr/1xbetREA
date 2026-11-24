package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class eyt0 {
    public static final dyt0 Companion = new dyt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8643a;
    public final Boolean b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;

    public /* synthetic */ eyt0(int i, String str, Boolean bool, String str2, Integer num, Integer num2, Integer num3, String str3, Integer num4, Integer num5, Integer num6, Integer num7) {
        if ((i & 1) == 0) {
            this.f8643a = null;
        } else {
            this.f8643a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
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
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyt0)) {
            return false;
        }
        eyt0 eyt0Var = (eyt0) obj;
        return Intrinsics.d(this.f8643a, eyt0Var.f8643a) && Intrinsics.d(this.b, eyt0Var.b) && Intrinsics.d(this.c, eyt0Var.c) && Intrinsics.d(this.d, eyt0Var.d) && Intrinsics.d(this.e, eyt0Var.e) && Intrinsics.d(this.f, eyt0Var.f) && Intrinsics.d(this.g, eyt0Var.g) && Intrinsics.d(this.h, eyt0Var.h) && Intrinsics.d(this.i, eyt0Var.i) && Intrinsics.d(this.j, eyt0Var.j) && Intrinsics.d(this.k, eyt0Var.k);
    }

    public final int hashCode() {
        String str = this.f8643a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.k;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValorantPlayerStatisticResponse(name=");
        sb.append(this.f8643a);
        sb.append(", alive=");
        sb.append(this.b);
        sb.append(", agentName=");
        axq.x(this.d, this.c, ", numberOfKills=", ", numberOfAssists=", sb);
        rz4.y(sb, this.e, ", numberOfDeath=", this.f, ", weaponName=");
        axq.x(this.h, this.g, ", numberOfOpenKills=", ", numberOfOpenDeath=", sb);
        rz4.y(sb, this.i, ", numberOfMultiKills=", this.j, ", form=");
        return dw9.q(sb, this.k, Separators.RPAREN);
    }
}
